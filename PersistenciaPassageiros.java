import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;


public class PersistenciaPassageiros{
    private String FILE_PATH = "passageiros.dat";
    private List<Passageiro> listaPassageiros;
    
    public PersistenciaPassageiros(String path, List<Passageiro> listaPassageiros){
        this.FILE_PATH = path;
        this.listaPassageiros = listaPassageiros;

    }

    public List<Passageiro> carregaPassageiros() throws IOException{
        LinkedList<Motorista> listaPassageiro = new LinkedList<Motorista>();
        try (
            Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ){
            for (CSVRecord csvRecord : csvParser){
                String CPF = csvRecord.get(0);
                String nome = csvRecord.get(1);
                FormaPagamento formaPagamento  = FormaPagamento.valueOf(csvRecord.get(2));
                String nroCartao = csvRecord.get(3);
            }
        }
        return listaPassageiros;
    }
}
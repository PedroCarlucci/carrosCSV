import java.util.LinkedList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
public class PersistenciaVeiculos{
    private static final String SAMPLE_CSV_FILE_PATH = "veiculos.dat";
    
    public List<Veiculo> carregaVeiculos() throws IOException {

        List<Veiculo> listaVeiculo = new LinkedList<Veiculo>();

        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);

        for (CSVRecord csvRecord : csvParser){
            String placa = csvRecord.get(0);
            String marca = csvRecord.get(1);
            String cor = csvRecord.get(2);
            String categoria = csvRecord.get(3);
        }
        return listaVeiculo;
     }

}
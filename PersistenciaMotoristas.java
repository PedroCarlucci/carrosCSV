import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
public class PersistenciaMotoristas
{
    private String FILE_PATH = "motorista.dat";
    private List<Veiculo> listaVeiculos;

    public PersistenciaMotoristas(String path, List<Veiculo> listaVeiculos){
        this.FILE_PATH = path;
        this.listaVeiculos = listaVeiculos;

    }


    public List<Motorista> carregaMotoristas() throws IOException{

        LinkedList<Motorista> listaMotorista = new LinkedList<Motorista>();
        Reader reader = Files.newBufferedReader(Paths.get(FILE_PATH));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);    
        for (CSVRecord csvRecord : csvParser){

        }

        return listaMotorista;
    }
}
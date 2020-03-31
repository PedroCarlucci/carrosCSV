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
    private static final String SAMPLE_CSV_FILE_PATH = "motorista.dat";
    
    public List<Motorista> carregaMotoristas() throws IOException{

        LinkedList<Motorista> listaMotorista = new LinkedList<Motorista>();
        Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
        CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);    
        for (CSVRecord csvRecord : csvParser){

        }

        return listaMotorista;
    }
}
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
public class PersistenciaMotoristas
{
    private static final String SAMPLE_CSV_FILE_PATH = "motorista.dat";
    public PersistenciaMotoristas() throws IOException
    {
        ArrayList<Motorista> listamotorista = new ArrayList<Motorista>(11);
        try 
        (
            Reader reader = Files.newBufferedReader(Paths.get(SAMPLE_CSV_FILE_PATH));
            CSVParser csvParser = new CSVParser(reader, CSVFormat.DEFAULT);
        ){
            
            for (CSVRecord csvRecord : csvParser)
            {
                listamotorista.add(new Motorista(csvRecord.get(0),csvRecord.get(1),csvRecord.get(2),FormaPagamento.valueOf(csvRecord.get(3))));


            }
        }
    }
}
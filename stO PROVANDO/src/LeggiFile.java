
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeggiFile {

public LeggiFile() {
}
public void Leggi(ElencoAlunni Elenco, String path) throws IOException  {
String line="" ;
BufferedReader pier;

try {
pier= new BufferedReader(new FileReader(path));
while( (line=pier.readLine())!=null) {
String[] testoletto=line.split(",");
Alunno a= new Alunno(testoletto[0], testoletto[1], testoletto[2]);
Elenco.add(a);

}
}catch(FileNotFoundException e ){
e.printStackTrace();
}
}
}

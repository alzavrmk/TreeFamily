import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler implements Writable {

    public void save(Object object){
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.append(object.toString());
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void read(){
        try {
                BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.printf("== %s ==\n", str);
            }
            br.close();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


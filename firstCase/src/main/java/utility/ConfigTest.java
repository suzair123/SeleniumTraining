package utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigTest {

    Properties prop = new Properties();

    public ConfigTest(String fileName) throws IOException {

        try{

            File fIn = new File(System.getProperty("user.dir")+"\\src\\main\\resources\\config\\"+ fileName+".properties");

            if(fIn.exists()){
                FileInputStream fInp = new FileInputStream(fIn);
                prop.load(fInp);
            }else {
                System.out.println("File Not Found");
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public String getProperty(String key){
        String value = prop.getProperty(key);
        return value;
    }
}

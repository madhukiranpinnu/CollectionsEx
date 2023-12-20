package Java.CollectionDemo.Map.PropertiesDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Program1 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/Java/Collections/Map/PropertiesDemo/data.properties");
        properties.load(fis);
        properties.setProperty("size","klkl");
        FileOutputStream fos=new FileOutputStream(System.getProperty("user.dir")+"/src/main/java/Java/Collections/Map/PropertiesDemo/data.properties");
        properties.store(fos,"secret");
        System.out.println(properties);
        System.out.println(properties.getProperty("email"));
    }
}

package org.utility;

import org.constants.Enviornment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {

    public static String readproperty(Enviornment env, String propertyname)  {

        File prop= new File(System.getProperty("user.dir")+ "/config/"+env+".properties");
        FileReader reader= null;
        Properties properties= new Properties();
        try {
            reader = new FileReader(prop);
            properties.load(reader);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        String value =properties.getProperty(propertyname.toUpperCase());
        return  value;
    }
}

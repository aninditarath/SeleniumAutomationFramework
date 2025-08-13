package org.utility;

import com.google.gson.Gson;
import org.constants.Enviornment;
import org.pojo.Enviornmentvalue;
import org.pojo.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonUtility {



    public  static String readjson(Enviornment env) {

        Gson gson = new Gson();
        File file = new File(System.getProperty("user.dir")+ "/config/config.json");
        FileReader reader = null;
        try {
            reader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        config config = gson.fromJson(reader, config.class);
        Enviornmentvalue value= config.getEnviornments().get("QA");
        return value.getUrl();
    }



}

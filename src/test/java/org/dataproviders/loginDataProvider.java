package org.dataproviders;

import com.google.gson.Gson;
import org.pojo.TestData;
import org.pojo.User;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class loginDataProvider {
@DataProvider(name="LoginTestDataprovider",parallel = true)
    public static Iterator<Object[]> logindataprovider()  {
        Gson gson = new Gson();
        File testdata = new File(System.getProperty("user.dir")+ "/test-data/logindata.json");
    if (!testdata.exists()) {
        throw new org.testng.SkipException("Test data file not found: " + System.getProperty("user.dir")+ "/test-data/logindata.json");
    }
    FileReader reader = null;
    try {
        reader = new FileReader(testdata);
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    }
    TestData data = gson.fromJson(reader, TestData.class);

        List<Object[]> dataToReturn= new ArrayList<Object[]>();

        for(User user :data.getData()){
            dataToReturn.add(new Object[] {user});

        }
        return dataToReturn.iterator();
    }
}

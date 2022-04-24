package pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "dataProviderValues")
    public Object[][] dataProvider(){
        Object[][] data = {{"Satyam", 26}, {"Sayantika",24}, {"Richa", 28}};
        return data;
    }

//    @Test(dataProvider = "dataProviderValues")//If Data Provider Is In Same Class
    @Test(dataProviderClass =CustomDataProvider.class, dataProvider = "dataProviderValues")
    public void printData(String name, int age){
        System.out.println(String.format("Age is:: %d        Name is:: %s", age,name));
    }


}

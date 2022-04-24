package pack1;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
    @DataProvider(name = "dataProviderValues")
    public Object[][] dataProvider(){
        Object[][] data = {{"Satyam", 26}, {"Sayantika",24}, {"Richa", 28}};
        return data;
    }
}

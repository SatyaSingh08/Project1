package pack1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersInTestNG {

    @Test
    @Parameters({"rollNum", "name"})
    public void printingDetails(int rollNumber, String name){
        System.out.println(String.format("Roll Number Is:: %d        ---  Name Is:: %s", rollNumber, name));
    }
}

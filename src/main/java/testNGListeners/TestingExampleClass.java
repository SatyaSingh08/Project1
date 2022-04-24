package testNGListeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerClass.class)
public class TestingExampleClass {

    @Test(priority = 1)
    public void passMethod(){
        Assert.assertEquals( "A", "A","This Is Pass Method");
    }

    @Test(priority = 0)
    public void failMethod(){
        Assert.assertEquals( "A", "B","This Is Fail Method");
    }

    @Test (priority = 2)
    public void skipMethod(){
        throw new SkipException("Skip Ho Gaya");
//        Assert.assertEquals( "A", "A","This Is Pass Method");
    }

}

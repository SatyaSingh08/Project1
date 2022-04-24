package pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingInTestNG {

    @Test(groups = {"Regression"})
    public void test1(){
        System.out.println("In Test 1 For 'Regression");
    }


    @Test(groups = {"Regression"})
    public void test2(){
        System.out.println("In Test 2 For 'Regression");
    }

    @Test(groups = {"Sanity"})
    public void test3(){
        System.out.println("In Test 3 For 'Sanity");
    }

    @Test(groups = {"Regression"})
    public void test4(){
        System.out.println("In Test 4 For 'Regression");
    }

    @Test(groups = {"Sanity"})
    public void test5(){
        System.out.println("In Test 5 For 'Sanity");
    }

    @Test(groups = {"Sanity"})
    public void test6(){
        System.out.println("In Test 6 For 'Sanity");
    }

    @Test(groups = {"Sanity"})
    public void test7(){
        System.out.println("In Test 7 For 'Sanity");
    }

    @Test(groups = {"Sanity"})
    public void test8(){
        System.out.println("In Test 8 For 'Sanity");
    }

    @Test(groups = {"Sanity"})
    public void test9(){
        System.out.println("In Test 9 For 'Sanity");
        Assert.fail("Kuch Bhi Chal Raha Hai :P");
    }

    @Test(groups = {"Regression"})
    public void test10(){
        System.out.println("In Test 10 For 'Regression");
    }

}

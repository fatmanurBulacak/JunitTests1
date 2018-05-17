package com.fatmanur;

import org.junit.Assert;
import org.junit.Test;

public class JunitTest {

    @Test
    public void testSquare(){

        Junit testSquare = new Junit();
        int output=testSquare.square(5);
        Assert.assertEquals(25,output);

    }

    @Test
    public void testSum(){
        Junit testSum = new Junit();
        int result = testSum.sum(5,2);
        Assert.assertEquals("Toplama islemi hatali",7,result);

    }

    @Test
    public void testSub(){
        Junit testSub = new Junit ();
        int result= testSub.sub(12,7);
        Assert.assertEquals("Cikarma islemi hatali",5,result);


    }


     @Test
    public void testAddWord(){

        Junit addword=new Junit();
        String result = addword.addWord("hello","world");
        Assert.assertEquals("helloworld",result);
     }

     //sor
    @Test
    public void testciftMi(){

        Junit ciftSayiMi = new Junit();
        boolean result = ciftSayiMi.ciftMiDogrula(8);
        Assert.assertTrue("çiftdeğil",result);
    }


}

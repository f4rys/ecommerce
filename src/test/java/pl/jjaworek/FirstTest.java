package pl.jjaworek;

import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void myFirstTest(){
        assert true == true;
    }

    @Test
    void my2ndTest(){
        String name = "jacek";
        String hello = String.format("Hello %s", name);
        assert hello.equals("Hello jacek");
    }

    @Test
    void baseTestSchema(){
        //Arrange   //Given     //Input
        //Act       //When      //Call/interaction
        //Assert    //Then      //Output
    }
}

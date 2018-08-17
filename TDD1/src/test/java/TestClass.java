import org.junit.Test;

import static org.junit.Assert.*;

public class TestClass {

    @Test

   public void TestAdd(){
        Math1 T = new Math1();
        int A = T.add(10,20);
        assertTrue(A==30);
    }

    @Test

    public void TestSub(){
       Math1 T = new Math1();
       int A = T.sub(40,20);
       assertTrue(A==20);
    }


}

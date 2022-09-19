package java8;

class StaticTest {

    
    int multiply(int a, int b){
        return a * b;
    }

    
    static int add(int a, int b){
        return a + b;
    }
}

public class static1 {

   public static void main( String[] args ) {

       
        StaticTest st = new StaticTest();

        
        System.out.println(" 2 * 2 = " + st.multiply(2,2));

        
        System.out.println(" 2 + 3 = " + st.add(2,3));
   }
}
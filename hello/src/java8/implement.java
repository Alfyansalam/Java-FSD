package java8;

interface showable{
    static void printable()
    {
        System.out.println("hey");
    }
    void sho();
}
class b implements showable{
    public void sho() {



   System.out.println("hi");
}



public class implement {



   public static void main(String[] args) {
        b ob=new b();
        ob.sho();
       
        
 }

}
}
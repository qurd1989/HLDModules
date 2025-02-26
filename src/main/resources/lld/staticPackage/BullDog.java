package staticPackage;

public class BullDog extends Dog {
   static void doSomething (){
       System.out.println("Bull Dog");
   }

    @Override
    void print(){
        System.out.println("Bull Dog");

    }


}

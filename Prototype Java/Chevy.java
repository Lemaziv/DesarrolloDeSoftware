public class Chevy extends Carro {

   public Chevy(){
      type = "Chevy";
   }
 
   @Override
   public void draw() {
      System.out.println("Inside Chevy::draw() method.");
   }
 }
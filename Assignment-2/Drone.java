// Source code is decompiled from a .class file using FernFlower decompiler.
class Drone implements Movable {
   Drone() {
   }

   public void move() {
      System.out.println("Drone is operated by someone");
   }

   public static void main(String[] var0) {
      Car var1 = new Car();
      Robot var2 = new Robot();
      Drone var3 = new Drone();
      var1.move();
      var2.move();
      var3.move();
   }
}

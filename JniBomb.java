public class JniBomb {
   static {
      System.loadLibrary("jni-bomb");
   }
 
   private native void sayHello();
 
   private native void doBadStuff();
 
   public static void main(String[] args) {
      JniBomb bomb = new JniBomb();

      System.out.println("About to say hello");
      bomb.sayHello();

      System.out.println("About to do do bad stuff");

      try {
            bomb.doBadStuff();
      } catch (Exception e) {
            System.out.println("This will never ever be caught");
      }

      System.out.println("This will never ever happen");
   }
}

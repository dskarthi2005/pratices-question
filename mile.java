import java.util.Scanner;

class mile {
   mile() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("Enter the Beginning: ");
      float var2 = var1.nextFloat();
      System.out.print("Enter the Ending: ");
      float var3 = var1.nextFloat();
      float var4 = var3 - var3;
      System.out.println("Enter the cost");
      int var5 = var1.nextInt();
      float var6 = var4 * (float)var5;
      System.out.println("The last amount is " + var6);
      System.out.println("The miles is" + var4);
   }
}

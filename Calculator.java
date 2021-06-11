import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Keep the numbers under ten characters long and only use one operator(e.g: +, /, -, *)");
        for(int t = 1; t > 0; t++) {
		 int pope = 0;
		 System.out.println("EnTeR CaLcUlAtIoN... ");
		 Scanner nowyoubad = new Scanner(System.in);
		 String arph = nowyoubad.nextLine();
         //nowyoubad.close();
         String U2 = "0";
       
         if(arph.contains("+")) {
        	pope = arph.indexOf("+");
        	U2 = "+";
         }
         if(arph.contains("*")) {
        	pope = arph.indexOf("*");
        	U2 = "*";
         }
         if(arph.contains("-")) {
        	pope = arph.indexOf("-");
        	U2 = "-";
         }
         if(arph.contains("/")) {
        	pope = arph.indexOf("/");
        	U2 = "/";
         }
         String smack = arph.substring(0, pope);
         String wack = arph.substring(pope+1, arph.length());
         int number = Integer.valueOf(smack);
         int numberpoo = Integer.valueOf(wack);
         if(U2.equals("+")) {
         	System.out.println(number+numberpoo);
         }
         if(U2.equals("-")) {
         	System.out.println(number-numberpoo);
         }
         if(U2.equals("/")) {
        	System.out.println(number/numberpoo);
         }
         if(U2.equals("*")) {
        	System.out.println(number*numberpoo);
        	
         }
        
		 }
}
}

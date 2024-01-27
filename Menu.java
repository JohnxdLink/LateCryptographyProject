package crypt;

public class Menu {

   String[] choices = { "\u001b[36;1m---------------------------------------", "          MY OWN CRYPTOGRAPHY",
         "---------------------------------------\u001B[0m", "[P] Plain Text   [E] Encrypt",
         "[D] Decrypt      [X] Exit\u001b[36;1m", "---------------------------------------\u001B[0m" };
   String[] exitDsply = { "\u001b[35m---------------------------------------", "                EXIT",
         "\u001B[35m---------------------------------------\u001B[0m" };
   String[] invalidDsply = { "\u001B[31m---------------------------------------", "             INVALID INPUT",
         "\u001B[0m---------------------------------------" };
   String[] headerDsply = { "\u001b[36;1m---------------------------------------", "          MY OWN CRYPTOGRAPHY",
         "---------------------------------------\u001B[0m" };

   public void menus() {
      for (int i = 0; i < choices.length; i++) {
         System.out.println(choices[i]);
      }
   }

   public void exit() {
      for (int i = 0; i < exitDsply.length; i++) {
         System.out.println(exitDsply[i]);
      }
   }

   public void invalid() {
      for (int i = 0; i < invalidDsply.length; i++) {
         System.out.println(invalidDsply[i]);
      }
   }

   public void header() {
      for (int i = 0; i < headerDsply.length; i++) {
         System.out.println(headerDsply[i]);
      }
   }
}

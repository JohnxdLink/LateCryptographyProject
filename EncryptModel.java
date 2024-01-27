package crypt;

import java.util.Random;;

public class EncryptModel {

   // * Instance of Random Method Class
   Random rnd = new Random();

   // * Global Variable Reminder: Create an Object for this Variable
   String alphaNum = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

   // * Creating Random Numbers
   int rndNum = rnd.nextInt(61) + 1, rndSalt = rnd.nextInt(7) + 1;

   // TODO: Create a Method for Encryption

   public String encryption(String plainText) {
      EncryptModel obj = new EncryptModel();

      String firstEncrypt = obj.encrpytOne(plainText);
      String secondEncrypt = obj.encryptTwo(firstEncrypt);
      String thirdEncrypt = obj.encryptThree(secondEncrypt);

      return thirdEncrypt;
   }

   public String encrpytOne(String cipherText) {

      // * StringBuffer to manipulate string
      StringBuffer strBuffer = new StringBuffer();

      // * System.out.println("Random Number: " + rndNum);

      // * Plaintext convert into .toCharArray() method
      for (char chr : cipherText.toCharArray()) {

         // * Indexof finding index in alphaNum
         int index = alphaNum.indexOf(chr);

         // * Supposedly index must not in negative
         if (index != -1) {

            // * adding index in random number
            index = (index + rndNum) % alphaNum.length();

            // * Print the new index number
            // * System.out.println("Character: " + chr + "   Index: " + index);

            strBuffer.append(alphaNum.charAt(index));

         }
      }

      // * System.out.println("Encrypted: " + strBuffer.toString());

      return strBuffer.toString();
   }

   public String encryptTwo(String rvseString) {
      StringBuffer strBuffer = new StringBuffer();

      for (int i = 0; i < rvseString.length(); i++) {
         char chrString = rvseString.charAt(i);
         strBuffer.insert(0, chrString);
      }

      // * System.out.println("Reverse: " + strBuffer.toString());

      return strBuffer.toString();
   }

   public String encryptThree(String rvsedString) {
      StringBuffer strBuffer = new StringBuffer();
	  String jccLabel = "JCCx";
      int index = 8;

      for(int i = 0; i < index; i++) {
         int rndIndex = rnd.nextInt(alphaNum.length());
         char rndChar = alphaNum.charAt(rndIndex);
         strBuffer.append(rndChar);
      }

      System.out.println("Encrypted: " + jccLabel + rvsedString + strBuffer.toString());

      return strBuffer.toString();

   }

}
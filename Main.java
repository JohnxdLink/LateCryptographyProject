package crypt;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/*
 *    Project: My Own Cryptography
 *    Developer: Castro John Christian
 *    Message:
 *    Date Created: 08/16/2023
*/

public class Main {
   public static void main(String[] args) {

      // * Calling Menu class
      Menu out_menu = new Menu();
      EncryptModel encrypt = new EncryptModel();
      String plainText = "", encryptText = "", decryptText = "";

      try {
         BufferedReader bfrdReader = new BufferedReader(new InputStreamReader(System.in));
         String choice, enter;

         do {
            clr_console();

            // * Display Menus
            out_menu.menus();

            System.out.print("Input: ");
            choice = bfrdReader.readLine();

            if (choice.equalsIgnoreCase("P")) {
               clr_console();
               out_menu.header();
               System.out.println("Enter Plain Text: ");
               plainText = bfrdReader.readLine();

               System.out.println("\u001b[33mPlain Text Successfully Inputted!\u001B[0m [Press Enter]");
               enter = bfrdReader.readLine();

            } else if (choice.equalsIgnoreCase("E")) {

               encrypt.encryption(plainText);

               System.out.println("[PRESS ENTER]");
               enter = bfrdReader.readLine();

            } else if (choice.equalsIgnoreCase("D")) {

            } else if (choice.equalsIgnoreCase("X")) {
               clr_console();
               out_menu.exit();

            } else {
               clr_console();
               out_menu.invalid();
               System.out.println("[PRESS ENTER]");
               enter = bfrdReader.readLine();
            }

         } while (!choice.equalsIgnoreCase("X"));

      } catch (IOException e) {
         e.printStackTrace();
      }

   }

   // * Clearing Console Method
   public static void clr_console() {
      try {
         new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

}

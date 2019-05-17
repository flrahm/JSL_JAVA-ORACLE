import java.util.Scanner;

/*
       입력 양식
10진수 : 1234
2진수 : 0b111001
8진수 : 033
16진수 : 0xf
------------------------------
      출력 양식
10진수 1234 는 2진수 0b10011010010
2진수 0b111001 는 10진수 57
8진수 033 는 2진수 0b11011
16진수 0xf 은  8진수  017

 */


public class StringExam {

   public static void main(String[] args) {

      ////////////////////// 입력 ////////////////////////
      
      Scanner scan = new Scanner(System.in);

      System.out.print("10진수 : ");
      int dec_input = scan.nextInt();

      System.out.print("2진수 : ");
      String bin_input = scan.next();

      System.out.print("8진수 : ");
      String oct_input = scan.next();
      
      System.out.print("16진수 : ");
      String hex_input = scan.next();
      System.out.println("------------------------------");

      //////////////////////// 10진수///////////////////////////////////////////
      System.out.println("10진수 " + dec_input + " 는 2진수 0b" + Integer.toBinaryString(dec_input));

      /////////////////////// 2진수//////////////////////////////////////////
      String bin_temp = bin_input.substring(2);   // 0b 부분 자르기 
      int x = Integer.parseInt(bin_temp);
      int prdt = 1;
      int bin = 0;
      while (x > 0) {
         if (x % 10 == 1)
            bin = bin + prdt;
         x = x / 10;
         prdt = prdt * 2;
      }
      System.out.println("2진수 " + bin_input + " 는 10진수 " + bin);
      //////////////////////// 8진수////////////////////////////////

      String oct_temp = oct_input.substring(1);   //0 부분 자르기. 없어도 됨
      int y = Integer.parseInt(oct_temp);
      int prdt2 = 1;
      int oct = 0;
      while (y > 0) {
         oct = oct + ((y % 10) * prdt2);
         prdt2 = prdt2 * 8;
         y = y / 10;
      }
      System.out.println("8진수 " + oct_input + " 는 2진수 0b" + Integer.toBinaryString(oct));

      ////////////////////////////////// 16진수////////////////////////


      String str = hex_input.substring(2);   // 0x 부분 자르기

      int index = str.length() - 1;

      int hex = 0;
      int prdt4 = 1;

      for (int i = 0; i < index + 1; i++) {

         hex = hex + prdt4 * changer(str.charAt(index - i));
         prdt4 = prdt4 * 16;
         
      }
      
      System.out.println("16진수 "+hex_input+ " 은  8진수  0" + Integer.toOctalString(hex));
      scan.close();
      
   }

   private static int changer(char c) {

      int s = 0;

      switch (c) {
      case '1':
         s = 1;
         break;
      case '2':
         s = 2;
         break;
      case '3':
         s = 3;
         break;
      case '4':
         s = 4;
         break;
      case '5':
         s = 5;
         break;
      case '6':
         s = 6;
         break;
      case '7':
         s = 7;
         break;
      case '8':
         s = 8;
         break;
      case '9':
         s = 9;
         break;
      case 'a':
         s = 10;
         break;
      case 'b':
         s = 11;
         break;
      case 'c':
         s = 12;
         break;
      case 'd':
         s = 13;
         break;
      case 'e':
         s = 14;
         break;
      case 'f':
         s = 15;
         break;
      }
      return s;
   }
}
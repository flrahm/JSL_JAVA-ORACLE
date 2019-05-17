import java.util.Scanner;

/*
       �Է� ���
10���� : 1234
2���� : 0b111001
8���� : 033
16���� : 0xf
------------------------------
      ��� ���
10���� 1234 �� 2���� 0b10011010010
2���� 0b111001 �� 10���� 57
8���� 033 �� 2���� 0b11011
16���� 0xf ��  8����  017

 */


public class StringExam {

   public static void main(String[] args) {

      ////////////////////// �Է� ////////////////////////
      
      Scanner scan = new Scanner(System.in);

      System.out.print("10���� : ");
      int dec_input = scan.nextInt();

      System.out.print("2���� : ");
      String bin_input = scan.next();

      System.out.print("8���� : ");
      String oct_input = scan.next();
      
      System.out.print("16���� : ");
      String hex_input = scan.next();
      System.out.println("------------------------------");

      //////////////////////// 10����///////////////////////////////////////////
      System.out.println("10���� " + dec_input + " �� 2���� 0b" + Integer.toBinaryString(dec_input));

      /////////////////////// 2����//////////////////////////////////////////
      String bin_temp = bin_input.substring(2);   // 0b �κ� �ڸ��� 
      int x = Integer.parseInt(bin_temp);
      int prdt = 1;
      int bin = 0;
      while (x > 0) {
         if (x % 10 == 1)
            bin = bin + prdt;
         x = x / 10;
         prdt = prdt * 2;
      }
      System.out.println("2���� " + bin_input + " �� 10���� " + bin);
      //////////////////////// 8����////////////////////////////////

      String oct_temp = oct_input.substring(1);   //0 �κ� �ڸ���. ��� ��
      int y = Integer.parseInt(oct_temp);
      int prdt2 = 1;
      int oct = 0;
      while (y > 0) {
         oct = oct + ((y % 10) * prdt2);
         prdt2 = prdt2 * 8;
         y = y / 10;
      }
      System.out.println("8���� " + oct_input + " �� 2���� 0b" + Integer.toBinaryString(oct));

      ////////////////////////////////// 16����////////////////////////


      String str = hex_input.substring(2);   // 0x �κ� �ڸ���

      int index = str.length() - 1;

      int hex = 0;
      int prdt4 = 1;

      for (int i = 0; i < index + 1; i++) {

         hex = hex + prdt4 * changer(str.charAt(index - i));
         prdt4 = prdt4 * 16;
         
      }
      
      System.out.println("16���� "+hex_input+ " ��  8����  0" + Integer.toOctalString(hex));
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
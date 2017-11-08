/**********************************************************************************
*	file: Shima_Decoder.java
*	author: Rachael Shima
*	class: CS 141 - Programming and Problem Solving
*
*	assignment: program 1
*	date last modified: 4/4/2016
*
*	purpose: This program reads user input and decodes a sentence comprised of numbers based on the reference sentence also entered by the user
**********************************************************************************/
import java.util.Scanner;

public class Shima_Decoder
{
  public static void main(String[] args)
  {
    String ref;
    char[] key;
    String crypt;
    String[] nums;
    int[] decode;
    char[] message;
    Scanner input = new Scanner(System.in);
    System.out.println("Please type out your reference sentence:");
    ref = input.nextLine();
    key = new char[ref.length()];
    for(int i = 0; i < ref.length(); i++)
    {
      key[i] = ref.charAt(i);
    }
    System.out.println("Please input the sentence you wish to decode:");
    crypt = input.nextLine();
    nums = crypt.split(" ");
    decode = new int[nums.length];
    message = new char[nums.length];
    System.out.print("Your secret message is: \"");
    for(int i = 0; i < nums.length; i++)
    {
      decode[i] = Integer.parseInt(nums[i]);
    }
    for(int i = 0; i < nums.length; i++)
    {
      message[i] = key[decode[i]];
    }
    for(int i = 0; i < nums.length; i++)
    {
      System.out.print(message[i]);
    }
    System.out.print("\"");
    System.out.println();
  }
}

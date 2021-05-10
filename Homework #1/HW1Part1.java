import java.util.Scanner;
import java.lang.*;

public class HW1Part1
{
   public static void main(String[] args)
   {
   System.out.println("#1");//Question #1
   Scanner input = new Scanner(System.in);
   
   boolean first;
   boolean second;
   boolean third;
   
   System.out.println("Please input a whole integer.");
   int integer = input.nextInt();
   if(integer % 6 == 0 && integer % 5 == 0)
      {
      first = true;
      }else
         {
         first = false;
         }
   if(integer % 6 == 0 || integer % 5 == 0)
      {
      second = true;
      }else
         {
         second = false;
         }
   if(integer % 6 == 0 ^ integer % 5 == 0)
      {
      third = true;
      }else
         {
         third = false;
         }
    System.out.println("Is " + integer + " divisible by 5 and 6? " + first);
    System.out.println("Is " + integer + " divisible by 5 or 6? "  + second);
    System.out.println("Is " + integer + " divisible by 5 or 6, but not both? " + third);
    System.out.println("#2 (a)"); //Question #2
    
    for(int i = 1; i < 4; i++)
      {
      for(int j = 1; j < 4; j++)
         {
         if(i * j > 2)            
            break;
            
            System.out.println(i * j);
         }
      System.out.println(i);
      }
   
   System.out.println("#2 (b)");
   
   for(int i = 1; i < 4; i++)
      {
      for(int j = 1; j < 4; j++)
         {
         if(i * j > 2)        
            continue;
            
         System.out.println(i*j);
         }
      System.out.println(i);
      }
   
   System.out.println("#3");//Question #3
   
   System.out.println("What value for n would you like for your n-by-n matrix? Please keep your value to a positive integer, or else it will be rounded to the nearest integer.");
   int n = Math.round(input.nextInt());
   printMatrix(n);
   
   System.out.println("#4");//Question #4
   
   int max = 0;
   max(1,2, max);
   System.out.println(max);
   
   System.out.println();  
   
   int i = 1;
   while(i <=6)
      {
      method1(i,2);
      i++;
      }
   
   System.out.println("#6");//Question #6
   Scanner password = new Scanner(System.in);
   while(true)
      {
      System.out.println("Please input a new password.");
      String pass = password.next();
      boolean one = has8characters(pass);
      boolean two = haslettersnumbers(pass);
      boolean three = has2digits(pass);
      if((one == true) && (two == true) && (three == true))
         {
         System.out.println("Thankyou that passes all requirements.");
         break;
         }
      if(one == false)
         {
         System.out.println("The password must be at least 8 characters long.");
         }
      if(two == false)
         {
         System.out.println("The password must only contain numbers and letters.");
         }
      if(three == false)
         {
         System.out.println("The password must contain two numbers.");
         } 
      }
    
    System.out.println("#7");//Question #7
    Scanner palindrome = new Scanner(System.in);
    System.out.println("Please enter the number you would like to check as a palindrome.");
    int pal = palindrome.nextInt();
    boolean palindrome2 = isPalindrome(pal);
    if(palindrome2 == true)
      {
      System.out.println("This number is a Palindrome.");
      }
    if(palindrome2 == false)
      {
      System.out.println("This number is not a Palindrome.");
      }
    
    System.out.println("#8");//Question #8
    Scanner input2 = new Scanner(System.in);
    int sum = 0;
    System.out.println("Enter an integer " + "(the input ends if it is 0)");
    int number = input.nextInt();
    do
      {
      sum += number;
      System.out.println("Enter an integer "+ "(the input ends if it is 0)");
      number = input.nextInt();
      }while(number != 0);
   }
   
   public static void printMatrix(int n)
   {
   while(n < 0 || n == 0)
      {
      System.out.println("That value is not positive please select another number.");
      Scanner input2 = new Scanner(System.in);
      n = Math.round(input2.nextInt());
      }
   if(n > 0)
      {
      int[][] matrix = new int[n][n];
      for(int i = 0; i < n; i++)
         {
         for(int j = 0; j < n; j++)
            {
            double temp = Math.random();
            int perm = 0;
            if(temp < .5)
               {
               perm = 0;
               }
            if(temp >=.5)
               {
               perm = 1;
               }
            matrix[i][j] = perm;
            System.out.print(matrix[i][j] + " ");
            }
         System.out.println();
         }

      }
   }
   
   public static void max(int value1, int value2, int max)
      {
      if(value1 > value2)
         {
         max = value1;
         } else
            {
            max = value2;
            }
      }
   public static void method1(int i, int num) 
      {
      for(int j = 1; j <= i; j++)
         {
            System.out.print(num + " ");
            num *= 2;
         }
      System.out.println();
      }
   
   public static boolean has8characters(String pass)
      {
      if(pass.length() >= 8)
         {
         return true;
         }
      return false;
      }
   
   public static boolean haslettersnumbers(String passw)
      {
      char[] specialCh = {'!','@',']','#','$','%','^','&','*'};
      for(int i = 0; i<passw.length(); i++)
         {
         for(int j =0; j<specialCh.length; j++)
            {
            if(passw.charAt(i) == specialCh[j]);
               {
               return true;
               }
            }
         }
      return false;
      }
   
   public static boolean has2digits(String pass)
      {
      int counter = 0;
      for(int i = 0; i<pass.length(); i++)
         {
         if(Character.isDigit(pass.charAt(i)))
              {
              counter++;
              }
         }
      if(counter >= 2)
         {
         return true;
         }
      return false;
      }
    public static int reverse(int number)
      {
      int n = number;
      int reverse = 0;
      while(n != 0)
         {
         reverse = reverse * 10;
         reverse = reverse + n%10;
         n = n/10;
         }
      return reverse;
      }
    public static boolean isPalindrome(int number)
      {
      int reverse = reverse(number);
      if(reverse == number)
         {
         return true;
         }else
            {
            return false;
            }
      }
         
}
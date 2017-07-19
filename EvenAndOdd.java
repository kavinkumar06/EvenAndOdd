# EvenAndOdd
import java.io.*;
import java.util.*;
public class EvenAndOdd
{
 public static void main(String [] args)
 {
   Scanner sc=new Scanner(System.in);
   String n=new String();
   n=sc.nextLine();
   String even,odd;
   for(int i=0;i<n.length-2;i+=2)
   {
    even=n.charAt(i+1)+m.charAt(i);
   }
   if(n.length%2!=0)
   {
    System.out.println(even+m.charAt(n.length-1));
   }
   else
   {
    System.out.println(even);
    }
    }

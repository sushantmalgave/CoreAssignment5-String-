


//5. Write a program which prints the length of each word in a sentence.
//    Input: I am a Java programmer
//    Output: 1 2 1 4 

import java.util.*;
class Que_5
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            
            int x=arr.length,y=0;
            
            for(int i=0;i<x;i++)
            {
                if(arr[i]==' ')
                {
                    System.out.print((i-y)+" ");
                    y=i+1;
                }
            }
            System.out.println();
        }
}



//7. Given a string , output another string where the case of the characters is reversed.
//    Input : "Hello World"
//    Output : "hELLO wORLD"

import java.util.*;

class Que_7
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String: ");
            
            String s=sc.nextLine();
            char arr[]=s.toCharArray();
            
            int x[]=new int[s.length()];
            
            for(int i=0;i<s.length();i++)
            {
                x[i]=(int)s.charAt(i);
                
                if(x[i]>=65 && x[i]<=90)
                    System.out.print((char)(32+arr[i]));
                
                else if(x[i]>=97 && x[i]<=122)
                    System.out.print((char)(arr[i]-32));
                
                else
                    System.out.print(arr[i]);
            }
            System.out.println();
        }
}


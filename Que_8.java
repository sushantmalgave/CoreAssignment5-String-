//8. Write a program to reverse a string.
//    Input : "hello"
//    Output : "olleh"
//    Input : "Hello World"
//    Output : "dlrow olleh"

import java.util.*;
class Que_8
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String: ");
            String s=sc.nextLine();
            
            String sl=s.toLowerCase();
            char arr[]=sl.toCharArray();
            
            char arr1[]=new char[s.length()];
            
            int ub=s.length();
            
            for(int i=0,j=(ub-1) ; i<ub/2 ; i++,j--)
            {
                    arr1[j]=arr[i];
                    arr1[i]=arr[j];
            }
            
            if(ub%2!=0)
                arr1[ub/2]=arr[ub/2];

            
            sl=String.valueOf(arr1);
            System.out.println(sl);
        }
}




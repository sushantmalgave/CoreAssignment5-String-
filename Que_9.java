//9. Write a program which accepts two string and prints all unique characters which are common in both stirngs.
//    Input 1 : "hello world"
//    Input 2 : "lot of work"
//    Output : 'l' , 'o' , 'w' , 'r'

import java.util.*;
class Que_9
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter String 1: ");
            String s1=sc.nextLine();
            System.out.print("Enter String 2: ");
            String s2=sc.nextLine();
            
            char arr1[]=s1.toCharArray();
            char arr2[]=s2.toCharArray();
            int i, j;
            char x;
            
            for(i=0 ; i<s1.length(); i++)
            {
                x=' ';
                for(j=0 ; j<s2.length() ; j++)
                {
                    if(arr1[i]==arr2[j] && arr1[i]!=' ' && arr2[j]!=x)
                    {
                        System.out.print(arr1[i]+", ");
                        x=arr2[j];
                        arr2[j]=' ';
                    }
                }
            }
            System.out.println();
        }
}
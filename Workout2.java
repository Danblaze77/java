/*reversing
import java.util.*;
class ReverseString {
    public static void main(String[] args)
    {
        String input = "Good Morning";
        char[] c1 = input.toCharArray();
        for (int i = c1.length - 1; i >= 0; i--)
            System.out.print(c1[i]);
    }
}
*/
/*palindrome
import java.io.*;
import java.util.Scanner;
class pali
{
public static void main (String[] args) 
{
    String str= "Hello", nstr="";
    char ch;
    System.out.println("Original word: "+str);
    for (int i=0; i<str.length(); i++)
    {
        ch= str.charAt(i); 
        nstr= ch+nstr; 
    }
     System.out.println("Reversed word: "+ nstr);
        if(str==nstr)
        System.out.println("Palindrome");
        else
        System.out.println("Not a palindrome");
}
}
*/
/*Vowel count
import java.util.*;
public class vow
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int v=0,c=0;
        s=sc.nextLine();
        char c1[]=s.toCharArray();
        for(char temp:c1)
        {
            if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U')
            v=v+1;
            else
            c=c+1;
        }
        System.out.println("Vowels:"+v);
        System.out.println("Consonants:"+c);
    }
}
*/
/*word count 
import java.util.*;
public class wcount
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int c=0;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        String s1[]=s.split(" ");
        for(String strnew:s1)
        System.out.println(strnew);
        System.out.println("No. of words"+" "+s1.length);
    }
}
*/
/*sort
import java.util.*;
public class sort
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of letters: ");
        int n=sc.nextInt();
        String name[]=new String[n];
        for(int i=0;i<n;i++)
        {
            name[i]=sc.next();
        }
        String temp="";
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if (name[i].compareTo(name[j])>0)
                {
                    temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }
        for(String str:name)
        {
            System.out.println(str);
        }
    }
}
*/
/*Anagram
import java.io.*; 
import java.util.Arrays; 
import java.util.Collections; 
class anagram
{ 
static boolean areAnagram(char[] str1, char[] str2) 
    {
    int n1 = str1.length; 
    int n2 = str2.length; 
    if (n1 != n2)    
    return false;  
        Arrays.sort(str1); 
        Arrays.sort(str2); 
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 

        return true; 
    } 
public static void main(String args[]) 
    { 
        char str1[] = { 't', 'e', 's', 't' }; 
        char str2[] = { 't', 't', 'e', 'w' }; 
        if (areAnagram(str1, str2)) 
            System.out.println("The two strings are"
                            + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                            + " anagram of each other"); 
    } 
}
*/
/*changing strings
import java.io.*;
import java.util.Scanner;
class change
{
  public static void main (String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine();
    String str2=sc.nextLine();
    String str3="";
    str3=str1+str2;
    int l=str3.length();
    int l1=str1.length();
    int l2=str2.length();
    str2=str3.substring(0,(l-l1)+1);
    str1=str3.substring(l2+1);
        System.out.println("String 1 after changing:"+str1);
        System.out.println("String 2 after changing:"+str2);
  }
}*/
/*capitalize
import java.util.*;
public class capup
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        char c;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        String s1[]=s.split(" ");
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
            }
        }
    }
}
*/
/*only alphabets
import java.util.*;
public class alpha
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        char c;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        if(s.matches("[a-z]+"))
                System.out.println("Only alphabets");
                else
                System.out.println("Doesn't contain only alphabets");
        }
    }
*/
/*duplicate character
import java.util.*;   
class dupli   
{   
    static void removeDuplicate(char str[], int length)   
    {   
        int index = 0;   
        for (int i = 0; i < length; i++)   
        {   
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }    
    public static void main(String[] args)   
    {  
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char str[] = s.toCharArray();  
        int len = str.length;   
        removeDuplicate(str, len);   
    }   
} 
*/
/*remove digit 
import java.util.*;
public class digits
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        String s1="";
        char c;
        int count=0;
        System.out.println("Enter a string:");
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            if(Character.isDigit(c))
            {
              count++;
            }
            else
            {
              s1+=c;  
            }
        }
        System.out.println("String after removing digits:"+s1);
        System.out.println("Number of digits:"+count);
        }
}
*/
/*char count
import java.util.*;   
class charc   
{      
    public static void main(String[] args)   
    {  
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        do
        {
        char ch[] = s.toCharArray();  
        int len = s.length();   
        for(int i=0;i<len;i++)
        {
            if(ch[0]==ch[i])
            c=c+1;
        }
        if(c!=0)
        System.out.println(ch[0]+" "+c);
        s=s.replace(""+ch[0],"");
        }
        while(s.length()!=0);
    } 
}
*/
/*ASCII
import java.util.*;
public class asc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        String str1="";
        char c;
        int count =0;
        for (int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            System.out.println((int)c);
        }
    }
}
*/
/*Upper case
import java.util.*;
public class upper
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2="";
        char c;
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            if(Character.isUpperCase(c))
            System.out.println(c);
        }
    }
}
*/
/*lower count
import java.util.*;
public class lower
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        int count=0;
        char c;
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            if(Character.isLowerCase(c))
            count=count+1;
        }
        System.out.println(count);
    }
}
*/
/*digits then letters
import java.util.*;
public class dig_let
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=sc.nextLine();
        String s2="";
        String s3="";
        int count=0;
        char c;
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            if(Character.isDigit(c))
            s2=s2+c;
            else
            s3=s3+c;
        }
        System.out.println(s2+s3);
    }
}
*/
/*Space 
import java.util.*;
public class s_p_a_c_e
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=sc.nextLine();
        String s2="";
        String s3="";
        char c;
        for(int i=0;i<s1.length();i++)
        {
            c=s1.charAt(i);
            if(Character.isWhitespace(c))
            s2=s2+c;
            else
            s3=s3+c;
        }
        System.out.println(s3);
    }
}
*/
/*Case reversing
import java.util.*;
public class caserev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s1=sc.nextLine();
        String s2="";
        String s3="";
        char c,ch1,ch2;
        for(int i=0;i<s1.length();i++)
    {
            c=s1.charAt(i);
            if(Character.isUpperCase(c))
            { 
            ch1=Character.toLowerCase(c);
            s2=s2+ch1;
            }
            else
            { 
            ch2=Character.toUpperCase(c);
            s2=s2+ch2;
        }
    }
    System.out.println(s2);
    }
}
*/
/*piglatin
import java.util.*;
public class piglatin
{
    public static void main(String args[])
    {
        String str="",str1,c,d;
        StringTokenizer st=new StringTokenizer(str);
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        str=str.toUpperCase();
        int x,y;
        char temp;
        while(st.hasMoreTokens())
    {
            str1=st.nextToken();
            x=str1.length();
            for(y=0;y<x;y++)
            {
                temp=(str1.charAt(y));
                if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'||temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U')
                break;
        }
        c=str1.substring(y,x);
        d=str1.substring(0,y);
        System.out.println(c+d+"AY"+' ');
        str1="";
    }
    }
}
*/
/* Decoding
import java.util.*;
class decode 
{
static void changeString(String str)
{
	char[] ch = str.toCharArray();
	for (int i = 0; i < str.length(); i++) {
	int dist = ch[i] - 'a';
	if (dist + (ch[i] - 'a') >= 26) {
		dist = (dist + (ch[i] - 'a')) % 26;
		ch[i] = (char)('a' + dist);
	}
	else {
		ch[i] = (char)(ch[i] + dist);
	     }
	}
        String s = new String(ch);
	System.out.println(s);
}
public static void main(String[] args)
{
	String str = "cycleofalphabet";
        changeString(str);
}
}
*/
/*first
import java.util.*;
public class first
 {
	public static void main(String args[])
	{
		String str = "Good Morning!";
		int i;
		for (i = 0; i < str.length(); i++) {
			if (i == 0)
				System.out.print(str.charAt(i));
			if (str.charAt(i) == ' ') 
			{
				System.out.println(str.charAt(i + 1));
			}
		}
	}
}
*/
/*first 2
import java.util.*;
public class first2
 {
	public static void main(String args[])
	{
		String str = "Good Morning!";
		int i;
		for (i = 0; i < str.length(); i++) {
			if (i == 0)
			{
			System.out.println(str.charAt(i));
			System.out.println(str.charAt(i+1));
                       }
		}
	}
}
*/
/*particular letter
import java.util.*;
public class partic
 {
	public static void main(String args[])
	{
	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
		int i;
		if(str.startsWith("f"))
	        System.out.println("True");
	        else
	        System.out.println("False");
  }
}
*/
/*particular letter
import java.util.*;
public class partic_e
 {
	public static void main(String args[])
	{
	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
		int i;
		if(str.endsWith("o"))
	        System.out.println("True");
	        else
	        System.out.println("False");
  }
}
*/
/*contains 
import java.util.*;
public class contain
 {
	public static void main(String args[])
	{
	        Scanner sc=new Scanner(System.in);
	        String str=sc.nextLine();
		int i=0;
		char ch;
		ch=str.charAt(i);
		for(i=0;i<str.length();i++)
                {
		if(ch=='k')
	        {
	           System.out.println("Letter exists");
                }
	        else
	        System.out.println("Letter doesn't exist");
       }
  }
}
*/
/*special character
import java.util.*;
public class special
 {
	public static void main(String args[])
	{
	        String txt = "We are the so-called \"Vikings\" from the north.";
		System.out.println(txt);
		String txt1 = "It\'s alright.";
 		System.out.println(txt1);
        }  
}
*/
/*longest word
import java.util.*;
public class SmallestLargestWord    
   {
  public static void main(String[] args)
  {     
      String string = "Hardships often prepare ordinary people for an extraordinary destiny";    
      String word = "", large="";    
      String[] words = new String[100];    
      int length = 0;       
      string = string + " ";    
          
      for(int i = 0; i < string.length(); i++){        
          if(string.charAt(i) != ' '){    
              word = word + string.charAt(i);    
         }    
          else
          {    
              words[length] = word;    
              length++;        
              word = "";    
          }    
      }             
      for(int k = 0; k < length; k++){      
          if(large.length() < words[k].length())    
              large = words[k];    
      }      
      System.out.println("Largest word: " + large);    
  }  
}  
*/
/*Counting 
import java.util.*;
public class cword
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        String s1[]=s.split(" ");
        for(String strnew:s1)
        {
            System.out.println(strnew);
            System.out.println("No of words"+" "+ s1.length);
        }
    }
}
*/
/*replace
import java.util.*;
public class Replace
{  
   public static void main(String args[])
    {  
      String s1="my name is olo my name is java";  
      String replaceString=s1.replace("is","was");//replaces all occurrences of "is" to "was"  
      System.out.println(replaceString);  
    }   
}  
*/
/*Deletion
import java.io.*;
class delete 
{
        public static void main(String[] args)
	{
		String str = "This is  The the Beatles";
		String word = "the";
                String msg[] = str.split(" ");
		String new_str = "";
		for (String words : msg) {
			if (!words.equals(word)) 
			{
				new_str += words + " ";
			}
		}
		System.out.print(new_str);
        }
}
*/
/*case change
import java.util.Scanner;
public class UpperToLower
 {
	public static void main(String[] args) 
	{
		String uppStr;
		Scanner sc= new Scanner(System.in);
                System.out.print("\nEnter Uppercase String to convert =  ");
		uppStr = sc.nextLine();	
		String uppStr2 = uppStr.toLowerCase();	
		System.out.println("\nThe Lowercase String  =  " + uppStr2);
	}
}
*/
/*first and lsat swap
import java.io.*;
class first_last 
  {
	public static String
	swapFirstAndLast(String str)
	{
              if (str.length() < 2)
			return str;
		char[] ch = str.toCharArray();
		char temp = ch[0];
		ch[0] = ch[ch.length - 1];
		ch[ch.length - 1] = temp;
		return String.valueOf(ch);
	}
	public static void
	main(String args[])
	{
	        String str = "GeeksForGeeks";
		System.out.println(swapFirstAndLast(str));
	}
   }
*/
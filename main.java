import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String str=s.nextLine();
	    int b[]=new int[27];
	    int index=26;
	    for(int i=0;i<str.length();i++)
	    {
	        if(str.charAt(i)>='a'&& str.charAt(i)<='z')
	        index=str.charAt(i)-'a';
	        else if(str.charAt(i)>='A'&& str.charAt(i)<='Z')
	        index=str.charAt(i)-'A';
	        else 
	        index=26;
	        b[index]=1;
	        
	        
	    }
	    int flag=0;
	    for(int i=0;i<26;i++)
	    {
	        if(b[i]==0)
	        {
	            System.out.println("FALSE");
	            flag=1;
	            break;
	        }
	    }
	    if(flag==0)
	    System.out.println("TRUE");
	}
}

package stellarday4;

import java.util.Arrays;
import java.util.Scanner;

public class Stringpro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int c=0;
//		String s=sc.nextLine();
//		for(int i=0;i<s.length();i++) {
//		if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
//			c++;
//		}
//		if(s.charAt(i)=='A' || s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
//			c++;
//		}
//		
//		}
//		System.out.println(c);
//		
		//========================================================================
		
		
		//string to identify the middle letter;;
		
//		int position;
//		int length;
//		String s=sc.nextLine();
//		
//		
//			
//			if(s.length()%2==0) {
//				position=s.length()/2-1;
//				
//			}
//			else {
//				position=s.length()/2;
//			}
//		
//		System.out.println(s.charAt(position));
//		
		//=============================================================
		
		//palindrome not use build in function
		
//		String s=sc.nextLine();
//		String s1="";
//		char ch;
//		for(int i=s.length()-1;i>=0;i--) {
//			  ch=s.charAt(i);
//			  s1=s1+ch;
//		}
//		
//		System.out.println(s1);
//		
//		if(s.equals(s1)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindrome");
//		}
		
		//====================================================
		
		//use the build function for palindrome;
		
//		String s=sc.nextLine();
//		StringBuffer s1=new StringBuffer(s).reverse();
//		
//		if(s.equals(s1.toString())) {
//			System.out.println("palindrome");
//		}
//		
//		else {
//			System.out.println("not palindrome");
//		}
		
		//=========================================================
		
		//remove the space
		
		
//		String s=sc.nextLine();
//		
//		String s1=s.replace(" ","");
//		
//		System.out.println(s);
//		System.out.println(s1);
//		
		
	//===============================================================
		// remove the space of String builder
//		String s=sc.nextLine();
//		
//		StringBuffer s1=new StringBuffer();
//		
//		for(int i=0;i<s.length();i++) {
//			   if(s.charAt(i)!=' ') {
//				   s1.append(s.charAt(i));
//			   }
//		}
//		
//       System.out.println(s);
//       System.out.println(s1);
		//==============================================================
		
		
		//lexicographic of String its means one string charactor are placed in other string iscalled lexicographic
		
//		String s=sc.nextLine();
//		String s1=sc.nextLine();
//		
//		System.out.println(s1.compareTo(s));
//		
		
		//================================================================
		
		//lexicographicc of String without use build in function
//		
//		String s=sc.nextLine();
//		String s1=sc.nextLine();
//		String s2=s.toLowerCase();
//		String s3=s1.toLowerCase();
//		char ch[]=s2.toCharArray();
//		char ch1[]=s3.toCharArray();
//		int result=0;
//		for(int i=0;i<ch.length;i++) {
//			if(ch[i]!=ch1[i]) {
//				result=(int)ch[i]-(int)ch1[i];
//				break;
//			}
//		}
//          System.out.println(result);
		//===========================================================
		//check the com,in,net,org;
		
//		String s=sc.nextLine();
//		System.out.println(s);
//		if(s.contains("com") || s.contains("net") ||s.contains("in")||s.contains("org")) {
//			System.out.println("valid email");
//		}
//		else {
//			System.out.println("not valid");
//		}
		
		//=============================================================
		
		//alternative;xyxyxy
		
//		String s=sc.nextLine();
//		
//		for(int i=0;i<s.length();i++) {
//			if(s.charAt(i)==s.charAt(i+2) && s.charAt(i+1)==s.charAt(i+3)) {
//				System.out.println("yes");
//				break;
//			}
//			else {
//				System.out.println("no");
//				break;
//			}
//		}
		
		//=========================================
		
		//2.alternative 
		
//		String s=sc.nextLine();
//		
//		char x=s.charAt(0);
//		char y=s.charAt(1);
//		int f=0;//true
//		if(x==y) {
//			f=0;
//		}
//		else {
//			for(int i=0;i<s.length();i++) {
//				if(i%2==0) {
//					if(x!=s.charAt(i)) {
//						f=1;
//						break;
//					}
//				}else if(y!=s.charAt(i)) {
//					f=1;
//					break;
//				}
//			}
//			if(f==1) {
//				System.out.println("no");
//			}
//			else{
//				System.out.println("yes");
//			}
		
		//=======================================================================
		
		String s=sc.nextLine();
		
		char ch[]=s.toCharArray();
		ch[0]=Character.toUpperCase(ch[0]);
		
		for(int i=1;i<ch.length;i++) {
			if(ch[i]==' ') {
				ch[i+1]=Character.toUpperCase(ch[i+1]);
				continue;
			}
			else {
				ch[i+1]=ch[i];
			}
		}
		for(int i=0;i<i;i++) {
			System.out.println(ch[i]);
		}
		
	}

}

package stellar_ifcondition;

import java.util.Scanner;

public class simpleifpro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int n=sc.nextInt();
//		if(n%10==3 || n%10==8) {
//			System.out.println("lucky winner");
//		}
//		else {
//			System.out.println("not");
//		}
	//	===============================
		
//		int mark=sc.nextInt();
//		if(mark>=85) {
//			System.out.println("A");
//		}
//		else if(mark>=75){
//			System.out.println("B");
//		}
//		else if(mark>=65) {
//			System.out.println("C");
//		}
//		else {
//			System.out.println("D");
//		}
//	=========================================		
		
//		int mark=sc.nextInt();
//		
//		switch(mark) {
//		
//		case 85:
//			System.out.println("a");
//			break;
//		case 75:
//			System.out.println("b");
//		}
//		======================================
		
		
//		int month=sc.nextInt();
//		int date=sc.nextInt();
//		
//		if(month==1) {
//			if(date>=20) {
//				System.out.println("aquarius");
//			}
//			else {
//				System.out.println("capricorn");
//			}
//		}
//		
//		else if(month==2) {
//			if(date>=19) {
//				System.out.println("pisces");
//			}
//			else {
//				System.out.println("aquarius");
//			}
//		}
//		
//		else if(month==3) {
//			if(date>=21) {
//				System.out.println("aries");
//			}
//			else {
//				System.out.println("pisces");
//			}
//		}
//		
//		else if(month==4) {
//			if(date>=20) {
//				System.out.println("tarus");
//			}
//			else {
//				System.out.println("aries");
//			}
//		}
//		
//		else if(month==5) {
//			if(date>=21) {
//				System.out.println("gemini");
//			}
//			else {
//				System.out.println("taurus");
//			}
//		}
//		
//		else if(month==6) {
//			if(date>21) {
//				System.out.println("cancer");
//			}
//			else {
//				System.out.println("gemini");
//			}
//		}
//		
//		else if(month==7) {
//			if(date>=23) {
//				System.out.println("leo");
//			}
//			else {
//				System.out.println("cancer");
//			}
//		}
//		
//		else if(month==8) {
//			if(date>=23) {
//				System.out.println("vigro");
//			}
//			else {
//				System.out.println("leo");
//			}
//		}
//		
//		else if(month==9) {
//			if(date>=23) {
//				System.out.println("liber");
//			}
//			else {
//				System.out.println("vigro");
//			}
//		}
//		
//		else if(month==10) {
//			if(date>23) {
//				System.out.println("scoropo");
//			}
//			else {
//				System.out.println("libra");
//			}
//		}
//		
//		else if(month==11) {
//			if(date>=22) {
//				System.out.println("sagittarius");
//			}
//			else {
//				System.out.println("scoripio");
//			}
//		}
//		
//		else if(month==12) {
//			if(date>=22) {
//				System.out.println("capricorn");
//			}
//			else {
//				System.out.println("sagittarius");
//			}
//		}
//		
//		else {
//			System.out.println("invalid input");
//		}
		
		
		//triangle
		
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		int c=sc.nextInt();
//		
//		int angle=a+b+c;
//		
//		if(angle==180) {
//			if(a==90||b==90||c==90) {
//				System.out.println("price1");
//			}
//			else if(a==b && b==c && c==a) {
//				System.out.println("price2");
//			}
//			
//			else {
//				System.out.println("price 3");
//			}
//		}
//		
//		else {
//			System.out.println("not");
//		}
//		======================================
	
		
//		int y=sc.nextInt();
//		int ly=0;
//		int ry=0;
//		int given_year=1900;
//		y=(y-1)-given_year;
//		ly=y/4;
//		ry=y-ly;
//		int totalDays=(ry*365)+(ly*366)+1;//you want the first and secnod any of with 7 day to use th 1,2,3,4,5,6,7/
//		int day=totalDays%7;
//		if(day==0) {
//			System.out.println("mon");
//		}
//		else if(day==1) {
//			System.out.println("tus");
//		}
//		else if(day==2) {
//			System.out.println("wed");
//		}
//		else if(day==3) {
//			System.out.println("tur");
//		}
//		else if(day==4) {
//			System.out.println("fri");
//		}
//		else if(day==5) {
//			System.out.println("sat");
//		}
//		else if(day==6) {
//			System.out.println("sun");
//		}
//		else {
//			System.out.println("not match");
//		}
//		==========================================================
		
		
		//lucas sequence to add most recent three digits
		
//		int n1=2,n2=3,n3=2;
//		System.out.print(n1+","+n2+","+n3);
//		
//		int l=5;
//		for(int i=3;i<l;i++) {
//			int n4=n1+n2+n3;
//			System.out.print(","+n4);
//			n1=n2;
//			n2=n3;
//			n3=n4;
//		}
//		
		
		// fibbinocise series
		
//		int n=5;
//		
//		int num1=1;
//		int num2=2;
//		
//		System.out.print(num1+","+num2+",");
//		for(int i=2;i<n;i++) {
//			int num3=num1+num2;
//			System.out.print(num3+",");
//			num1=num2;
//			num2=num3;
//		}
//		
		
	//trendy number : three digit number are called trendy number
		
//		int n=sc.nextInt();
//		if(n>=100 && n<=999) {
//			int t=n/10; 
//			t=t%10;
//			System.out.println(t);
//			if(t%3==0) {
//				System.out.println("trendy number");
//			}
//			else {
//				System.out.println("not");
//			}
//		}
//		
	//	spacialnumber
//		int j,sum=0,pro=1,sum1=0;
//		int a=sc.nextInt();
//		int b=sc.nextInt();
//		
//		for(int i=a;i<=b;i++) {
//			j=i;
//			int first=i/10;
//			int second=i%10;
//			sum=first+second;
//			pro=first*second;
//			sum1=sum+pro;	
//			if(sum1==j) {
//				System.out.println("special num:"+sum1);
//			}
//			
//		}
		
		
		
	}
	

}

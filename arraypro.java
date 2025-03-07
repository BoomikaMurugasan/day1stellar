package stellararrayday3;

import java.util.Arrays;
import java.util.Scanner;

public class arraypro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//simple array program
		
//		System.out.println("enter the array size");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			System.out.println("enter the array values");
//			a[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<n;i++) {
//			System.out.print(a[i]+",");
//		}
		//=================================================================
		
		
		//sum of array value;
		
//		System.out.println("enter the array size");
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		int sum=0,pro=1;
//		for(int i=0;i<n;i++) {
//			System.out.println("enter the array value");
//			a[i]=sc.nextInt();
//		}
//		
//		for(int i=1;i<n;i++) {
//		//sum=sum+a[i];
//			pro=pro*a[i];
//		}
//		
//		System.out.println(pro);
//		
    //=====================================================================
		
		//min and max
		
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		int min=789;
//		int max=3;
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<n;i++) {
//			if(min>a[i]) {
//				min=a[i];
//			}
//			
//			if(max<a[i]) {
//				max=a[i];
//			}
//		}
//		System.out.println(min);
//		System.out.println(max);
//		
		//===================================================================
		
		
		//count the number of hoe many number are repeat in array
		
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		int v[]=new int[n];
//		
//	
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<n;i++) {
//			int c=0;
//			if(v[i]!=-1) {
//				c++;
//				for(int j=i+1;j<n;j++) {
//					if(a[i]==a[j]) {
//						c++;
//						v[j]=-1;
//					}
//				}
//				v[i]=c;
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			System.out.println(a[i]+" "+v[i]);
//		}

		//=====================================================================
		
		//simpled example of Array.toString
		
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		System.out.println(Arrays.toString(a));
//		
		//===========================================================
		
		
		//array delete
//		
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		System.out.println("you want to delete the index:");
//		int index=sc.nextInt();
//		
//		for(int i=index;i<a.length-1;i++) { //delete condition to applly for -1 to 
//			a[i]=a[i+1];
//		}
//		
//		for(int i=0;i<n-1;i++) {
//			System.out.println(a[i]);
//		}
		
		//====================================================
		
		
		//to identify the frist repeated number
		
//		int n=sc.nextInt();
//		int a[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			a[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<n;i++) {
//			int c=1;
//			
//			
//			for(int j=i+1;j<n;j++) {
//				
//			if(a[i]==a[j]) {
//				c++;
//				if(c==2) {
//					System.out.println(a[i]);
//					break;
//				}
//			}
//		   }
//		}  
		//=============================================================
		
		//2d array;
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
		//==============================================================
		
		//sum of digit in 2d array
		
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				sum=sum+a[i][j];
//			}
//		}
//		
//		System.out.println(sum);
	//===============================================================	
		
		//sum of rows array;
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		int sum[]=new int[n];
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				sum[i]=sum[i]+a[i][j];
//			}
//		}
//		for(int i=0;i<n;i++) {
//		System.out.println(sum[i]);
//		}
		//===========================================================
		// sum of daigonalls;
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==j) {
//					sum=sum+a[i][j];
//				}
//			}
//		}
//		System.out.println(sum);
	//=====================================================	
		//  secondary daigonal of sum
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i+j==n-1) {
//					sum=sum+a[i][j];
//				}
//			}
//			
//			
//		}
//		System.out.println(sum);
//==================================================
		//sum of lower triangle
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i>=j) {
//					sum=sum+a[i][j];
//					
//				}
//			}
//		}
//		
//		System.out.println(sum);
		//==========================================================
		
		//upper case of sum trigale
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		int sum=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i<=j) {
//					sum=sum+a[i][j];
//				}
//			}
//		}
//		System.out.println(sum);
		//==================================================
		//star sum
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}
		//===================================================
		//daigonal star
//		int n=sc.nextInt();
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==j) {
//					System.out.print("*");
//				}
//			}
//			System.out.println(" ");
//		}
		//===============================================
		
		//normal number
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		int s=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				 a[i][j]=sc.nextInt();..
//			}
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				s+=a[i][j]*a[i][j];
//			}
//		}
//		System.out.println((int)Math.sqrt(s));
		
		//===============================================================
	
		//middle age of cunt the daigonall;
//		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//
//			}
//		}
//		int c=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==j) {
//					if(a[i][j]>=18 && a[i][j]<=60) {
//						c++;
//					}
//				}
//			}
//		}
//		System.out.println(c);
		
		//======================================================================
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		int sum[]=new int[n];
//		int sum1[]=new int[n];
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//			}
//		}
//		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				sum[i]=sum[i]+a[i][j];
//				sum1[i]=sum[i]+a[j][i];
//			}
//		}
//		for(int i=0;i<n;i++) {
//			
//		
//		System.out.println("the row is:"+sum[i]);
//		System.out.println("the column is:"+sum1[i]);
//		}
		
		//===================================================
		
		///lower array print
		
//		int n=sc.nextInt();
//		
//		int a[][]=new int[n][n];
//		
//		int k=1;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i>=j) {
//				System.out.print(k+" ");
//				k++;
//				}
//				else {
//					System.out.print(" 0 ");
//				}
//			}
//			System.out.println();
//		}
		
		// grid
		
//		int n=sc.nextInt();
//		int a[][]=new int[n][n];
//		
//		int k=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				a[i][j]=sc.nextInt();
//				if(a[i][j]<11) {
//					k+=a[i][j];
//				}
//			}
//		}
//		
//		System.out.println(k);
		
		//==========================================================================
		
		
		
	}

}

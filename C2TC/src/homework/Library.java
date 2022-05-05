package homework;

import java.util.Scanner;

public class Library {

	int Acc_Num;
	String Title;
	String Author;
	void input() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter The Title Of Book: ");
		Title = sc.nextLine();
		System.out.println("Enter The Name Of Author: ");
		Author = sc.nextLine();
		System.out.println("Enter accession number");
		Acc_Num = sc.nextInt();
	}
	void compute() {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the no. of days late: ");
		int days = in.nextInt();
		int fine = days*5;
		System.out.println("Fine = Rs. "+fine);
	}
	void display() {
		System.out.println("AccessionNumber\tTitle\tAuthor");
        System.out.println(Acc_Num+"\t\t  "+ Title+ "\t   "+ Author);
        
	}
	public static void main(String[] args) {
		Library obj = new Library();
		obj.input();
		obj.compute();
		obj.display();
			
	    }
		
	}
	

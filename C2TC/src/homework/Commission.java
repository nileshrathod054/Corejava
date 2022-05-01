package homework;

import java.util.Scanner;

public class Commission {
String Name;
String Address;
double Phone;
double Sales_amt;
double commissionRate;

void input() {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Name of Sales_Employee: ");
	Name = sc.nextLine();
	System.out.println("Enter the Address of Sales_Employee: ");
	Address = sc.nextLine();
	System.out.println("Enter the Phone_No of Sales_Employee");
	Phone = sc.nextDouble();
}
void calculate() {
	Scanner cc = new Scanner(System.in);
	System.out.println("Enter the Sales_amt: ");
	double Sales_amt = cc.nextDouble();
	double commission = commissionRate*Sales_amt;
	
		if(Sales_amt>=100000) {
		
		commission = 0.1*Sales_amt;
	
	System.out.println("The Commission on the given Sales_amt is: " + commission);
	}

		else if (50000 <= Sales_amt||Sales_amt < 100000 ) {
		commission = 0.05*Sales_amt;
	
	System.out.println("The Commission on the given Sales_amt is: "+ commission);
	}

		else   if(30000 <= Sales_amt ||Sales_amt< 50000) {
		commission = 0.03*Sales_amt;
	System.out.println("The Commission on the given Sales_amt is: " +commission);
	
	} if(Sales_amt<30000) {
		 
		System.out.println("No commission");
	}	
	
}		
public static void main(String[] args) {
	Commission cs = new Commission();
	cs.input();
	cs.calculate();
}
}



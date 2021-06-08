package Day_3_OOPs;

import java.util.Scanner;

public class Account_holder {

	
		long AcNo;
		String name;
		double bal;
		Scanner sc = new Scanner(System.in);
		
		
		void accept()
		{
			//Scanner sc = new Scanner(System.in);
			System.out.println(" Enter Id , Name , bal");
			AcNo = sc.nextLong();
			name = sc.next();
			bal = sc.nextDouble();
		}
	
		void withdraw()
		{
			System.out.println("Enter Amount to withdraw");
			int amt = sc.nextInt();
			
			if(amt < bal)
			{
				bal = bal - amt;
			}else
			{
				System.out.println("Sorry....!!!! You dont have enough Balance");
			}
		}
		
		
		void deposit()
		{
			System.out.println("Enter Amount to deposit");
			int amt = sc.nextInt();
			
			bal = bal + amt;
			System.out.println("Succesful...");
		}
		
		void checkbal()
		{
			System.out.println("Balance is :"+bal);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account_holder a = new Account_holder();
		
		
		char ch ;
		int menu;
		do {
			Scanner sc = new Scanner(System.in);

			
			System.out.println("Menu....1.Insert.....2.Deposite.....3.Withdrwal...4.Balance ENquiry");
			menu = sc.nextInt();
			if(menu == 1)
			{
				a.accept();
			}else if(menu == 2)
			{
				a.deposit();
			}else if(menu == 3)
			{
				a.withdraw();
			}else if(menu == 4)
			{
				a.checkbal();
			}else
			{
				System.out.println("Wrong Choice");
			}
			
			System.out.println("Do you Want to Continue...Press Y for yes N for No");
			ch = sc.next().charAt(0);

		}while(ch != 'n'|| ch!='N');
		
		a.accept();
		a.deposit();
	a.withdraw();
		a.checkbal();
		//int aa = a.hashCode();
		//System.out.println(aa);
		//System.out.println(a);
		//System.out.println(b);
		//System.out.println(c);
	}

}

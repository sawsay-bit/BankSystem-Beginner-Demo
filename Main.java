import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int balance = 3000;
	    String customerName;
	    String customerID;

	    String option;
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter Your name please");
	    customerName = scanner.nextLine();
	    System.out.println("Enter your cID please");
	    customerID = scanner.nextLine();
	    if(customerName.equals("kaiser")){
	        if(customerID.equals("kaiser123")){
	            System.out.println("Welcome kaiser!");
				System.out.println(" #Choose an option#");
				System.out.println("A for checking balance");
				System.out.println("B for deposit");
				System.out.println("C for withdraw");
				System.out.println("E for exist");
				System.out.println("Enter an option");
				option = scanner.nextLine();
				switch(option){
					case ("A"):
						System.out.println("Your balance is " + balance + " Euro.");
						break;
					case "B":

						System.out.println("Enter deposit amount!");
						int deposit = scanner.nextInt();
						int balance1 = balance + deposit;
						System.out.println("Your currently balance now is : " + balance1 + " Euro");
						break;
					case "C":
						System.out.println("Enter withdraw amount");
						int withdraw = scanner.nextInt();
						int balance2 = balance - withdraw;
						System.out.println("Your currently balance now is : " + balance2 + " Euro");
						break;
					case "E":
						System.out.println("Thank you for using our services!");
						break;
					default:
						System.out.println("Try again please");

				}
            }
        }else{
	        System.out.println("Try again!");
        }
    }
}

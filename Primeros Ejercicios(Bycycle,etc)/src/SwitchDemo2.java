import java.util.Scanner;
class SwitchDemo2 {
	public static void main(String[] args) {
		int year = 2000;
		int numDays = 0;
		int month;
		
		Scanner inputValue;
		inputValue = new Scanner(System.in);
		month = inputValue.nextInt();
		switch (month) {
			case 1: case 3: case 5:
			case 7: case 8: case 10:
			case 12: 
			    numDays = 31;
			    break;
		    case 4: case 6:
		    case 9: case 11:
		        numDays = 30;
		        break;
		    case 2:
		        if (((year % 4 == 0) &&
		             !(year % 100 == 0))
		             || (year % 400 == 0))
		             numDays = 29;
		        else 
		             numDays = 28;
		        break;
		    default:
		        System.out.println("Invalid month");
		        break;
		}
		 System.out.println("Number of Days = " + numDays);
	}
}
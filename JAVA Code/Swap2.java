import java.util.*;

class Swap2{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter 1st Number: ");
	int num1=sc.nextInt();
	System.out.print("Enter 2nd Number: ");
	int num2=sc.nextInt();

	num1=num1+num2;
	
	num2=num1-num2;

	num1=num1-num2;
	
	System.out.println("1st Number After Swap: "+num1);
	System.out.println("2nd Number After Swap: "+num2);
	sc.close();
	
}
}
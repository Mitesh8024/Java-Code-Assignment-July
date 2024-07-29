import java.util.*;

class FactorialRecursion{
public static int fact(int num){
		if (num==0)
			return 1;
		else
			return num*fact(num-1);
	}
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number to get Factorial of it.");
	int num=sc.nextInt();
	
	int result= fact(num);
	System.out.println("Factorial of: "+num+" is: "+result );
	sc.close();
	
}
}
import java.util.*;

class Factorial{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number to get Factorial of it.");
	int num=sc.nextInt();
	int result = 1;
	for (int i = num; i>0;i--){
	result= result*i;
	}
	System.out.println("Factorial of: "+num+" is: "+result );
	sc.close();
}
}
import java.util.*;

class EvenOdd{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	
	System.out.println("Enter Number to check Wheather it is Even or Odd.");
	int num=sc.nextInt();

	if(num%2==0){
	System.out.println(num+" :Number is Even.");
	}
	else{
	System.out.println(num+" :Number is Odd.");
	}
	sc.close();
}
}
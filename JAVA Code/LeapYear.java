import java.util.*;

class LeapYear{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number: ");
	int num=sc.nextInt();
	
	if ((num%4==0 && num%100!=0) || num%400==0){
	System.out.println(num+ " :Leap Year");
	}else {
	System.out.println(num+ " :Not a Leap Year");
	}
	
	sc.close();
	
}
}
import java.util.*;

class LeapYear{
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number: ");
	int num=sc.nextInt();
	
	if (num<0){
	System.out.println(num+ " :Negative Number");
	}else{
	System.out.println(num+ " :Positive Number");
	}
	sc.close();
	
}
}
import java.util.*;
public class test {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number :");
	int n=in.nextInt();
	if(n==0)
	{
		System.out.println("ZERO");
	}
	if(n<0)
	{
		System.out.println("NEGATIVE");
	}
	else {
		System.out.println("POSITIVE");
	}
}
}

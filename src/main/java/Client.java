
import java.util.Scanner;
public class Client{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principal Amount: ");
	float p= sc.nextFloat();
	System.out.println("Enter rate of interest:");
	float r=sc.nextFloat();
	System.out.println("Enter time in years");
	int t = sc.nextInt();
	Simple si= new Simple();
	System.out.println("The  Simple Interest amount is:"+si.simpleinterest(p,r,t));
	Compound ci = new Compound();
	System.out.println("The Compound Ingterest amount is:"+ci.compoundinterest(p,r,t));
	System.out.println("Choose the type of materials used for construction");
	System.out.println("1.Standard");
	System.out.println("2.Above Standard");
	System.out.println("3.High Standard Materials");
	System.out.println("4.High Standard Materials and Fully Automated");
	int standard= sc.nextInt();
	System.out.println("Enter total area of house:");
	float totarea=sc.nextFloat();
	HouseCost hc = new HouseCost();
	System.out.println("Estimated Cost for Construction of House is Rs."+hc.calculatecost(standard,totarea));
	
}
}

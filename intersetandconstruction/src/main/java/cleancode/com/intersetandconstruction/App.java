package cleancode.com.intersetandconstruction;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.lang.*;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner in = new Scanner(System.in);
    	System.out.println("for house construction press 1");
    	System.out.println("for Interset Calculation construction press 2");
    	int n = in.nextInt();
    	if(n  == 1) {
    		System.out.println("Here we will give you different option to build your own house with cost in Indian rupee for construction of square feet according to your wish ");
        	HashMap< String, Integer> housestandards = new HashMap<String, Integer>();
        	housestandards.put("Standard Material", 1200);
        	housestandards.put("Above Standard Material", 1500);
        	housestandards.put("Above Standard Material", 1500);
        	housestandards.put("High Standard Material", 1800);
        	housestandards.put("High Standard Material and fully automated home", 1500);
        	for (Entry<String, Integer> entry : housestandards.entrySet())  {
                System.out.println("Type of house = " + entry.getKey() + 
                                 ", cost per square feet  = " + entry.getValue()); 
        	}
        	System.out.println("write the type of your wish construction same as given  above");
        	in.nextLine();
        	String standard = in.nextLine();
        	System.out.println("Enter the area of your home in square feet");
        	float  squarefeet = in.nextFloat();
        	float cost = housestandards.get(standard) * squarefeet;
        	System.out.println(cost);
    	}
    	if(n == 2) {
    		System.out.println("give principalamount");
    		double principalamount = in.nextFloat();
    		System.out.println("give rateofinterset");
        	double  rateofinterestpyear = in.nextFloat();
        	System.out.println("give years");
        	double years = in.nextFloat();
            System.out.println("To calculate Simple Interest press 1");
            System.out.println("To calculate Compound Interest press 2");
            int n1 = in.nextInt();
            if(n1 == 1) {        	
            	Simpleinterest SI = new Simpleinterest(principalamount,years,rateofinterestpyear);
            	System.out.println(SI.findsimpleinterest());
            }
           else if(n1 == 2) {
            	Compoundinterest CI = new Compoundinterest(principalamount,years,rateofinterestpyear);
            	System.out.println(CI.findcompoundinterest());
            }
            else {
            	System.out.println("No such option is available");
            }
    	} 	
    	
        
    }
}

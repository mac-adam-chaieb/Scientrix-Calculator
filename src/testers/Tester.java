package testers;

import scientrix.core.parsing.Parser;
import scientrix.core.syntax.Operation;

public class Tester 
{
	public static void main(String[] args)
	{
		String e = "2max3max7*6lcm9";
		long t = System.currentTimeMillis();
		Operation o = Parser.makeOperation(e);
		System.out.println("Time to construct expression in milliseconds: "+(System.currentTimeMillis()-t));
		t = System.currentTimeMillis();
		System.out.println("Result of operation: "+o.evaluate());
		//time taken to construct expression tree and evaluate it
		System.out.println("Time to evaluate expression in milliseconds: "+(System.currentTimeMillis()-t));
		System.out.println("Operation formed: "+o.toString());
		System.out.println("Number of operations: "+o.length());
	}
}

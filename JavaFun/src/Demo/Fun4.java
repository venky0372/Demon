package Demo;

public class Fun4 {
	public static void main(String args[]) {
		if(args.length==0)
			System.out.println("No values");
		else
			for(String i:args)
				System.out.print(i+",");
	}

}

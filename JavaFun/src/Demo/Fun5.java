package Demo;

public class Fun5 {
	public static void main(String args[]) {
		 char a =args[0].charAt(0);
		    if(a>=48 && a<=57)
		    	System.out.println("Digits");
		    else if((a>='a' && a<='z')||(a>='A' && a<='Z'))
		    	System.out.println("Alphabets");
		    else
		    	System.out.println("Special charecters");
	}

}

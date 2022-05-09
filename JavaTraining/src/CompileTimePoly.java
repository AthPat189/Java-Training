class Help {
  
    static int Multiply(int a, int b)
    {
        return a * b;
    }
 

    static double Multiply(double a, double b)
    {
        return a * b;
    }
}
public class CompileTimePoly {

	public static void main(String[] args) {
		 System.out.println(Help.Multiply(2, 4));
	     System.out.println(Help.Multiply(5.5, 6.3));
	}

}

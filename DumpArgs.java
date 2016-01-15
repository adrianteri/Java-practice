/**
    Dump all command-line argiments to standard output.
    @author Adrian Teri
  */

public class DumpArgs
{  
	/**
	   Application entry point.

	   @param args array of command-line arguments
	 */
	   
	public static void main(String[] args)
	{
		System.out.println("Passes arguments:");
		for (int i = 0; i < args.length; i++)
			System.out.println(args[i]);
	}
}
import java.util.Scanner;

/** 
* @Author -- TkGitcode
*/
class NottoEligible  extends Exception  
{  
    public NottoEligible (String str)  
    {   
        super(str);  
    }  
}  
 class UserErrorhandling extends RuntimeException {
	private int n=0;
	static void Markvali(int mark) throws NottoEligible
	{
		if(mark<35)
		{
			throw new NottoEligible("Your Mark is not in Eligible criteria");
		}
		else
			System.out.println("You are Eligible");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Mark");
		int n=sc.nextInt();
		try
		{
		Markvali(n);
		}
		catch (NottoEligible  ec)
		{
			System.out.println("Error Exception occured: " + ec);  
		}
	}

}

package lap_program_8;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		GenerateException obj1=new GenerateException();
		try {
			obj1.compute();
		}
		catch(InputMismatchException ex) {
			System.out.println("run time InputMismatch error:"+ex.getMessage());
		}
		catch(ArithmeticException ex) {
			System.out.println("run time ArithmeticException error:"+ex.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("run time ArrayIndexOutOfBoundsException error:"+ex.getMessage());
		}
	}

}
class GenerateException{
	private int[] myarray=new int[5];
	private void readElements()
	{
		int n;
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		n=read.nextInt();
		System.out.println("Enter the array elements");
		for(int i=0;i<myarray.length;i++)
		{
			myarray[i]=read.nextInt();
		}
	}
	private void divideElements()
	{
		int small=getSmallestElement();
		for(int i=0;i<myarray.length;i++)
		{
			double result=myarray[i]/small;
		}
		System.out.println("Division is Successful");
	}
	private int getSmallestElement()
	{
		int small=myarray[0];
		for(int i=0;i<myarray.length;i++)
		{
			if(myarray[i]<small)
			{
				small=myarray[i];
			}
		}
		return small;
	}
	private void displayElement()
	{
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the index you want to access");
		int idx=read.nextInt();
		int val=myarray[idx];
		System.out.println("Value is:"+val);
	}
	void compute()
	{
		readElements();
		divideElements();
		displayElement();
	}
}

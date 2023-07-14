package collectionprog1;

import java.util.ArrayList;
import java.util.Scanner;

public class Sample1 
{

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		ArrayList a=new ArrayList();
		int choice=0;
		do
		{
			System.out.println("enter elememts");
			a.add(s1.nextInt());
			System.out.println("press 1 to cont.../press 0 to stop");
			choice=s1.nextInt();
		}while(choice==1);
		System.out.println(a);
	}

}

package collectonprog2;

import java.util.ArrayList;
import java.util.Scanner;

public class CollectionProg2 {

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		ArrayList a1=new ArrayList();
		int a=scan.nextInt();
		switch(a)
		{
		case 1:
		System.out.println("enter 1 for integer");
		a1.add(scan.nextInt());
		break;
		case 2:
			System.out.println("enter 2 for double");
			a1.add(scan.nextDouble());
			break;
		case 3:
			Syste.out.println("enter 3 for char");
			a1.add(scan.next().charAt(0));
		}
		System.out.println(a1);
	}

}

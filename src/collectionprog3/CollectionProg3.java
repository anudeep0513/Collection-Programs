package collectionprog3;

import java.util.Scanner;
import java.util.Vector;

public class CollectionProg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Vector v=new Vector();
		int index;
		do
		{
			System.out.println("enter double elements");
			v.add(6.6);
			v.add(2.2);
			v.add(3.5);
			v.add(12.45);
			v.add(17.89);
			v.add(14.56);
			System.out.println(v);
			System.out.println("enter index number to remove particular elements");
			index=scan.nextInt();
			v.remove(index);
			System.out.println(v);
		}while(index>5);
	}

}

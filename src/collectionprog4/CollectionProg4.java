package collectionprog4;

import java.util.LinkedList;
import java.util.Scanner;

public class CollectionProg4 {

	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		Scanner scan=new Scanner(System.in);
		int a=0;
		do
		{
			l.add(4);
			l.add(5);
			l.add(6);
			l.add(7);
			l.add(8);
			l.add(9);
			System.out.println(l);
			System.out.println("enter the index value to retrive element");
			System.out.println(l.get(scan.nextInt()));
		}while(a==1);

	}

}

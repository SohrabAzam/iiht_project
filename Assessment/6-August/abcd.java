import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<LinkedList<Student>> li=new ArrayList<LinkedList<Student>>();
		LinkedList<Student> lii=new LinkedList<Student>();
		lii.add(new Student("Rohan",34));
		lii.add(new Student("Rahul",25));
		LinkedList<Student> lii2=new LinkedList<Student>();
		lii2.add(new Student("Akash",14));
		lii2.add(new Student("Arya",54));
		li.add(lii);
		li.add(lii2);
		System.out.println(li);
		
		Iterator<LinkedList<Student>> ii=li.iterator();
		while(ii.hasNext())
		{
			LinkedList<Student> linkedlist=ii.next();
			Iterator<Student> ii2=linkedlist.iterator();
			while(ii2.hasNext())
			{
				System.out.println(ii2.next());
			}
		}
	}

}

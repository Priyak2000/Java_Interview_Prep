package top_20_java_program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveNull {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add(null);
		list.add("priya");
		list.add("ammu");
		list.add("riya");
		list.add(null);
		list.add("abi");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			
			if(itr.next()==null) {
				itr.remove();
			}
			
			
		}
		 System.out.println("List after removing nulls: " + list);
		 ArrayList<String> subList=new ArrayList(list.subList(1, 3));
		 System.out.println(subList);
	}

}

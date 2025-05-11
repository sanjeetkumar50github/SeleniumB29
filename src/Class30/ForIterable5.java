package Class30;

import java.util.ArrayList;


public class ForIterable5 {

	
	public static void main(String[] args) {
		ArrayList<String> data=new ArrayList<String>();
		data.add("A");
		data.add("B");
		data.add("C");
		data.add("D");
		
//		for(int i=0;i<data.size();i++) {
//			String s=data.get(i);
//		    System.out.println(s);
//		}
		
//		Iterator<String> iData = data.iterator();
//		while(iData.hasNext()) {
//			System.out.println(iData.next());
//		}
		
		for(String s:data)//for each works only on class which implements Iterable interface
		{
			System.out.println(s);
		}
	}
	
}

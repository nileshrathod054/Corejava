package stringEx;

public class IndexOfEx {

	public static void main(String[] args) {
		
		String s1 = "this is index of example";
		//Passing substring.
		
		int index1 = s1.indexOf("is");   //Returns the index of is substring
		
		int index2 = s1.indexOf("index"); //Returns the index of index substring
		
		System.out.println(index1+" "+index2); //2 8
		
		//Passing substring with from index.
		
		int index3 = s1.indexOf("is",4);  //Returns the index of is substring after 4th index
		
		System.out.println(index3); //5 i.e. the index of another is substring after 4th index.
		
		//Passing char value
		int index4 = s1.indexOf("s"); //Returns the index of s char value 
		
		System.out.println(index4); //3
		
	}

}

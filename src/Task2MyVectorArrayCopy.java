/*Copy all elements of a vector object to an array. Create a Vector with elements “First”, “Second”, “Third” and
“Random”. Create an Array of String and copy all the elements of the Vector into an Array. Then print all the
Elements of the Array.*/

import java.util.Vector;

public class Task2MyVectorArrayCopy {

	public static void main(String[] args) {
		
			Vector<String> vct = new Vector<String>();
			vct.add("First");
			vct.add("Second");
			vct.add("Third");
			vct.add("Random");
			System.out.println("Actual vector:"+vct);
			
			String arr[] = new String[4];
			
			vct.copyInto(arr);
			
			 System.out.println("The final array is: ");
		        for (String str : arr)
		            System.out.println(str);
			}
			}


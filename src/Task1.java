import java.util.Vector;

//1. Task to find whether the Vector contain all List Elements (Objects) :
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> vct = new Vector<String>();
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual vector:"+vct);
		
		System.out.println("Does the vector contains 'First'? "
                + vct.contains("First"));
		System.out.println("Does the vector contains 'Random'? "
                + vct.contains("Random"));
		System.out.println("Does the vector contains 'One'? "
                + vct.contains("One"));
		System.out.println("Does the vector contains 'Random'? "
                + vct.contains("Random"));

	}

}

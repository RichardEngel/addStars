import java.util.ArrayList;
import java.util.Collections;

public class Stars {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Testing: ");

        // Test Case 1
        Collections.addAll(list, "Richard", "E", "Engel");
        System.out.println("List: " + list);
        System.out.println("Modify List: " + addStars(list) + "\n");
        list.removeAll(list);

        // Test Case 2
        Collections.addAll(list, "Lord", "Of", "The", "Rings");
        System.out.println("List: " + list);
        System.out.println("Modify List: " + addStars(list) + "\n");
        list.removeAll(list);

        // Test Case 3
        Collections.addAll(list, "Park", "University");
        System.out.println("List: " + list);
        System.out.println("Modify List: " + addStars(list) + "\n");
        list.removeAll(list);

        // Test Case 4
        Collections.addAll(list, "the", "quick", "brown", "fox");
        System.out.println("List: " + list);
        System.out.println("Modify List: " + addStars(list) + "\n");
        list.removeAll(list);

        // Test Case 5
        Collections.addAll(list, "Hope");
        System.out.println("List: " + list);
        System.out.println("Modify List: " + addStars(list) + "\n");
        list.removeAll(list);

        // Test Case 6
        Collections.addAll(list, "United", "States", "Of", "America");
        System.out.println("List: " + list);
        System.out.println("Modify List: " + addStars(list) + "\n");
        list.removeAll(list);

        // Test Case 7
        Collections.addAll(list, "France", "Germany", "Italy", "Spain", "Scotland", "Russia");
        System.out.println("List: " + list);
        System.out.println("Modify List: " + addStars(list) + "\n");
        list.removeAll(list);

        System.out.println("End of Testing");
	} // End of main

    public static ArrayList<String> addStars(ArrayList<String> words){
        String star = "*";

        for (int i = 0; i <= words.size(); i += 2) {
            words.add(i, star);
        }
        
        return words;
    } // End of method addStars

} // End of Class Stars
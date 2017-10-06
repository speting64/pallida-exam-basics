import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueChars {
    public static void main(String[] args) {
        // Create a function called `uniqueCharacters` that takes a string as parameter
        // and returns a list with the unique letters of the given string
        // Create basic unit tests for it with at least 3 different test cases
        System.out.println(uniqueCharacters("anagram"));
        // Should print out:
        // ["n", "g", "r", "m"]
    }

    public static String uniqueCharacters(String s){

        ArrayList <String> str = new ArrayList<String>();

        int count = 0;
        for (int i =0 ; i < s.length(); i++){
            if(s.indexOf(i) == 'a'){
                s = str.remove(i);
                count++;
            }
        }
        return s;
    }
}
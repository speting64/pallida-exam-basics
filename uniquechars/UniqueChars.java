import java.util.ArrayList;
import java.util.List;

public class UniqueChars {
    import java.util.ArrayList;
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

        public static ArrayList <String> uniqueCharacters(ArrayList<String> s){

            char c = 'a';
            for (int i = s.size() ; --i >= 0;){

                String str = s.get(i);
                if(str.charAt(i) == 'a'){
                    s.remove(i);
                }
            }
            return s;

        }
}
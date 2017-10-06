import org.junit.Test;

import static org.junit.Assert.*;

public class UniqueCharsTest {

    @Test
    public void isEmpty() throws Exception {


    }

    @Test
    public void stringIsEqual() throws Exception {
        UniqueChars a = new UniqueChars();
        String s1 = "anagram";
        assertFalse(a.uniqueCharacters(s1,s));
    }

}

}
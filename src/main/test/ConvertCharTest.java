import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertCharTest {
    ConvertCharacter convertCharacter;

    @Before
    public void start(){
        convertCharacter = new ConvertCharacter();
    }

    @Test
    public void tetsWithKey2(){
        String s = "ABCDEF";
        String expected = "EFABCD";
        int key = 2;
        String actual = convertCharacter.decodeContent(s, key);
        assertEquals(expected, actual);
    }

    @Test
    public void testWithKey5(){
        String s = "ABCDEF";
        String expected = "BCDEFA";
        int key = 5;
        String actual = convertCharacter.decodeContent(s, key);
        assertEquals(expected,actual);
    }

    @Test
    public void testWithKey7(){
        String s = "ABCDEF";
        String expected = "FABCDE";
        int key = 7;
        String actual = convertCharacter.decodeContent(s, key);
        assertEquals(expected,actual);
    }
}

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class TestCountLengthString {

    private CountLengthString testList = new CountLengthString();

    @Test
    public void testNull() {
        ArrayList<Integer> result = testList.countLength(null);
        ArrayList<Integer> actual_result = new ArrayList<>();
        actual_result.add(0);
        assertEquals(result, actual_result);
    }

    @Test
    public void testEmpty() {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        ArrayList<Integer> result = testList.countLength(list);
        ArrayList<Integer> actual_result = new ArrayList<>();
        actual_result.add(0);
        assertEquals(result, actual_result);
    }

    @Test
    public void testHappyPath() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello ");
        list.add("world!");
        ArrayList<Integer> result = testList.countLength(list);
        ArrayList<Integer> actual_result = new ArrayList<>();
        actual_result.add(6);
        actual_result.add(6);
        assertEquals(result, actual_result);
    }
}

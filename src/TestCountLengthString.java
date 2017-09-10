import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

public class TestCountLengthString {

    private CountLengthString testList = new CountLengthString();

    @Test (expected = Exception.class)
    public void testNull() throws Exception {
        ArrayList<Integer> result = testList.countLength(null);
    }


    @Test
    public void testEmpty() throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        ArrayList<Integer> result = testList.countLength(list);
        ArrayList<Integer> actual_result = new ArrayList<>();
        actual_result.add(0);
        assertEquals(result, actual_result);
    }

    @Test
    public void testHappyPath() throws Exception {
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

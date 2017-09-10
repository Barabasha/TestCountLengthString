import java.util.ArrayList;

class CountLengthString {

    CountLengthString() {
    }

    ArrayList<Integer> countLength(ArrayList<String> list) throws Exception { //throws Exception {
        ArrayList<Integer> num_list = new ArrayList<>();
        if (list == null) {
            throw new Exception("List is null");
        }
        for (String elem : list) {
            num_list.add(elem.length());
        }
        return num_list;
    }
}
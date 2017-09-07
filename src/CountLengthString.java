import java.util.ArrayList;

class CountLengthString {

    CountLengthString() {
    }

    ArrayList<Integer> countLength(ArrayList<String> list) {
        ArrayList<Integer> num_list = new ArrayList<>();
        if (list == null) {
            num_list.add(0);
            return num_list;
        }
        for (String elem : list) {
            num_list.add(elem.length());
        }
        return num_list;
    }
}

package selfwork09.task01;

import java.util.ArrayList;

public class ListSort {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("2sc");
        list.add("9ds");
        list.add("0ds");
        list.add("and");
        list.add("hello");
        list.add("2gs");
        list.add("dsc");
        list.add("3dsc");
        System.out.println(sortDelete(list));

    }

    public static ArrayList<String> sortDelete(ArrayList<String> list) {

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).length() > 4) {
                list.remove(i);
            }
            if (list.get(i).matches("([0-9].*)")) {
                list.remove(i);
            }
        }
        return list;
    }
}


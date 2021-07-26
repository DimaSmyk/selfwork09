package selfwork09.task01;

import java.util.ArrayList;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("2sc");
        list.add("9ds");
        list.add("0ds");
        list.add("And");
        list.add("Hello");
        list.add("2gs");
        list.add("dsc");
        list.add("3dsc");
        System.out.println(sortDelete(list));

    }

    public static List<String> sortDelete (List<String> list) {
        List<String> list1= new ArrayList<>();
        for (int j = 0; j < list.size(); j++){
            if (list.get(j).length() < 4 && list.get(j).matches("([a-zA-Z].*)")){
                list1.add(list.get(j));
            }
        }return list1;
    }
}


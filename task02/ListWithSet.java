package selfwork09.task02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListWithSet {

    public static void main(String[] args) {
        List<String> uniqueList = new ArrayList<>();
        uniqueList.add("hello");
        uniqueList.add("hello");
        uniqueList.add("all");
        uniqueList.add("all");

        System.out.println(sortDelete(uniqueList));
    }

    public static List<String> sortDelete(List<String> list){

        Set<String> unique = new HashSet<>();
        unique.addAll(list);

        List<String> uniqueList1 = new ArrayList<>();
        uniqueList1.addAll(unique);
        return uniqueList1;

    }
}

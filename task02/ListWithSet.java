package selfwork09.task02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ListWithSet {

    public static void main(String[] args) {
        ArrayList<String> uniqueList = new ArrayList<>();
        uniqueList.add("hello");
        uniqueList.add("hello");
        uniqueList.add("all");
        uniqueList.add("all");

        System.out.println(sortDelete(uniqueList));
    }

    public static Set<String> sortDelete(ArrayList<String> list) {

        //Set<String> unique = new HashSet<>(list);
        //return unique;
        //сделал сначала так, IDEA предложила исправить на то как ниже
        return new HashSet<>(list);
    }
}

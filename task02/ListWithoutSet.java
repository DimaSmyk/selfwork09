package selfwork09.task02;


import java.util.ArrayList;
import java.util.List;

public class ListWithoutSet {

    public static void main(String[] args) {
        List<String> uniqueList = new ArrayList<>();

        uniqueList.add("abc");
        uniqueList.add("abc");
        uniqueList.add("abc");
        uniqueList.add("abce");
        uniqueList.add("abc2e");
        uniqueList.add("abce");
        uniqueList.add("abce");
        uniqueList.add("abc2e");
        System.out.println(sort(uniqueList));
    }

    public static List<String> sort(List <String> uniqueList) {
        List <String> newList = new ArrayList<>();
        for (String s : uniqueList){
            if (!newList.contains(s)){
                newList.add(s);
            }
        }return newList;
    }

}

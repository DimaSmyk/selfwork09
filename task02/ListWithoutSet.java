package selfwork09.task02;

import java.util.ArrayList;

public class ListWithoutSet {

    public static void main(String[] args) {
        ArrayList<String> uniqueList = new ArrayList<>();

        uniqueList.add("abc");
        uniqueList.add("abc");
        uniqueList.add("abc");
        uniqueList.add("abce");
        uniqueList.add("abc2e");
        uniqueList.add("abce");
        uniqueList.add("abce");
        uniqueList.add("abc2e");
        System.out.println(uniqueSort(uniqueList));
    }

    public static ArrayList<String> uniqueSort (ArrayList<String> uniqueList) {
        String str1;
        String str2;

        for (int i = 0; i < uniqueList.size(); i++) {
            str1 = uniqueList.get(i);

            for (int j = i + 1; j < uniqueList.size(); j++) {
                str2 = uniqueList.get(j);
                if (str1.equals(str2)) {
                    uniqueList.remove(j);
                    j--;
                }
            }
        }return uniqueList;
    }
}

package Lesson;

import java.util.*;

class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(6);
        list.add(1);
        list.add(5);
        list.add(4);
        list.add(6);

        System.out.println(list);

        //Дубли поддерживает
        String str1 = new String("Germany");
        String str2 = new String("Moscow");
        String str3 = new String("Minsk");
        String str4 = new String("Germany");

        LinkedList<String> list1 = new LinkedList<String>();
        list1.add(str1);
        list1.add(str2);
        list1.add(str3);
        list1.add(str4);

        System.out.println(list1.contains("Germany")); // есть ли элемент
        System.out.println(list1);

        TreeSet<Integer> list2 = new TreeSet<>(); //Строго последовательная коллекция и медленная
        list2.add(5);
        list2.add(4);
        list2.add(7);
        list2.add(9);

        System.out.println(list2);
    }
}

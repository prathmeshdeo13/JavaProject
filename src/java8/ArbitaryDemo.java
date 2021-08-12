package java8;

import java.util.Arrays;
import java.util.Comparator;

public class ArbitaryDemo {
    public static void main(String[] args) {


        String[] arr = {"array", "is", "java"};

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return toString().compareTo(o2);
            }
        };


        Arrays.sort(arr, String::compareToIgnoreCase);
        for (String Str : arr) {
            System.out.println(Str);

        MyInterface2 myInterface2 =Integer::sum;
            System.out.println(myInterface2.add(5,15));
        }
    }
}


interface MyInterface2{
        Integer add(int a,int b);
}



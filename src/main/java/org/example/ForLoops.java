package org.example;
import java.util.*;

public class ForLoops {
    public static void main(String[] args) {
        int[] arr={23,34,45,56};
        //Standard for loop
        System.out.println("Standard for loop");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        //Enhanced for loop
        System.out.println("\nEnhanced for loop");
        for (int i : arr){
            System.out.print(i+" ");
        }
        List<Integer> arr1=Arrays.asList(13,24,52,46);
        //Iterable method
        System.out.println("\nIterable Method");
        arr1.forEach(System.out::println);
        //Iterator method
        System.out.println("\nIterator method");
        Iterator<Integer> iterator=arr1.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        //Stream API Methods
        System.out.println("\nStream API Methods");
        //Map Method
        System.out.println("\nMap Method");
        System.out.println("Original List:-");
        for (int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println("\nModified List:-");
        arr1.stream().map(n->n+10).forEach(System.out::println);
        //Filter Method
        System.out.println("\nFilter Method");
        System.out.println("Original List:-");
        for (int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println("\nModified List:-");
        arr1.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}

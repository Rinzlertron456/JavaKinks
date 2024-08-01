package org.example;

import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        int res = list.stream().map(n -> n * 2).filter(n -> (n % 2 == 0)).reduce(0, (c, e) -> c + e);
        System.out.println(res);
    }
}
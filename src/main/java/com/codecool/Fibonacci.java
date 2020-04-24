package com.codecool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Fibonacci {

    private List<Integer> fibboNumbers = new ArrayList<>();

    public Fibonacci() {
        int firstElem = 0;
        int secondElem = 1;

        fibboNumbers.add(firstElem);
        fibboNumbers.add(secondElem);

        for(int i = 2; i<300; i++) {
            fibboNumbers.add(fibboNumbers.get(fibboNumbers.size() -2 )+ fibboNumbers.get(fibboNumbers.size() -1 ));
        }
    }

    public List<Integer> getFibboNumbers() {
        return fibboNumbers;
    }

    public Stream<Integer> getFiboStream() {
        return fibboNumbers.stream();
    }

    @Override
    public String toString() {
        return "Fibonacci{" +
                "fibboNumbers=" + fibboNumbers +
                '}';
    }
}

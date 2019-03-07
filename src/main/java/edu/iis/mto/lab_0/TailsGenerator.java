package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return new ArrayList<>();
        }

        int characters = value.length();
        return IntStream.rangeClosed(0, characters).mapToObj(x -> value.substring(x, characters)).collect(Collectors.toList());
    }

}


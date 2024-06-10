package ru.netology;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneBook {

    BidiMap person = new DualHashBidiMap();

    public int add(String name, String number) {
        if (!person.containsKey(name)) {
            person.put(name, number);
        }
        return person.size();
    }

    public String findByNumber(String number) {
        return (String) person.getKey(number);
    }

    public String findByName(String name) {
        return (String) person.get(name);
    }

    public String printAllNames() {
        List<String> names = new ArrayList<>();
        person.forEach((key, value) -> names.add((String) key));
        Collections.sort(names);
        return names.toString();
    }
}

package ru.job4j.search;

import jdk.jshell.PersistentSnippet;

import java.util.ArrayList;

public class PhoneDictionary {

    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }


    private boolean isExist(String key, Person person) {
    boolean result = false;
        if (person.getName() == key
                || person.getSurname() == key
                || person.getPhone() == key
                || person.getAddress() == key) {
           result = true;
        }
    return result;
    }

    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<Person>();
        for (Person person : this.persons) {
            if (isExist(key, person)) {
                result.add(person);
            }
        }
        return result;
    }


}

package ru.job4j.arraylisttelspravochnick;

import java.util.ArrayList;
import java.util.List;

/**
 * class PhoneDictionary.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 17.07.2018
 */
public class PhoneDictionary {
    /**
     * collection of persons.
     */
    private List<Person> persons = new ArrayList<Person>();

    /**
     * method add person.
     * @param person person
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public List<Person> find(String key) {
        List<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (person != null && (person.getName() == key || person.getAddress() == key || person.getSurname() == key || person.getPhone() == key)) {
                result.add(person);
            }
        }
        return result;
    }
}
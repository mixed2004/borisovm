package ru.job4j.arraylisttelspravochnicktest;

import org.junit.Test;
import ru.job4j.arraylisttelspravochnick.Person;
import ru.job4j.arraylisttelspravochnick.PhoneDictionary;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * class PhoneDictionaryTest.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 17.07.2018
 */
public class PhoneDictionaryTest {
    /**
     * public void whenFindByName.
     */
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        List<Person> persons = phones.find("Petr");
        assertThat(persons.iterator().next().getSurname(), is("Arsentev"));
    }
}
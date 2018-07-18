package ru.job4j.arraylisttelspravochnick;
/**
 * class Person.
 *
 * @author Maxim Borisov (mailto: mixed2004@mail.ru)
 * @version 1
 * @since 17.07.2018
 */
public class Person {
   /**
* name of person.
*/
 private String name;
    /**
     * surname of person.
     */
    private String surname;
    /**
     * phone of person.
     */
    private String phone;
    /**
     * address of person.
     */
    private String address;
    /**
     * constractor fo Person.
     * @param name name
     * @param surname surname
     * @param phone phone
     * @param address address
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }
    /**
     * method getName.
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * method getSurname.
     * @return surname
     */
    public String getSurname() {
        return surname;
   }
    /**
     * method getPhone.
     * @return phone
     */
   public String getPhone() {
        return phone;
    }
    /**
     * method getAddress.
     * @return address
     */
    public String getAddress() {
        return address;
    }
}
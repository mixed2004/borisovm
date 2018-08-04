package ru.job4j.sortuser;

/**
 * class User.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 04.08.2018
 */
public class User implements Comparable<User> {
    /**
     * age of user.
     */
    private int age;
    /**
     * name of user.
     */
    private  String name;

    /**
     * constractor for user.
     * @param name name
     * @param age age
     */
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * method of setting age.
     * @param age age user
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * method of getting age.
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * method of getting name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * method of setting name.
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.getAge();
    }
}

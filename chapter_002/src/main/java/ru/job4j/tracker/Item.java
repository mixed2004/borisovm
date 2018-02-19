package ru.job4j.tracker;
/**
 * class Item.
 *
 * @author Maxim Borisov (mail: mixed2004@mail.ru)
 * @version 1
 * @since 17.02.2018
 */
public class Item {
    /**
     * unique identificator id.
     */
    private String id;
    /**
     *field name of the question.
     */
    private String name;
    /**
     *field description of the question.
     */
    private String desk;
    /**
     *field date of issue creation.
     */
    private long created;
    /**
     *field array commentary.
     */
    private String[] comments;
    /**
     *constructor for item.
     * @param name name
     * @param desk description of the question.
     * @param created date of issue creation
     * @param comments array commentary.
     */
    public Item(String name, String desk, long created, String[] comments) {
        this.name = name;
        this.desk = desk;
        this.created = created;
        this.comments = comments;
    }
    /**
     *constructor for item.
     * @param name name
     * @param desk description of the question.
     * @param created date of issue creation
     */
    public Item(String name, String desk, long created) {
        this.name = name;
        this.desk = desk;
        this.created = created;
    }
    /**
     *constructor for item.
     * @param name name
     * @param desk description of the question.
     */
    public Item(String name, String desk) {
        this.name = name;
        this.desk = desk;
    }
    /**
     *constructor for item.
     */
    public Item() {

    }

    /**
     * assignment method id.
     * @param id unique identificator id.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * assignment method name.
     * @param name name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * assignment method description.
     * @param desk description
     */

    public void setDesk(String desk) {
        this.desk = desk;
    }
    /**
     * assignment method date of creation.
     * @param created date of creation
     */
    public void setCreated(long created) {
        this.created = created;
    }

    /**
     * assignment method comments.
     * @param comments array of strings comments
     */
    public void setComments(String[] comments) {
        this.comments = comments;
    }

    /**
     * method of obtaining id.
     * @return id unique identificator id.
     */
    public String getId() {
        return id;
    }

    /**
     * method of obtaining name.
     * @return name name.
     */
    public String getName() {
        return name;
    }

    /**
     * method of obtaining description.
     * @return desk description.
     */
    public String getDesk() {
        return desk;
    }

    /**
     * method of obtaining date of creation.
     * @return createt date of creation.
     */
    public long getCreated() {
        return created;
    }

    /**
     * method of obtaining comments.
     * @return comments array of comments.
     */
    public String[] getComments() {
        return comments;
    }
}
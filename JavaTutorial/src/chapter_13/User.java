/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String username;
    private int age;

    
    
    /**
     * 
     */
    public User() {
    }

    
    
    /**
     * @param id
     * @param username
     * @param age
     */
    public User(int id, String username, int age) {
        this.id = id;
        this.username = username;
        this.age = age;
    }

    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", age=" + age + "]";
    }
}

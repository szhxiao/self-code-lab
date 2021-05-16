/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

public class User implements Comparable<User> {
    private String username;
    private int age;

    
    
    /**
     * 
     */
    public User() {
    }

    /**
     * @param username
     * @param age
     */
    public User(String username, int age) {
        this.username = username;
        this.age = age;
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
        return "User [username=" + username + ", age=" + age + "]";
    }

    @Override
    public int compareTo(User o) {
        if (this.age > o.age) {
            return 1;
        }
        if (this.age == o.age) {
            return this.username.compareTo(o.username);
        }
        return -1;
    }

    
}

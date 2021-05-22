/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

public class Person {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String telNum;
    private String address;

    public Person() {

    }

    /**
     * @param name
     * @param age
     * @param sex
     * @param telNum
     * @param address
     */
    public Person(String name, int age, String sex, String telNum, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.telNum = telNum;
        this.address = address;
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
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }
    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
    /**
     * @return the telNum
     */
    public String getTelNum() {
        return telNum;
    }
    /**
     * @param telNum the telNum to set
     */
    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }



    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Id: ").append(id).append("#").append("\t");
        stringBuffer.append("Name: ").append(name).append("\t\t");
        stringBuffer.append("Age: ").append(age).append("\t\t");
        stringBuffer.append("Sex: ").append(sex).append("\t\t");
        stringBuffer.append("TelNum: ").append(telNum).append("\t\t");
        stringBuffer.append("Address: ").append(address);
        return stringBuffer.toString();
    }
    
    
}

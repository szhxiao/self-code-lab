/**
 * Java Tutorial
 * 
 * @author
 * @version 1st
 * @see 
 */

public class RegexTest {
    public static void main(String[] args) {
        // 内容限定
        // 长度限定
        // String regex = "[a-zA-Z0-9]{2,4}";
        // String content = "A0b";

        // String regex = "[a-z]{1}\\w{3,8}";
        // String content = "_a234sdf";

        String regex = "(\\d{3,4})-(\\d{7,8})";
        String content = "0931-5481541";
        System.out.println(content.matches(regex));
        
    }
}

/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.regex.*;
import java.io.*;
import java.util.*;

/**
 * Building the anonymous inner class "in-place"
 */

public class DirList3 {
    public static void main(String[] args) {
        File path = new File(".");
        String[] list;
        if(args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new FilenameFilter() {
                private Pattern pattern = Pattern.compile(args[0]);
                public boolean accept(File dir, String name) {
                    return pattern.matcher(name).matches();
                }
            });
        }
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for(String dirItem : list) {
            System.out.println(dirItem);
        }
    }
}

/*
output:
Directory.java
DirectoryDemo.java
DirFilter.class
DirList.class
DirList.java
DirList2$1.class
DirList2.class
DirList2.java
DirList3$1.class
DirList3.class
DirList3.java
PPrint.java
ProcessFiles.java
*/

/**
 * Thinking in Java
 *
 * @version 4th
 * @author Bruce Eckel
 * @see http://www.MindView.net
 */

import java.util.prefs.Preferences;

public class PreferencesTest {
    public static void main(String[] args) throws Exception{
        Preferences prefs = Preferences.userNodeForPackage(PreferencesTest.class);
        prefs.put("Location", "Oz");
        prefs.put("Footwear", "Ruby Slippers");
        prefs.putInt("Companions", 4);
        prefs.putBoolean("Are there witches?", true);
        int usageCount = prefs.getInt("UsageCount", 0);
        usageCount++;
        prefs.putInt("UsageCount", usageCount);
        for (String key : prefs.keys()) {
            System.out.println(key + ": " + prefs.get(key, null));
        }
        System.out.println("How many companions does Dorothy have? " + prefs.getInt("Companions", 0));
    }
}

/**
 * output:
 * Are there witches?: true
 * Companions: 4
 * Footwear: Ruby Slippers
 * Location: Oz
 * UsageCount: 1
 * How many companions does Dorothy have? 4
 */

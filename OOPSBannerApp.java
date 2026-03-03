}import java.util.HashMap;
import java.util.Map;

/**
 * UC8 - Use Map for Character Patterns and Render via Function
 */
public class OOPSBannerApp {

    private static final int HEIGHT = 7;

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = buildPatternMap();

        renderWord("OOPS", patternMap);
    }

    // Utility method to build pattern map
    private static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *****  ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * ",
                " *****  "
        });

        map.put('P', new String[]{
                "******  ",
                "*     * ",
                "*     * ",
                "******  ",
                "*       ",
                "*       ",
                "*       "
        });

        map.put('S', new String[]{
                " *****  ",
                "*       ",
                "*       ",
                " *****  ",
                "      * ",
                "      * ",
                " *****  "
        });

        return map;
    }

    // Method to render word using map
    private static void renderWord(String word, Map<Character, String[]> map) {

        for (int row = 0; row < HEIGHT; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                String[] pattern = map.get(ch);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }
}
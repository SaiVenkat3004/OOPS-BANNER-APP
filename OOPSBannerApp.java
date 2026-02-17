/**
 * UC3 - Print OOPS Banner using String.join()
 * @author Sai
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String gap = "   ";

        System.out.println(String.join(gap,
                " *****  ",
                " *****  ",
                " ****** ",
                " *****  "));

        System.out.println(String.join(gap,
                "*     * ",
                "*     * ",
                "*     * ",
                "*     * "));

        System.out.println(String.join(gap,
                "*     * ",
                "*     * ",
                "*     * ",
                "*       "));

        System.out.println(String.join(gap,
                "*     * ",
                "*     * ",
                "******  ",
                " *****  "));

        System.out.println(String.join(gap,
                "*     * ",
                "*     * ",
                "*       ",
                "      * "));

        System.out.println(String.join(gap,
                "*     * ",
                "*     * ",
                "*       ",
                "*     * "));

        System.out.println(String.join(gap,
                " *****  ",
                " *****  ",
                "*       ",
                " *****  "));
    }
}
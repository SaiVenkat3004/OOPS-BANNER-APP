public class OOPSBannerApp {

    public static void main(String[] args) {

        String gap = "  ";

        // Step 1: Create empty String array of 7 lines
        String[] banner = new String[7];

        // Step 2: Populate each line using String.join()
        banner[0] = String.join(gap,
                " ***** ",
                " ***** ",
                " ******",
                " ***** ");

        banner[1] = String.join(gap,
                "*     *",
                "*     *",
                "*      ",
                "*     *");

        banner[2] = String.join(gap,
                "*     *",
                "*     *",
                "*      ",
                "*     *");

        banner[3] = String.join(gap,
                "*     *",
                " ***** ",
                " ***** ",
                " ***** ");

        banner[4] = String.join(gap,
                "*     *",
                "*      ",
                "*      ",
                "*   *  ");

        banner[5] = String.join(gap,
                "*     *",
                "*      ",
                "*      ",
                "*    * ");

        banner[6] = String.join(gap,
                " ***** ",
                "*      ",
                "*      ",
                "*     *");

        // Step 3: Use enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
public class pFormatting {
    public static void main(String[] args) {
        double num1 = 1234567.456, num2 = 123.456, num3 = 123.456, num4 = 123456.789;
        int num5 = 123456;
        String name = "James";

        System.out.printf("display num1: %,.2f \n", num1);   // 1,234,567.46
        System.out.printf("display num2: %10.1f \n", num2);  // Rounded to one decimal place, in a field that is ten spaces wide
        System.out.printf("display num3: %08.1f \n", num3);  // Padded with leading zeros, in a field that is eight spaces wide, rounded to one decimal place
        System.out.printf("display num4: %,-20.2f \n", num4); // Left-justified, with comma separators, in a field that is 20 spaces wide, rounded to two decimal places.
        System.out.printf("display num5: %10d \n", num5);     // 10 spaces wide, with no comma separators.
        System.out.printf("display name: %20s \n", name); //name in a field that is 20 spaces wide.
    }
}

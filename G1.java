public class G1 {
    public static void main(String[] args) {
        int num1 = 99;
        int num2 = 85;
        int num3 = 95;
        // greatest number.
        if (num1 < num2 && num2 < num3)
            System.out.print(num3 + "is a Greatest Number.\n");
        else if (num3 < num1)
            System.out.print(num1 + "is a Greatest Number.\n");
        else
            System.out.print(num3 + "is a Greatest Number.\n");
    }

}

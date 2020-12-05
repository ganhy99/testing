import java.util.Scanner;

public class weightage {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        double total_w = 0;
        double total_achieved = 0;
        double this_w;
        double this_score;
        double this_max;
        String input;

        do {
            System.out.println("Component weightage: ");
            input = myscanner.next();
            if (input.equals("q")) {
                break;
            } else {
                this_w = Double.parseDouble(input);
                total_w += this_w;
            }
            System.out.println("Component max marks: ");
            this_max = myscanner.nextDouble();
            System.out.println("Component marks achieved: ");
            this_score = myscanner.nextDouble();
            total_achieved += this_score / this_max * this_w;
        } while (true);

        System.out.println("Total: " + (total_achieved / total_w * 100));





    }
}

package lang.print.gaps.task5;

public class NumberDivider {
    void divide(int toBeDivided) {
        if (toBeDivided != 0) {
            int result = toBeDivided / 5;
            int result1=toBeDivided%5;
            System.out.println(result+"."+result1);
        } else {
            System.out.println("Cannot divide by zero. Please provide a non-zero number.");
        }
    }

}

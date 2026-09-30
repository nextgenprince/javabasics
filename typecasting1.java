import java.util.*;

public class typecasting1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float a = 25.999f; // lossy conversion
        int b = (int)a;

        System.out.println(b);
    }
}
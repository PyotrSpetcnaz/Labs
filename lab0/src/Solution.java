import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double x;
        double y;
        double[] h = new double[3];
        try {
            System.out.println("Введите x:");
            x = Integer.parseInt(reader.readLine());
            System.out.println("Введите y:");
            y = Integer.parseInt(reader.readLine());
            System.out.println("Введите h:");
            h[0] = Double.parseDouble(reader.readLine());
            h[1] = Double.parseDouble(reader.readLine());
            h[2] = Double.parseDouble(reader.readLine());
            Diff.findAnswer(x, y, h);
        } catch (IOException e){
            System.out.println("Ошибка ввода");
        }
    }
}

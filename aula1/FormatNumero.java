import java.text.NumberFormat;

public class FormatNumero {
    public static void main(String[] args) {
        double divisao = 10.0/3.0;

        // System.out.println((float)10/3);
        // System.out.println(10/(float)3);
        System.out.println(10.0/3.0);
        System.out.println(valorFormato);

        System.out.println(String.format("%.2f", divisao));
    }
}

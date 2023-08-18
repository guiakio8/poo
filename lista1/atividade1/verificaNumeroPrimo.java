package lista1.atividade1;

/**
 * VerificaNumeroPrimo
 */
public class VerificaNumeroPrimo {
    public static void verificador(Integer n) {
        int cont = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        VerificaNumeroPrimo.verificador(7);
    }

}
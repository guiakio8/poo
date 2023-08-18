package lista1.atividade1;

/**
 * VerificaNumeroPrimo
 */
public class VerificaNumeroPrimo {
    public static void verificador() {
        int cont = 0;
        int n = 7;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                cont++;
            }
        }
        if (cont == 2) {
            System.out.println("Numero primo");
        } else {
            System.out.println("Nao e numero primo");
        }
    }

    public static void main(String[] args) {
        VerificaNumeroPrimo.verificador();
    }

}
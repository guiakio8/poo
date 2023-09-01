package revisao;

import revisao.ferramenta.Calculadora;
import java.util.Scanner;

public class ClasseExecutavel {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in); 
        Calculadora calc = new Calculadora();

        System.out.println("Insira o primeiro numero");
        calc.a = sc.nextInt();
        System.out.println("Insira o segundo numero");
        calc.b = sc.nextInt();

        System.out.println("Divisao [/] Multiplicacao [*] Soma [+] Subtracao[-]");
        String ope;
        ope = sc.next();
        calc.setOperador(ope);

        System.out.println("Resultado: " + calc.operar());

    }
}

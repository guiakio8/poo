package revisao;

import revisao.ferramenta.Calculadora;

public class ClasseExecutavel {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        Calculadora calc2 = new Calculadora();

        calc.a = 3;
        calc.b = 5;

        calc.setOperador("aaa");
        System.out.println(calc.operar());

    }
}

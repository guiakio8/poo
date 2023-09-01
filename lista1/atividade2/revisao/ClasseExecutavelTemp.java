package revisao;
import java.util.Scanner;

import revisao.ferramenta.Conversor;

public class ClasseExecutavelTemp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        Conversor cv = new Conversor();

        System.out.println("Insira a temperatura para a conversao");
        double temperatura = sc.nextDouble();
        cv.setTemp(temperatura);

        System.out.println("Insira a escala desejada para converter: Celsius [C] Fahrenheit [F]");
        String conversor = sc.next();
        cv.setEscala(conversor);

        System.out.println(cv.converter());
    }
    
}

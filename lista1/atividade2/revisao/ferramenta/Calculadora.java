package revisao.ferramenta;

public class Calculadora {

    public int a;
    public int b;
    private String operador;
   

    
    public int operar() {
        int ret = 0;

            if (this.operador.equals("+")) {
                ret = this.a + this.b;
            } else if (this.operador.equals("-")) {
                ret = this.a - this.b;
            } else if (this.operador.equals("*")) {
                ret = this.a * this.b;
            } else if (this.operador.equals("/")) {
                ret = this.a / this.b;
            } else {
                System.out.println("Operador invalido");
            }
        
        return ret;
    }
    
    public String getOperador() {
        return this.operador;
    }

    public void setOperador(String op){
    this.operador = op;
    
}

}

package revisao.ferramenta;

public class Calculadora {

    public int a;
    public int b;
    private String operador;

    public int operar() {
        int ret = 0;

        switch (this.operador) {
            case "+":
                ret = this.a + this.b;
                break;

            case "-":
                ret = this.a - this.b;
                break;

            case "*":
                ret = this.a * this.b;
                break;

            case "/":
                ret = this.a / this.b;
                break;

        }
        return ret;

    }

    public String getOperador() {
        return this.operador;
    }

    public void setOperador(String op){
    this.operador = op;

    switch (op) {
        Boolean erro = true;
    
        case "+":
            erro = false;
            break;
    
        case "-":
            erro = false;
            break;
        
        case "*":
            erro = false;
            break;
        
        case "/":
            erro = false;
            break;

    }
        
    
    if(erro = true){
        throw new Exception(message:"Operador inválido")

    }

        
}

}

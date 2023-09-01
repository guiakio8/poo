package revisao.ferramenta;

public class Conversor {
    private double temp;
    private String escala;

    public double converter(){
        double resultadoConversao = 0;

        if (this.escala.equals("F")){
            resultadoConversao = this.temp * 9/5 + 32;
        } else if(this.escala.equals("C")){
            resultadoConversao = (this.temp - 32) * 5/9;
        }


        return resultadoConversao;
    }


    public String getEscala() {
        return escala;
    }
    public void setEscala(String escala) {
        this.escala = escala;
    }
    public double getTemp() {
        return temp;
    }
    public  void setTemp(double temp) {
        this.temp = temp;
    }
}

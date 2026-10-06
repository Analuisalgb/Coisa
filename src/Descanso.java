public class Descanso {

    private int horas; // poderia ser inicializado no construtor

    private int semana; // poderia ser inicializado no construtor

    public Descanso() {
        horas = 0;
        semana = 1;
    }

    public void defineHorasDescanso(int horas) {
        this.horas = horas;
    }

    public void defineNumeroSemanas(int semana) {
        this.semana = semana;
    }

    public String getStatusGeral() {
        String status;
    if ((horas/semana) >= 26){
        status = "Descansado";
    }
    else {
        status = "Cansado";
    }
    return status;
    }

}
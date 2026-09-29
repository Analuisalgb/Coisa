public class Descanso {

    private int horas = 0;

    private int semana = 1;

    public Descanso() {
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
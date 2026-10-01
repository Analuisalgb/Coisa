public class RegistroTempoOnline {

    private String nomeDisciplina;

    private int tempoOnline;

    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        tempoOnlineEsperado = 120;
    }

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int horas) {
        tempoOnline += horas;
    }

    public boolean atingiuMetaTempoOnline() {
        if (tempoOnline < tempoOnlineEsperado){
            return false;
        }
        else{
            return true;
        }
    }

    public String toString() {
        return nomeDisciplina+ " " + tempoOnline +"/" + tempoOnlineEsperado;
    }

}
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
        // podera ser resumido para: return tempoOnline < tempoOnlineEsperado
        return tempoOnline >= tempoOnlineEsperado;
        }


    public String toString() {
        return nomeDisciplina+ " " + tempoOnline +"/" + tempoOnlineEsperado;
    }

    public int getTempoOnline() {
        return tempoOnline;
    }

}
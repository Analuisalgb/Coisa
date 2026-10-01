import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;

    private int horasDeEstudo;

    private double media = 7.0;

    private double[] notas = {0,0,0,0};

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        horasDeEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        notas[nota-1] = valorNota;
    }

    private double calculaMedia() {
        double soma = 0;
        for (double n: notas){
            soma += n;
        }
        return soma/4;
    }

    public boolean aprovado() {
        if (this.calculaMedia() >= media){
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
        return "- Discplina:"+nomeDisciplina+"\n- Horas de estudo:"+ horasDeEstudo +"\n- Média:" + this.calculaMedia()+"\n- Notas:" + Arrays.toString(notas);
    }

}
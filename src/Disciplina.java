import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;

    private int horasDeEstudo;

    private double media; // poderia inserir esses valores dentro do construtor

    private double[] notas; // poderia inserir esses valores dentro do construtor

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        media = 7.0;
        notas = new double[]{0, 0, 0, 0};
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
        // poderia ser só: return calculaMedia() >= media;
        return this.calculaMedia() >= media;
    }

    public String toString() {
        return nomeDisciplina+" "+ horasDeEstudo +" " + this.calculaMedia() +" " + Arrays.toString(notas);
    }

}
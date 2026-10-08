import java.util.Arrays;

public class Disciplina {

    private String nomeDisciplina;

    private int horasDeEstudo;

    private double media; // poderia inserir esses valores dentro do construtor

    private double[] notas;// poderia inserir esses valores dentro do construtor

    private int[] pesos;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        media = 7.0;
        notas = new double[4];
        pesos = new int[]{1, 1, 1, 1};
    }
    public Disciplina(String nomeDisciplina, int qntNotas) {
        this.nomeDisciplina = nomeDisciplina;
        media = 7.0;
        notas = new double[qntNotas];
        pesos = new int[qntNotas];
        for (int i = 0; i < qntNotas; i++){
            pesos[i] = 1;
        }
    }
    public Disciplina(String nomeDisciplina, int qntNotas, int[] listaPesos) {
        this.nomeDisciplina = nomeDisciplina;
        media = 7.0;
        notas = new double[qntNotas];
        pesos = new int[qntNotas];
        for (int i = 0; i < qntNotas; i++){
            pesos[i] = listaPesos[i];
        }
    }

    public void cadastraHoras(int horas) {
        horasDeEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        notas[nota-1] = valorNota;
    }

    private double calculaMedia() {
        double soma = 0;
        double peso = 0;
        for (int i = 0; i<notas.length;i++){
            soma += notas[i] * pesos[i];
            peso += pesos[i];
        }
        return soma/peso;
    }

    public boolean aprovado() {
        // poderia ser só: return calculaMedia() >= media;
        return this.calculaMedia() >= media;
    }

    public String toString() {
        return nomeDisciplina+" "+ horasDeEstudo +" " + this.calculaMedia() +" " + Arrays.toString(notas);
    }

}
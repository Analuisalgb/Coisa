import java.util.Arrays;

/**
 * Representação de uma disciplina definida pelo aluno.
 * Contém as horas de estudos, as suas notas e os seus respectivos
 * pesos.
 *
 * @author Ana Luísa Lopes
 */
public class Disciplina {

    private String nomeDisciplina;

    private int horasDeEstudo;

    /**
     * É final pois a média não é escolhida pelo aluno, e não muda
     * de disciplina para disciplina.
     */
    private final double MEDIA = 7.0;

    private double[] notas;

    private int[] pesos;

    /**
     * Constrói uma disciplina a partir do nome da disciplina.
     * Os outros atributos (notas e pesos) são setados para o padrão
     * de 4 notas e de média aritimética (pesos igual a um).
     *
     * @param nomeDisciplina nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        notas = new double[4];
        pesos = new int[]{1, 1, 1, 1};
    }

    /**
     * Constrói uma disciplina a partir do nome e da quantidade de
     * notas da disciplina. O peso será setado para o padrão da média
     * aritmétrica (pesos igual a um).
     *
     * @param nomeDisciplina nome da disciplina
     * @param qntNotas quantidade de notas da disciplina
     */
    public Disciplina(String nomeDisciplina, int qntNotas) {
        this.nomeDisciplina = nomeDisciplina;
        notas = new double[qntNotas];
        pesos = new int[qntNotas];
        for (int i = 0; i < qntNotas; i++){
            pesos[i] = 1;
        }
    }

    /**
     * Constrói uma disciplina a partir do nome, da quantidade de
     * notas da disciplina e dos pesos recebidos.
     * É importante lembrar que o peso do índice i é correspondente à
     * nota de índice i.
     *
     * @param nomeDisciplina nome da disciplina
     * @param qntNotas quantidade de notas da disciplina
     * @param listaPesos lista dos pesos de cada nota da disciplina
     */
    public Disciplina(String nomeDisciplina, int qntNotas, int[] listaPesos) {
        this.nomeDisciplina = nomeDisciplina;
        notas = new double[qntNotas];
        pesos = new int[qntNotas];
        for (int i = 0; i < qntNotas; i++){
            pesos[i] = listaPesos[i];
        }
    }

    /**
     * É um "set" que cadastra a quantidade de horas de estudo da
     * disciplina.
     *
     * @param horas horas estudadas
     */
    public void cadastraHoras(int horas) {
        horasDeEstudo = horas;
    }

    /**
     * É um "set" que define a nota tirada em determinada prova.
     *
     * @param nota informa a nota a ser alterada
     * @param valorNota diz qual o valor da nota a ser alterada
     */
    public void cadastraNota(int nota, double valorNota) {
        notas[nota-1] = valorNota;
    }

    /**
     * Calcula a média ponderada de uma disciplina a partir das suas
     * notas e do pesos da disciplina.
     *
     * @return A média ponderada obtida a partir do array de notas
     * e o array de pesos.
     */
    private double calculaMedia() {
        double soma = 0;
        double peso = 0;
        for (int i = 0; i<notas.length;i++){
            soma += notas[i] * pesos[i];
            peso += pesos[i];
        }
        return soma/peso;
    }

    /**
     * A função verifica se a média do aluno é suficiente para ser
     * aprovado, no caso, se a nota do aluno é maior ou igual à média
     * da faculdade.
     *
     * @return verifica se o valor da média do aluno é maior
     * ou igual a variável MEDIA
     *
     */
    public boolean aprovado() {
        return this.calculaMedia() >= MEDIA;
    }

    /**
     * Retorna a String que representa a disciplina. A representação
     * segue o formato:  nomeDaDisciplina horasDeEstudo media notas
     *
     * @return a representação em String de uma disciplina
     */
    @Override
    public String toString() {
        return nomeDisciplina+" "+ horasDeEstudo +" " + this.calculaMedia() +" " + Arrays.toString(notas);
    }

}
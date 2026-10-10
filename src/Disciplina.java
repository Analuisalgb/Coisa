import java.util.Arrays;

/**
 * A classe disciplina representa uma disciplina definida pelo aluno.
 * Contém as horas de estudos, as suas notas (com quantidade definida
 * ou não pelo usuário) e os seus pesos (com quantidade definida ou
 * não pelo usuário).
 *
 * Além disso, possibilita ver se o aluno está aprovado ou não, além
 * de retornar uma representação textual da disciplina que retorna
 * algum de seus atributos.
 *
 */
public class Disciplina {

    private String nomeDisciplina;

    private int horasDeEstudo;

    /**
     * Por escolha de implementação, achei melhor deixar o atributo
     * média como final, já que a média é a mesma para todas as
     * disciplinas.
     */
    private final double MEDIA = 7.0;

    private double[] notas;

    private int[] pesos;

    /**
     * O primeiro construtor recebe apenas o nome da disciplina, e
     * os outros atributos (notas e pesos) são setados para o padrão
     * de 4 notas e de média aritimética.
     *
     * @param nomeDisciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        notas = new double[4];
        pesos = new int[]{1, 1, 1, 1};
    }

    /**
     *
     * O segundo construtor recebe o nome da disciplina e a quantidade
     * de notas que serão utilizadas nessa disciplina. O peso será
     * setado para o padrão da média aritmétrica, que nesse caso é
     * igual a 1. Para mudar o valor usamos o for
     *
     * @param nomeDisciplina
     * @param qntNotas
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
     * O terceiro construtor recebe o nome da disciplina, a quantidade
     * de notas e também o valor do peso de cada nota.
     * É importante lembrar que o peso do índice i é correspondente à
     * nota de índice i.
     *
     * @param nomeDisciplina
     * @param qntNotas
     * @param listaPesos
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
     * É um setter que define a quantidade de horas de estudo da
     * disciplina.
     *
     * @param horas
     */
    public void cadastraHoras(int horas) {
        horasDeEstudo = horas;
    }

    /**
     * É um setter que define a nota tirada em determinada prova.
     * O parâmetro nota diz qual nota será alterada, e o parâmetro
     * valor nota diz por qual valor deve ser alterada.
     *
     * @param nota
     * @param valorNota
     */
    public void cadastraNota(int nota, double valorNota) {
        notas[nota-1] = valorNota;
    }

    /**
     *A função calculaMedia percorre todo o array de notas, pegando
     * cada nota e o adicionando à variavel soma, que posteriormente
     * será dividida pela adição de todos os pesos, obtendo por fim,
     * a média ponderada.
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
     * A função aprovado busca verificar se apartir das notas recebidas
     * e do peso estabelecido, se a nota do aluno é suficiente para
     * ser aprovado, no caso, se a nota do aluno é maior do que a média
     * da disciplina, ela retorna um valor booleano, sendo true aprovado
     * e false reprovado.
     *
     * @return a verificação se o valor da média do aluno (obtida pela
     * função calculaMedia) é maior do que a da nossa variável MEDIA
     *
     */
    public boolean aprovado() {
        return this.calculaMedia() >= MEDIA;
    }

    /**
     * A função toString dessa classe é um Override da função
     * toString da classe Object. Ela pega os atributos principais
     * da disciplina e os retorna em formato de String.
     *
     * @return no formato: nomeDaDisciplina horasDeEstudo media notas
     */

    @Override
    public String toString() {
        return nomeDisciplina+" "+ horasDeEstudo +" " + this.calculaMedia() +" " + Arrays.toString(notas);
    }

}
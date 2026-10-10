/**
 * A classe descanso busca organizar o descanso adequado dos
 * estudantes, acompanhando a rotina de descanso. Por isso, cada
 * aluno deve descansar 26 horas por semanas ou mais. Por padrão,
 * o status começa como cansado.
 */
public class Descanso {

    private int horas;
    private int semana;

    /**
     * O construtor não recebe nenhum parâmetro, já que eles serão
     * definidos posteriormente com os nossos sets
     *
     * Por padrão, horas recebe 0, e semana 1, para o status inicial
     * de descanso ser cansado. Semana é um, pois não existe divisão
     * por 0.
     *
     * @see #defineHorasDescanso
     * @see #defineNumeroSemanas
     */
    public Descanso() {
        horas = 0;
        semana = 1;
    }

    /**
     * É o nosso setter das Horas de descanso.
     * @param horas
     */
    public void defineHorasDescanso(int horas) {
        this.horas = horas;
    }

    /**
     * É o nosso setter da quantidade de semanas.
     * @param semana
     */
    public void defineNumeroSemanas(int semana) {
        this.semana = semana;
    }

    /**
     * Retorna como está o status de descanso de um aluno, tem como
     * possíveis valores Cansado ou Descansado.
     *
     * Obs: Se nenhum valor for setado, o status inicial será
     * cansado.
     *
     * @return O status do estudante em relação ao cansaso
     */
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
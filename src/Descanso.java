/**
 * A classe descanso busca organizar o descanso adequado dos
 * estudantes, acompanhando a rotina de descanso. Por isso, cada
 * aluno deve descansar 26 horas por semanas ou mais. Por padrão,
 * o status começa como cansado.
 *
 * @author Ana Luísa Lopes
 */
public class Descanso {

    private int horas;
    private int semana;

    /**
     * Constrói o descanso, não recebe nenhum parâmetro, já que eles
     * serão definidos posteriormente. Inicializa-se os atributos
     * horas e descanso.
     */
    public Descanso() {
        horas = 0;
        semana = 1;
    }

    /**
     * É o "set" das Horas de descanso.
     * @param horas horas de descanso
     */
    public void defineHorasDescanso(int horas) {
        this.horas = horas;
    }

    /**
     * É o "set" da quantidade de semanas.
     * @param semana quantidade de semanas
     */
    public void defineNumeroSemanas(int semana) {
        this.semana = semana;
    }

    /**
     * Retorna como está o status de descanso de um aluno:
     * Cansado ou Descansado.
     *
     * Obs: Se nenhum valor for definido, o status inicial será
     * cansado.
     *
     * @return O status do estudante em relação ao cansaço
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
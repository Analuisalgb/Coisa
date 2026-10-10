/**
 * A classe RegistroTempoOnline é responsável por manter a informação
 * sobre a quantidade de horas de internet que o aluno tem dedicado a
 * uma disciplina remota.
 *
 * @author Ana Luísa Lopes
 */
public class RegistroTempoOnline {

    private String nomeDisciplina;

    private int tempoOnline;

    private int tempoOnlineEsperado;

    /**
     * Constrói o registro de tempo online para uma disciplina a partir
     * do nome da disciplina que tem carga horária com o padrão de 60
     * horas, na qual o tempo online esperado seria 120.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        tempoOnlineEsperado = 120;
    }

    /**
     * Constrói o registro de tempo online para uma disciplina a partir
     * do nome da disciplina e do tempo online esperado
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado o tempo online esperado
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Adiciona tempo (em horas) ao atributo "tempoOnline"
     *
     * @param horas horas a serem adicionadas
     */
    public void adicionaTempoOnline(int horas) {
        tempoOnline += horas;
    }

    /**
     * Verifica se o tempo online registrado foi maior ou igual ao
     * tempo online esperado, ou seja, se ele atingiu a meta de
     * tempo online ou não.
     *
     * @return "true" se ele atingiu a meta online e "false"
     * se ele não atingiu a meta online.
     */
    public boolean atingiuMetaTempoOnline() {
        // podera ser resumido para: return tempoOnline < tempoOnlineEsperado
        return tempoOnline >= tempoOnlineEsperado;
        }

    /**
     * Retorna a String que representa o registro de tempo online. A
     * representação segue o formato "Disciplina tempoOnline/tempoEsperado"
     *
     * @return a String que representa o registro de tempo online
     * de uma disciplina
     */
    public String toString() {
        return nomeDisciplina+ " " + tempoOnline +"/" + tempoOnlineEsperado;
    }

}
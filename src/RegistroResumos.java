import java.awt.*;
import java.util.*;

/**
 * A classe RegistroResumos acompanha os estudos a partir de um
 *  registro de resumos de assuntos estudados. Nela é possível
 * inicializar um registro que armazenará uma quantidade limitada
 * de resumos.
 *
 * @author Ana Luísa Lopes
 */
public class RegistroResumos {

    private Resumo[] resumos;

    private int qntOcupados;

    private int iOcupados;

    private int max;

    /**
     * Constrói um registro de resumos a partir da quantidade de
     * resumos que o array pode receber. Além disso, inicializa os
     * atributos qntOcupados e iOcupados.
     *
     * @param numeroDeResumos quantidade de resumos que o array pode
     *                        receber
     */
    public RegistroResumos(int numeroDeResumos) {
        max = numeroDeResumos;
        this.resumos = new Resumo[max];
        qntOcupados = 0;
        iOcupados = 0;
    }

    /**
     * O método cria um objeto da classe resumo (apartir dos parámetros
     * recebidos de tema e conteúdo) e o adiciona dentro do registro.
     * Caso o array atinja a capacidade máxima, o primeiro resumo
     * cadastrado é substituido, e caso receba mais o segundo é
     * substituido, e assim sequencialmente.
     *
     * @param tema tema do resumo
     * @param conteudo conteudo do resumo
     */
    public void adiciona(String tema, String conteudo) {
        Resumo r = new Resumo(tema,conteudo);
        if (!temResumo(tema)){ // Poderia ser: !temResumo(Tema)
            if (this.qntOcupados < this.max) {
                this.resumos[iOcupados] = r;
                iOcupados += 1;
                qntOcupados += 1;
            } else {
                if (this.iOcupados < this.max) {
                    this.resumos[iOcupados] = r;
                    iOcupados += 1;
                } else{
                    iOcupados = 0;
                    this.resumos[iOcupados] = r;
                    iOcupados = 1;
                }
            }
        }

    }

    /**
     * O método pegaResumos retorna todos os resumos dentro do
     * registro, com os seus respectivos temas e conteúdos.
     *
     * @return retorna um array de string com todos o toString() de
     * todos os resumos que estão no array de resumos
     */
    public String[] pegaResumos() {
        String[] resumosPego = new String[qntOcupados];
        for (int e = 0; e < qntOcupados; e++){
            resumosPego[e] = resumos[e].toString();
        }
        return resumosPego;
    }

    /**
     * O método conta retorna quantos resumos há no registro.
     *
     * @return a quantidade de resumos no array
     */

    public int conta() {
        return qntOcupados;
    }

    /**
     * Lista a quantidade de resumos cadastrados, e após isso,
     * lista o tema de cada um dos resumos.
     *
     * @return uma string com a quantidade de resumos cadastrados e os
     * temas de todos os resumos.
     */

    public String imprimeResumos() {
        String out = "- "+ this.conta()+ " resumo(s) cadastrado(s)\n"+"- ";
        for (int o = 0; o < qntOcupados; o++ ){
            if (o < qntOcupados-1) {
                out += resumos[o].pegaTema()+" | ";
            }
            else{
                out += resumos[o].pegaTema();
            }
        }
        return out;
    }

    /**
     * Verifica-se se um resumo já existe dentro do registro a partir
     * do tema.
     *
     * @param tema tema do resumo que será verificado
     *
     * @return um booleano. "true" se já existe e "false" se não
     * foi encontrado nos registros.
     */
    public boolean temResumo(String tema) {

        for(int i = 0; i < qntOcupados; i++ ){
            if (resumos[i].pegaTema().equals(tema)) {
                // poderia também existir uma função equals dentro de resumo, na qual compara objetos Resumo com base no tema
                return true;
            }
        }
        return false;
    }

    /**
     * Busca procura uma sub-string dentro do conteúdo de todos
     * os resumos contidos em registros. Não é uma busca
     * case-sensitive, por isso o uso do ".lower()" .
     *
     * @param chaveDeBusca sub-string que queremos achar
     *
     * @return um array de strings, com todos os temas, ordenados em
     * ordem alfabética, onde a chave de busca foi encontrada.
     */
    public String[] busca (String chaveDeBusca){
         String[] encontrados = new String[qntOcupados];
         int iEncontrados = 0;
        chaveDeBusca = chaveDeBusca.toLowerCase();
        for(int i = 0; i < qntOcupados; i++ ){
            String conteudoResumo = resumos[i].pegaConteudo().toLowerCase();
            if (conteudoResumo.contains(chaveDeBusca)){
                encontrados[iEncontrados] = resumos[i].pegaTema();
                iEncontrados += 1;
            }
        }
        Arrays.sort(encontrados);
        return encontrados;
    }
}
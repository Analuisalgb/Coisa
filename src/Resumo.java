/**
 * A classe resumo define a estrutura dos resumos. Eles são pequenos
 * textos, descrições ou anotações referentes a um tema. Ele não está
 * associado a uma disciplina, e possui como identificador o tema.
 *
 * @author  Ana Luísa Lopes
 */
public class Resumo{
    private String tema;
    private String conteudo;

    /**
     * Constrói um tema a partir de seu tema e conteúdo.
     *
     * @param tema tema do resumo
     * @param conteudo pequenos textos e descrições referentes ao
     *                 tema.
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema do resumo em forma de String, é um getter.
     * @return tema
     */
    public String pegaTema(){
        return tema;
    }

    /**
     * Retorna o conteudo do resumo em forma de String, é um getter.
     * @return conteudo
     */
    public String pegaConteudo(){
        return conteudo;
    }

    /**
     * Retorna a String que representa um resumo. A representação segue
     * o formato "Tema: conteúdo".
     *
     * @return a representação de uma String de um aluno
     */
    @Override
    public String toString(){
        return this.tema + ": " + this.conteudo;
    }

    /**
     * Compara o nosso resumo a outro objeto. Se o objeto recebido for
     * um resumo, compara se os temas(identificadores) são iguais.
     *
     * @param obj   the reference object with which to compare.
     * @return valor booleano que indica se a igualdade é verdade
     * ou não.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (obj instanceof Resumo){
            Resumo objResumo = (Resumo) obj;
            if (objResumo.pegaTema().equals(this.tema)){
                return true;
            }
        }
        return false;
    }
}
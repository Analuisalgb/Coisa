public class Resumo{
    private String tema;
    private String conteudo;

    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }
    public String pegaTema(){
        return tema;
    }
    public String pegaConteudo(){
        return conteudo;
    }

    @Override
    public String toString(){
        return this.tema + ": " + this.conteudo;
    }
}
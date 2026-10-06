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
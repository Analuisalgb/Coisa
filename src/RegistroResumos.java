import java.util.Arrays;

public class RegistroResumos {

    private class Resumo{
        private String tema;
        private String conteudo;

        public Resumo(String tema, String conteudo) {
            this.tema = tema;
            this.conteudo = conteudo;
        }
        private String pegaTema(){
            return tema;
        }
        private String pegaConteudo(){
            return conteudo;
        }
    }


    private Resumo[] resumos;

    private int ocupados;



    public RegistroResumos(int numeroDeResumos) {
        Resumo[] resumos = new Resumo[numeroDeResumos];
        ocupados = 0;
    }

    public void adiciona(String tema, String conteudo) {
        Resumo r = new Resumo(tema,conteudo);
        if (temResumo(tema) == false){
        if (ocupados < resumos.length){
            resumos[ocupados] = r;
            ocupados = ocupados+1;
        }
        else {
            resumos[0] = r;
            ocupados = 1;
        }
        }

    }

    public Resumos[] pegaResumos() {
        return resumos;
    }

    public int conta() {
        return ocupados;
    }

    public String imprimeResumos() {

    }

    public boolean temResumo(String tema) {
        for(Resumo r: resumos){
            if (r.pegaTema().equals(tema)){
                return true;
            }
            return false;
        }
    }

}
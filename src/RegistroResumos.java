import java.awt.*;
import java.util.Arrays;

public class RegistroResumos {

    private Resumo[] resumos;

    private int ocupados;

    private int max;

    public RegistroResumos(int numeroDeResumos) {
        max = (int) (numeroDeResumos);
        this.resumos = new Resumo[max];
        ocupados = 0;

    }

    public void adiciona(String tema, String conteudo) {
        Resumo r = new Resumo(tema,conteudo);
        if (temResumo(tema) == false){
            if (this.ocupados < this.max) {
                this.resumos[ocupados] = r;
                ocupados = ocupados + 1;
            } else {
                resumos[0] = r;
                ocupados = 1;
        }
        }

    }

    public String[] pegaResumos() {
        String[] resumosPego = new String[ocupados];
        for (int e = 0; e < ocupados; e++){
            resumosPego[e] = resumos[e].toString();
        }
        return resumosPego;
    }

    public int conta() {
        return ocupados;
    }

    public String imprimeResumos() {
        String out = "- "+ ocupados+ " resumo(s) cadastrado(s)\n"+"- ";
        for (int o = 0; o < ocupados; o++ ){
            if (o < ocupados-1) {
                out += resumos[o].pegaTema()+" | ";
            }
            else{
                out += resumos[o].pegaTema();
            }
        }
        return out;
    }

    public boolean temResumo(String tema) {

        for(int i = 0; i < ocupados; i++ ){
            if (resumos[i].pegaTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }

}
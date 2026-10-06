import java.awt.*;
import java.util.Arrays;

public class RegistroResumos {

    private Resumo[] resumos;

    private int qntOcupados;
    private int iOcupados;

    private int max;

    public RegistroResumos(int numeroDeResumos) {
        max = (int) (numeroDeResumos);
        this.resumos = new Resumo[max];
        qntOcupados = 0;
        iOcupados = 0;
    }

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

    public String[] pegaResumos() {
        String[] resumosPego = new String[qntOcupados];
        for (int e = 0; e < qntOcupados; e++){
            resumosPego[e] = resumos[e].toString();
        }
        return resumosPego;
    }

    public int conta() {
        return qntOcupados;
    }

    public String imprimeResumos() {
        String out = "- "+ qntOcupados+ " resumo(s) cadastrado(s)\n"+"- ";
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

    public boolean temResumo(String tema) {

        for(int i = 0; i < qntOcupados; i++ ){
            if (resumos[i].pegaTema().equals(tema)) {
                // poderia também existir uma função equals dentro de resumo, na qual compara objetos Resumo com base no tema
                return true;
            }
        }
        return false;
    }

}
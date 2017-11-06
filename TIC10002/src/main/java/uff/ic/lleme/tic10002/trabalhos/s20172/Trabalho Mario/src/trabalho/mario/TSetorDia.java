/*
 * Trabalho de Estruturas de Dados.
 * Professor: Luis André Portes Paes Leme
 */
package trabalho.mario;

/**
 *
 * @author Mario João Jr.
 */
public class TSetorDia {
    int setor;
    int dia;
    
    public TSetorDia (int setor, int dia) {
        this.setor = setor;
        this.dia = dia;
    }

    public int getSetor() {
        return setor;
    }

    public int getDia() {
        return dia;
    }
    
    @Override
    public String toString () {
        return "(Setor: "+String.valueOf(setor)+", Dia: "+String.valueOf(dia)+")";
    }
}



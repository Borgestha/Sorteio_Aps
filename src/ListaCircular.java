
import java.util.Random;

public class ListaCircular {

    private Pessoa cabeca;
    private Pessoa cauda;
    private int n;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
    }

    public void adcF(String nome) {
        Pessoa novo = new Pessoa(nome);
        if (this.cabeca == null) {
            this.cabeca = novo;
            this.cauda = novo;
        } else {
            Pessoa temp = this.cauda;
            temp.setProximo(novo);
            this.cauda = novo;
        }
        this.n++;
        this.cauda.setProximo(this.cabeca);

    }

    public String sorteio() {
        if (this.cabeca == null) {
            return "Lista vazia";
        } else {
            Random aleatorio = new Random();
            Pessoa p = this.cabeca;
            int numeroAleatorio = aleatorio.nextInt(this.n);
            for (int i = 0; numeroAleatorio > i; i++) {
                p = p.getProximo();
            }
            return p.getNome();
        }
    }
}

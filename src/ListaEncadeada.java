
import java.util.Random;

public class ListaEncadeada {

    private Pessoa cabeca;
    private Pessoa cauda;
    private int quantidade;

    public ListaEncadeada() {
        this.cabeca = null;

    }

    public void addF(String nome) {
        Pessoa novo = new Pessoa(nome);
        if (this.cabeca == null) {
            this.cabeca = novo;
            this.cauda = novo;
        } else {
            Pessoa temp = this.cauda;
            temp.setProximo(novo);
            this.cauda = novo;
        }
        quantidade++;
        this.cauda.setProximo(this.cabeca);
    }

    public void mostra() {
        Pessoa aux = this.cabeca;
        while (aux != null) {
            System.out.println(aux.getNome());
            aux = aux.getProximo();
        }
    }

    public void addI(String nome) {
        Pessoa novo = new Pessoa(nome);
        if (cabeca == null) {
            this.cabeca = novo;
        } else {
            Pessoa aux = this.cabeca;
            cabeca = novo;
            novo.setProximo(aux);

        }

    }

    public String sorteio() {
        if (this.cabeca == null) {
            return "Lista vazia";
        } else {
            Random aleatorio = new Random();
            Pessoa p = this.cabeca;
            int numeroAleatorio = aleatorio.nextInt(this.quantidade);
            for (int i = 0; numeroAleatorio > i; i++) {
                p = p.getProximo();
            }
            return p.getNome();
        }
    }
}

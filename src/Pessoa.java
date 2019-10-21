
public class Pessoa {

    private String nome;
    private Pessoa proximo;
    private int tamanhoLista;

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.proximo = null;

    }

    public Pessoa getProximo() {
        return this.proximo;
    }

    public void setProximo(Pessoa proximo) {
        this.proximo = proximo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        nome = n;
    }

    public int getTamanhoLista() {
        return tamanhoLista;
    }

    public void setTamanhoLista(int i) {
        this.tamanhoLista = i;
    }
}

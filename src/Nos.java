public class Nos {
    private int informacao;
    private Nos proximo;

    public Nos() {
        this.informacao = 0;
        this.proximo = null;
    }

    public int getInformacao() {
        return informacao;
    }
    public void setInformacao(int informacao) {
        this.informacao = informacao;
    }
    public Nos getProximo() {
        return proximo;
    }

    public void setProximo(Nos proximo) {
        this.proximo = proximo;
    }
}

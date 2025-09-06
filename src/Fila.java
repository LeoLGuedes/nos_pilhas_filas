public class Fila {
    private Nos fila;

    public Fila() {
        this.fila = null;
    }

    private boolean vazio() {
        return this.fila == null;
    }

    public void insere(int valor) {
        Nos novono = new Nos();
        novono.setInformacao(valor);
        if (vazio()) {
            this.fila = novono;
        } else {
            Nos atual = this.fila;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novono);
        }
    }

    public void remove() {
        if (!vazio()) {
            int removido = this.fila.getInformacao();
            this.fila = this.fila.getProximo();
            System.out.println("Elemento removido: " + removido);
        } else {
            System.out.println("Fila vazia");
        }
    }

    public void imprime() {
        if (!vazio()) {
            Nos atual = this.fila;
            System.out.println("Elementos da fila:");
            while (atual != null) {
                System.out.println(atual.getInformacao());
                atual = atual.getProximo();
            }
        } else {
            System.out.println("Fila vazia");
        }
    }
}

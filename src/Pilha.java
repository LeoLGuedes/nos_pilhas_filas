public class Pilha {
    private Nos topo;

    public Pilha() {
        this.topo = null;
    }

    private boolean vazio() {
        return this.topo == null;
    }

    public void insere(int valor) {
        Nos novono = new Nos();
        novono.setInformacao(valor);
        novono.setProximo(this.topo);
        this.topo = novono;
    }

    public void remove() {
        if (!vazio()) {
            int removido = this.topo.getInformacao();
            this.topo = this.topo.getProximo();
            System.out.println("Elemento removido: " + removido);
        } else {
            System.out.println("Pilha vazia");
        }
    }

    public void imprime() {
        if (!vazio()) {
            Nos atual = this.topo;
            System.out.println("Elementos da pilha:");
            while (atual != null) {
                System.out.println(atual.getInformacao());
                atual = atual.getProximo();
            }
        } else {
            System.out.println("Pilha vazia");
        }
    }
}

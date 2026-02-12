public class ProdutoPerecivel extends Produto {
    int dataValidade;

    public int getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(int dataValidade) {
        this.dataValidade = dataValidade;
    }

    public ProdutoPerecivel(String nome, int preco, int quantidade,int dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "dataValidade:" + this.dataValidade +"dias"+
                '}';
    }
}

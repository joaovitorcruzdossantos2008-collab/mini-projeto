import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Produto> listadeprodutos = new ArrayList<>();
        Produto produto1 = new Produto("Sabao",3,2);
        Produto produto2= new Produto("detergemte",5,1);
        Produto produto3= new Produto("biscoito",2,2);
        Produto produto4= new Produto("leite",8,3);
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Maçã",3,3,4);
        listadeprodutos.add(produto1);
        listadeprodutos.add(produto2);
        listadeprodutos.add(produto3);
        listadeprodutos.add(produto4);
        listadeprodutos.add(produtoPerecivel1);
        System.out.println("Lista de produtos: " +listadeprodutos.size());
        System.out.println("Primeiro produto: " +listadeprodutos.get(0).toString());
        System.out.println("ProdutoPerecivel: " +listadeprodutos.get(4).toString());
        System.out.println(listadeprodutos);

    }
}
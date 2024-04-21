import java.util.ArrayList;
import java.util.List;

public class GerenciadorProdutos {
    private static List<Produto> produtos = new ArrayList<>();

    public static void cadastrarProduto(Produto produto) {
        produtos.add(produto);
    }

    public static List<Produto> getProdutos() {
        return produtos;
    }

    public static void excluirProduto(Produto produto) {
        produtos.remove(produto);
    }

    public static void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}


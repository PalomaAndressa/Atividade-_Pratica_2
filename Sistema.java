import java.util.Scanner;

public class Sistema {
    private static Scanner scanner = new Scanner(System.in);
    private static GerenciadorProdutos gerenciadorProdutos = new GerenciadorProdutos();

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de cadastro de produtos!");
        System.out.println("Este sistema permite cadastrar produtos como Alimentos, Eletrodomésticos e Livros.");

        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    GerenciadorProdutos.listarProdutos();
                    break;
                case 3:
                    excluirProduto();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close(); 
    }

    private static void exibirMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Excluir Produto");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        System.out.print("Digite a quantidade do produto: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Digite a data de validade (apenas para alimentos) ou modelo (apenas para eletrodomésticos): ");
        String extraInfo = scanner.nextLine();

        Produto produto;
        if (extraInfo.isEmpty()) {
            produto = new Alimento(nome, preco, quantidade, extraInfo);
        } else {
            produto = new Eletrodomestico(nome, preco, quantidade, extraInfo);
        }

        GerenciadorProdutos.cadastrarProduto(produto);
        System.out.println("Produto cadastrado com sucesso.");
    }

    private static void excluirProduto() {
        System.out.print("Digite o nome do produto a ser excluído: ");
        String nomeExclusao = scanner.nextLine();

        Produto produtoExcluir = null;
        for (Produto produto : GerenciadorProdutos.getProdutos()) {
            if (produto.getNome().equalsIgnoreCase(nomeExclusao)) {
                produtoExcluir = produto;
                break;
            }
        }

        if (produtoExcluir != null) {
            GerenciadorProdutos.excluirProduto(produtoExcluir);
            System.out.println("Produto excluído com sucesso.");
        } else {
            System.out.println("Produto não encontrado para exclusão.");
        }
    }
}


import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static void exibirMenu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Cadastrar Produto");
        System.out.println("2. Listar Produtos");
        System.out.println("3. Excluir Produto");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static int lerOpcao() {
        return scanner.nextInt();
    }

    public static String lerString() {
        scanner.nextLine(); 
        return scanner.nextLine();
    }

    public static double lerDouble() {
        return scanner.nextDouble();
    }

    public static int lerInt() {
        return scanner.nextInt();
    }
}

public class Eletrodomestico extends Produto {
    private String modelo;

    public Eletrodomestico(String nome, double preco, int quantidade, String modelo) {
        super(nome, preco, quantidade);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Modelo: " + modelo;
    }
}


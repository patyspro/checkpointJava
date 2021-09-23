package cadastroEscolar;

public class Telefone {
    public Telefone(int ddd, int numero) {
        this.ddd = ddd;
        this.numero = numero;
    }

    private int ddd;
    private int numero;
    private TelefoneTipo tipo;

    public Telefone(int ddd) {

    }

    public TelefoneTipo getTipo() {
        return tipo;
    }

    public void setTipo(TelefoneTipo tipo) {
        this.tipo = tipo;
    }

}

package s301N2;

public class NumeroTelefonFranca extends NumeroTelefon {

    public NumeroTelefonFranca(String prefix, String numero) {
        super(prefix, numero);
    }

    @Override
    public void imprimirNumeroTelefon() {
        System.out.println(getPrefix() + " " + getNumero());
    }
}

package s301N2;

public class NumeroTelefonEspanya extends NumeroTelefon {

    public NumeroTelefonEspanya(String prefix, String numero) {
        super(prefix, numero);
    }

    @Override
    public void imprimirNumeroTelefon() {
        System.out.println(getPrefix() + " " + getNumero());
    }
}

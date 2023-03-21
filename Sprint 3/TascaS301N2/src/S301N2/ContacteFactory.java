package S301N2;

public abstract class ContacteFactory extends AbstractContacteFactory {

    public abstract Direccio crearDireccio(String carrer, String ciutat, String codiPostal, String provincia, String pais);

    public abstract NumeroTelefon crearNumeroTelefon(String prefix, String numero);
}
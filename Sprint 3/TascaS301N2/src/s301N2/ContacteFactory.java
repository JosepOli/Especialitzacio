package s301N2;

public class ContacteFactory extends AbstractContacteFactory {


    @Override
    public Direccio crearDireccio(String carrer, String ciutat, String codiPostal, String provincia, String pais) {
        switch (pais) {
            case "Espanya":
                return new DireccioEspanya(carrer, ciutat, codiPostal, provincia, pais);
            case "França":
                return new DireccioFranca(carrer, ciutat, codiPostal, provincia, pais);
            default:
                throw new IllegalArgumentException("País no suportat");
        }
    }

    @Override
    public NumeroTelefon crearNumeroTelefon(String prefix, String numero) {
        switch (prefix) {
            case "+34":
                return new NumeroTelefonEspanya(prefix, numero);
            case "+33":
                return new NumeroTelefonFranca(prefix, numero);
            default:
                throw new IllegalArgumentException("Prefix no suportat");
        }
    }
}
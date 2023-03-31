package s301N2;

public class DireccioEspanya extends Direccio {

    public DireccioEspanya(String carrer, String ciutat, String codiPostal, String provincia, String pais) {
        super(carrer, ciutat, codiPostal, provincia, pais);
    }

    @Override
    public void imprimirDireccio() {
        System.out.println(getCarrer() + ", " + getCodiPostal() + " " + getCiutat() + ", " + getProvincia() + ", " + getPais());
    }
}

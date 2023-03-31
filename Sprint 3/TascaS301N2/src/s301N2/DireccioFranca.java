package s301N2;

public class DireccioFranca extends Direccio {

    public DireccioFranca(String carrer, String ciutat, String codiPostal, String provincia, String pais) {
        super(carrer, ciutat, codiPostal, provincia, pais);
    }

    @Override
    public void imprimirDireccio() {
        System.out.println(getCarrer() + ", " + getCiutat() + " " + getCodiPostal() + ", " + getProvincia() + ", " + getPais());
    }
}

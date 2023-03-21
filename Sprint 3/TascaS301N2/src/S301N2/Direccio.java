package S301N2;

public abstract class Direccio {

	private String carrer;
	private String ciutat;
	private String codiPostal;
	private String provincia;
	private String país;

	 // Getters i setters
    public String getCarrer() {
        return carrer;
    }
    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }
    public String getCiutat() {
        return ciutat;
    }
    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }
    public String getCodiPostal() {
        return codiPostal;
    }
    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getPaís() {
        return país;
    }
    public void setPaís(String país) {
        this.país = país;
    }

    // Mètode abstracte per imprimir la informació de la direcció
    public abstract void imprimirDireccio();
}

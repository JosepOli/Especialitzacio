package s301N2;

//classe abstracta que defineix les operacions per a crear direccions i números de telèfon
public abstract class AbstractContacteFactory {

	public abstract Direccio crearDireccio(String carrer, String ciutat, String codiPostal, String provincia, String pais); // Mètode abstracte per a crear una nova direcció

	public abstract NumeroTelefon crearNumeroTelefon(String prefix, String numero); // Mètode abstracte per a crear un nou número de telèfon
}
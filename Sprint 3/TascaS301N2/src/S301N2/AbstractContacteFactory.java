package S301N2;

//classe abstracta que defineix les operacions per a crear direccions i números de telèfon
public abstract class AbstractContacteFactory {

	public abstract Direccio crearDireccio(); // Mètode abstracte per a crear una nova direcció

	public abstract NumeroTelefon crearNumeroTelefon(); // Mètode abstracte per a crear un nou número de telèfon
}
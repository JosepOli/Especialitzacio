package S302N2;

public class DeuteCompteBancari implements MetodePagament {
	@Override
	public void realitzarPagament(double importPagament, Callback callback) {
		System.out.println("Pagant " + importPagament + "amb deute en compte bancari.");
		callback.pagamentRealitzat(true);
	}
}
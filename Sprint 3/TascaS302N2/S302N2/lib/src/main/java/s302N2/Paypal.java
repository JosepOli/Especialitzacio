package s302N2;

public class Paypal implements MetodePagament {
    @Override
    public void realitzarPagament(double importPagament, Callback callback) {
        System.out.println("Pagant " + importPagament + " amb Paypal.");
        callback.pagamentRealitzat(true);
    }
}
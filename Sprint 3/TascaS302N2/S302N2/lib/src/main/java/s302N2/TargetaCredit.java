package s302N2;

public class TargetaCredit implements MetodePagament {
    @Override
    public void realitzarPagament(double importPagament, Callback callback) {
        System.out.println("Pagant " + importPagament + " amb targeta de crèdit.");
        callback.pagamentRealitzat(true);
    }
}
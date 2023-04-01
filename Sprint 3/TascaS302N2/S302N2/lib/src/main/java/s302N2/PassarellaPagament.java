package s302N2;

public class PassarellaPagament {

    public void processarPagament(MetodePagament metodePagament, double importPagament, Callback callback) {
        metodePagament.realitzarPagament(importPagament, callback);
    }
}
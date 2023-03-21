package s301n1;

class Comanda {
    private String nom;

    public Comanda(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
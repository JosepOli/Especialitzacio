package borsa_observer;

public class AgenciaBorsa implements Observer {

    private String nom; // Nom de l'agència de borsa

    // Constructor que estableix el nom de l'agència de borsa
    public AgenciaBorsa(String nom) {
        this.nom = nom;
    }

    // Actualitza l'estat de l'agència de borsa quan rep notificacions de l'AgentBorsa (Observable)
    @Override
    public void update(String message) {
        System.out.println("Agència " + nom + " ha rebut una actualització: Borsa " + message);
    }
}
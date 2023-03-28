package borsa_observer;

//AgentBorsa és l'Observable que notificarà als Observers (agències de borsa) 
//sobre canvis en l'estat de la borsa

public class AgentBorsa implements Observable {

    private String estatBorsa;// L'estat actual de la borsa

    // Registra un nou Observer (agència de borsa) per rebre notificacions
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Dona de baixa un Observer (agència de borsa) per deixar de rebre notificacions
    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifica a tots els Observers (agències de borsa) registrats sobre canvis en l'estat de la borsa
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(estatBorsa);
        }
    }
    
    // Estableix l'estat de la borsa i notifica als Observers (agències de borsa) sobre aquest canvi
    public void setEstatBorsa(String estatBorsa) {
        this.estatBorsa = estatBorsa;
        notifyObservers();
    }

}

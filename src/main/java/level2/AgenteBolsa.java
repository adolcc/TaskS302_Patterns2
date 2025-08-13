package level2;


import java.util.ArrayList;
import java.util.List;

public class AgenteBolsa {
    private List<AgenciaBolsa> observers = new ArrayList<>();
    private String estadoBolsa;

    public void agregarObservador(AgenciaBolsa observer) {
        observers.add(observer);
    }

    public void quitarObservador(AgenciaBolsa observer) {
        observers.remove(observer);
    }

    public void setEstadoBolsa(String estado) {
        this.estadoBolsa = estado;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (AgenciaBolsa observer : observers) {
            observer.actualizar(estadoBolsa);
        }
    }
}

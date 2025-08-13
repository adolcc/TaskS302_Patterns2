package level2;

public class Main {

    public static void main(String[] args) {
        AgenteBolsa agente = new AgenteBolsa();

        AgenciaBolsa agencia1 = new AgenciaBolsaConcreta("A1");
        AgenciaBolsa agencia2 = new AgenciaBolsaConcreta("A2");

        agente.agregarObservador(agencia1);
        agente.agregarObservador(agencia2);

        agente.setEstadoBolsa("subiendo");
        agente.setEstadoBolsa("bajando");
    }
}


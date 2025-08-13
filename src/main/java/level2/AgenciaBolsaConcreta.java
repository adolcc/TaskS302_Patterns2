package level2;

public class AgenciaBolsaConcreta implements AgenciaBolsa {
    private String nombre;

    public AgenciaBolsaConcreta(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String estadoBolsa) {
        System.out.println("Agencia " + nombre + " notificada: La bolsa está " + estadoBolsa);
    }
}
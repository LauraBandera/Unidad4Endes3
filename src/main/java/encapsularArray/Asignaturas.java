package encapsularArray;

public class Asignaturas {

	private String[] asignaturas;

    public Asignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public void setAsignatura(int n, String asig) {
        this.asignaturas[n] = asig;
    }

    // Setter y getter a partir de una copia
    public void setAsignaturasCopia(String[] var) {
        this.asignaturas = new String[var.length];
        for (int i = 0; i < var.length; i++) {
            setAsignatura(i, var[i]);
        }
    }

    // En este getter se crea una copia del array y lo devuelvo con lo cual no se modifica el
    // array original
    public String[] getAsignaturasCopia() {
        String[] var = new String[asignaturas.length];
        System.arraycopy(asignaturas, 0, var, 0, asignaturas.length);
        return var;
    }
}

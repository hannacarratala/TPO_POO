public class Tratamiento {

    private Especialidad especialidad;
    private boolean esUrgente;


    public Tratamiento(Especialidad especialidad, boolean esUrgente){
        this.especialidad = especialidad;
        this.esUrgente = esUrgente;
    }


    public boolean sosUrgente(){
        return esUrgente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}

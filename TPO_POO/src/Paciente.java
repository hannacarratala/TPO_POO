import java.util.HashSet;
import java.util.Set;

public class Paciente {

    private int id;
    private Set<Tratamiento> historiaClinica = new HashSet<>();

    public Paciente(int id){
        this.id = id;
    }

    public void agregarTratamiento(Tratamiento unTratamiento){
        historiaClinica.add(unTratamiento);
    }

    public Set<Tratamiento> getHistoriaClinica(){
        return historiaClinica;
    }


}

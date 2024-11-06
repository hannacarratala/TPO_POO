public class Main {

    public static void main(String[] args) {

        // ESPECIALIDADES

        Especialidad traumatologia = new Especialidad();
        Especialidad neurologia = new Especialidad();
        Especialidad clinicaGeneral = new Especialidad();
        Especialidad cardiologia = new Especialidad();


        // TRATAMIENTOS

        Tratamiento reduccion = new Tratamiento(traumatologia, true);
        Tratamiento resonancia = new Tratamiento(neurologia, true);
        Tratamiento extraccionSangre  = new Tratamiento(clinicaGeneral, false);
        Tratamiento vacuna = new Tratamiento(clinicaGeneral, false);
        Tratamiento hisopado = new Tratamiento(clinicaGeneral, true);
        Tratamiento holter = new Tratamiento(cardiologia, false);


        // OBRAS SOCIALES

        OSFull miOSFull = new OSFull();
        OSUrgencia miOSUrgencia = new OSUrgencia();
        OSLimitada miOSLimitada = new OSLimitada(2);
        OSEspecialidad miOSEspecialidadCardio = new OSEspecialidad(cardiologia);
        OSTratamiento miOSTratemientoSangre = new OSTratamiento(extraccionSangre);


        // PACIENTES

        Paciente hanna = new Paciente(13);
        Paciente giovanni = new Paciente(14);
        hanna.agregarTratamiento(holter);
        hanna.agregarTratamiento(resonancia);
        hanna.agregarTratamiento(vacuna);
        hanna.agregarTratamiento(hisopado);
        giovanni.agregarTratamiento(vacuna);
        giovanni.agregarTratamiento(extraccionSangre);


        // PRUEBAS OS

        System.out.println(miOSFull.podesCubrir(vacuna)); // true
        System.out.println(miOSUrgencia.podesCubrir(reduccion)); // true
        System.out.println(miOSUrgencia.podesCubrir(holter)); // false
        System.out.println(miOSLimitada.podesCubrir(hisopado)); // true
        System.out.println(miOSLimitada.podesCubrir(hisopado)); // true
        System.out.println(miOSLimitada.podesCubrir(hisopado)); // false
        System.out.println(miOSEspecialidadCardio.podesCubrir(holter)); // true
        System.out.println(miOSEspecialidadCardio.podesCubrir(vacuna)); // false
        System.out.println(miOSTratemientoSangre.podesCubrir(extraccionSangre)); // true
        System.out.println(miOSTratemientoSangre.podesCubrir(resonancia)); // false


    }
}
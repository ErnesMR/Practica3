import practica3.Persona;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Persona alumno = new Persona();
        alumno.setNombre("Ernesto");
        alumno.setApellido("Morales");
        alumno.setEdad(26);


        Predicate<Persona>esMayor= s ->  s.getEdad() <=18;
        Supplier<Integer>anoActual= ()-> 2023;
        Consumer<Persona>nombre=(nom)-> System.out.println(nom.getNombre());
        //Function<Persona,Integer>edadAlumno=(ed)-> ed.getEdad()*2;
        Function<Persona,Integer>edadAlumno=Persona::getEdad;

       BiFunction<Integer,Integer,Integer>promedioCalificaciones =(cal1,cal2)-> (cal1+cal2) /2;
       BiPredicate<Integer,Integer>igualandoCalificaciones=(calMate,calEspanol)-> calMate.equals(calEspanol);
       BiConsumer<String,String>nombrecompleto=(nombreAlumno,apellido)-> System.out.println(nombreAlumno +" "+apellido);


        nombrecompleto.accept(alumno.getNombre(),alumno.getApellido());

        System.out.println(  igualandoCalificaciones.test(8,9));


    }
}
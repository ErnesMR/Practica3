import practica3.Persona;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Persona alumno1 = new Persona();
        alumno1.setNombre("Ernesto");
        alumno1.setApellido("Morales");
        alumno1.setEdad(26);


        Predicate<Persona>esMayor= s ->  s.getEdad() <=18;
        System.out.println(esMayor.test(alumno1));

        Supplier<Integer>edadAlumno= ()-> alumno1.getEdad();
        System.out.println(edadAlumno.get());

        Consumer<Persona>nombre=(nom)-> System.out.println(nom.getNombre());
        nombre.accept(alumno1);

        Function<Persona,String>apellidoAlumno=Persona::getApellido;
        System.out.println(apellidoAlumno.apply(alumno1));


       BiFunction<Integer,Integer,Integer>promedioCalificaciones =(cal1,cal2)-> (cal1+cal2) /2;
       System.out.println(promedioCalificaciones.apply(8,9));

       BiPredicate<Integer,Integer>igualandoCalificaciones=(calMate,calEspanol)-> calMate.equals(calEspanol);
       System.out.println(  igualandoCalificaciones.test(8,9));

       BiConsumer<Persona,Persona>nombrecompleto=(nombreAlumno,apellido)-> System.out.println(nombreAlumno.getNombre() +" "+apellido.getApellido());
       nombrecompleto.accept(alumno1,alumno1);




    }
}
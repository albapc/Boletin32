package boletin32;

public class Boletin32 {

    public static void main(String[] args) {
        Alumno.Enderezo end = new Alumno().new Enderezo("Av. García Barbón", 48);
        Alumno al = new Alumno("Jorge", 7, end);

        al.amosar();
        al.cambiarNota();
        al.amosar();

    }

}

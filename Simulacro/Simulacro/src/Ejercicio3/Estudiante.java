package Ejercicio3;

import java.io.*;
import java.util.ArrayList;

public class Estudiante {
    public static void main(String[] args) {
        Estudiante estudianteUno = new Estudiante("Juan", 27, 3.2f, 5.6f, 8.3f);
        Estudiante estudianteDos = new Estudiante("Ana", 35, 7.4f, 6.5f, 9);
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(estudianteUno);
        listaEstudiantes.add(estudianteDos);
        for (Estudiante estudiante : listaEstudiantes) {
            float notaMedia = estudiante.getNotaMedia();
            System.out.printf("---> " + estudiante.getNombre() + ", " + estudiante.getEdad() + " años y con nota media de %.2f%n",notaMedia);
        }
        System.out.println(estudianteUno);
        System.out.println(estudianteDos);
        try {
            listaEstudiantes = leerEstudiantes("/Ejercicio3/estudiantes.txt");
            for(Estudiante estudiante : listaEstudiantes){
                System.out.println(estudiante);
            }
        }catch (IOException e){
            System.out.println("Excepción capturada ---> " + e.getMessage());
            e.printStackTrace();
        }
    }

    private String nombre;
    private int edad;
    private float notaUno;
    private float notaDos;
    private float notaTres;

    public Estudiante(String nombre, int edad, float notaUno, float notaDos, float notaTres) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaUno = notaUno;
        this.notaDos = notaDos;
        this.notaTres = notaTres;
    }

    public float getNotaMedia() {
        return (this.notaUno + this.notaDos + this.notaTres) / 3;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public float getNotaUno() {
        return notaUno;
    }

    public float getNotaDos() {
        return notaDos;
    }

    public float getNotaTres() {
        return notaTres;
    }

    @Override
    public String toString() {
        String datosEstudiante = "Nombre: " + this.nombre + " Edad: " + this.edad + " Nota1: " + this.notaUno + " Nota2: " + this.notaDos + " Nota3: " + this.notaTres;
        return datosEstudiante;
    }

    public boolean equals(Estudiante estudiante) {
        if (this.nombre == estudiante.getNombre() &&
                this.edad == estudiante.getEdad() &&
                this.notaUno == estudiante.getNotaUno() &&
                this.notaDos == estudiante.getNotaDos() &&
                this.notaTres == estudiante.getNotaTres()) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Estudiante> leerEstudiantes (String nombreFichero) throws IOException{
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        String linea;
        try (InputStream inputStream = Estudiante.class.getResourceAsStream(nombreFichero);
             BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {

            while ((linea = br.readLine()) != null ){
                String[] studentInfo = linea.split(",");
                Estudiante estudiante = new Estudiante(
                        studentInfo[0],
                        Integer.parseInt(studentInfo[1]),
                        Float.parseFloat(studentInfo[2]),
                        Float.parseFloat(studentInfo[3]),
                        Float.parseFloat(studentInfo[4]));
                listaEstudiantes.add(estudiante);
            }
        };
        return listaEstudiantes;
    }
}

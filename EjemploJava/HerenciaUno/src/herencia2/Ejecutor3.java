/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {
    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        
        
       
        
        boolean condicion = true;
        
        while(condicion){
            
            System.out.printf("Opciones de Estudiantes: \n"
                + "1) Estudiantes Presencial \n"
                + "2) Estudiantes Distancia \n"
                + "3) Salir del Programa \n\n"
                + "Elija una opcion: "
                );
                int opcion = entrada.nextInt();
                entrada.nextLine();
            
            switch(opcion){

                    case 1: 

                        System.out.println("Ingrese nombres");
                        String nombres = entrada.nextLine();
                        System.out.println("Ingrese apellidos");
                        String apellidos = entrada.nextLine();
                        System.out.println("Ingrese identificación");
                        String identificacion = entrada.nextLine();
                        System.out.println("Ingrese edad");
                        int edad = entrada.nextInt();
                        System.out.println("Ingrese número de crédito");
                        int creditos = entrada.nextInt();
                        System.out.println("Ingrese costo de crédito");
                        double costoCredito = entrada.nextDouble();

                        EstudiantePresencial estudiante1 = new EstudiantePresencial();
                        estudiante1.establecerNombresEstudiante(nombres);
                        estudiante1.establecerApellidoEstudiante(apellidos);
                        estudiante1.establecerEdadEstudiante(edad);
                        estudiante1.establecerIdentificacionEstudiante(identificacion);
                        estudiante1.establecerNumeroCreditos(creditos);
                        estudiante1.establecerCostoCredito(costoCredito);
                        estudiante1.calcularMatriculaPresencial();

                         System.out.printf("%s\n", estudiante1);

                        break;

                    case 2:

                        System.out.println("Ingrese nombres");
                         nombres = entrada.nextLine();
                        System.out.println("Ingrese apellidos");
                         apellidos = entrada.nextLine();
                        System.out.println("Ingrese identificación");
                         identificacion = entrada.nextLine();
                        System.out.println("Ingrese edad");
                         edad = entrada.nextInt();
                        System.out.println("Ingrese número de asignaturas");
                        int asignaturas = entrada.nextInt();
                        System.out.println("Ingrese costo asignatura");
                        double costoAsignatura = entrada.nextDouble();

                        EstudianteDistancia estudiante2 = new EstudianteDistancia();
                        estudiante2.establecerNombresEstudiante(nombres);
                        estudiante2.establecerApellidoEstudiante(apellidos);
                        estudiante2.establecerEdadEstudiante(edad);
                        estudiante2.establecerIdentificacionEstudiante(identificacion);
                        estudiante2.establecerNumeroAsginaturas(asignaturas);
                        estudiante2.establecerCostoAsignatura(costoAsignatura);
                        estudiante2.calcularMatriculaDistancia();

                        System.out.printf("%s\n", estudiante2);

                        break;
                        
                    case 3:
                        
                        System.err.println("Saliendo del Porgrama...");
                        condicion = false;
                        break;

                    default:

                        System.err.println("Opcion Incorrecta!");
                        break;
                        
            }
        
        }
        
    }
}

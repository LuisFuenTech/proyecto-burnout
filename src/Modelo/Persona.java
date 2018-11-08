/*
    Clase Estudiante creada para obtener el modelo de los objetos estudiantes creados en el futuro.
    El atributo "clase" guarda la clase a la cual asiste.
    El atributo "docente" guarda el nombre del docente de la clase asistida.
*/
package Modelo;

public class Persona 
{
    //Declaración de los atributos de la clase Estudiante.
    private String nombre;
    private int nivel;
    private String alerta;
    Reloj reloj = new Reloj();//Intancia del objeto reloj de la clase "Reloj" usado para obtener la hora y fecha del sistema.

    //Constructor con parámetros de la clase
    public Persona(String nombre, int nivel , String alerta) 
    {
        this.nombre = nombre;
        this.nivel = nivel;
        this.alerta = alerta;
    }
    
    //Inicio de los setters y getters
    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public String getAlerta() 
    {
        return alerta;
    }

    public void setAlerta(String alerta) 
    {
        this.alerta = alerta;
    }
    
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    //Fin de los setters y getters.

    /*Método creado para retornar una cadena con la información del estudiante.
        fechaCorta() es un método de la clase Reloj que retorna la fecha corta dd/mm/aaaa del sistema
        horaActual() es un método de la clase Reloj que retorna la hora actual del sistema.
    */
    
    @Override
    public String toString() 
    {
        
        return "Nombre: " + nombre + "\nNivel: " + nivel + "\nAlerta: " + 
                alerta + "\nFecha: " + reloj.fechaCorta() + "\nHora: " + reloj.horaActual() +"\n";
    }

    //Método usado para guardar la información en los ficheros.
    public String toStringf() {
        /*
            System.getProperty("line.separator") genera un salto de linea tipo String asignado a una variable, usado para
            hacer los saltos de lineas cuando se usa "String.format".
            *String.format permite guardar una cadena con formato.
        */
        String mostrar="", newLine = System.getProperty("line.separator");
        
        return mostrar = String.format("%-25s  %-25s %s %s %s", nombre, nivel, 
                alerta, reloj.fechaCorta(), reloj.horaActual(), newLine);
    }

    
}
 
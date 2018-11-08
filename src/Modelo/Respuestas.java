/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gilberto cuadro
 */
public class Respuestas {
    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private String opcion5;
    private Respuestas r;

    public Respuestas(String opcion1, String opcion2, String opcion3, 
            String opcion4, String opcion5) {
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.opcion5 = opcion5;
    }
    
    public Respuestas() {
        
    }        
     
    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public String getOpcion5() {
        return opcion5;
    }

    public void setOpcion5(String opcion5) {
        this.opcion5 = opcion5;
    }
    
    public List<Respuestas> respuestasDeTest()
    {
        List<Respuestas> lista = new ArrayList <>();//Crear un ArrayList tipo Respuesta
        
        lista.add(new Respuestas("Muy satisfecho","Satisfecho","Neutro","Insatisfecho","Muy insatisfecho"));
        lista.add(new Respuestas("Muy satisfecho","Satisfecho","Neutro","Insatisfecho","Muy insatisfecho"));
        lista.add(new Respuestas("Muy satisfecho","Satisfecho","Neutro","Insatisfecho","Muy insatisfecho"));
        lista.add(new Respuestas("Muy de acuerdo","De acuerdo","Neutro","En desacuerdo","Muy en desacuerdo"));
        lista.add(new Respuestas("Muy de acuerdo","De acuerdo","Neutro","En desacuerdo","Muy en desacuerdo"));
        lista.add(new Respuestas("Muy de acuerdo","De acuerdo","Neutro","En desacuerdo","Muy en desacuerdo"));
        lista.add(new Respuestas("Muy de acuerdo","De acuerdo","Neutro","En desacuerdo","Muy en desacuerdo"));
        lista.add(new Respuestas("Muy de acuerdo","De acuerdo","Neutro","En desacuerdo","Muy en desacuerdo"));
        lista.add(new Respuestas("Muy buena","Buena","Neutra","Mala","Muy mala"));
        lista.add(new Respuestas("Muy de acuerdo","De acuerdo","Neutro","En desacuerdo","Muy en desacuerdo"));
        lista.add(new Respuestas("Muy de acuerdo","De acuerdo","Neutro","En desacuerdo","Muy en desacuerdo"));
        lista.add(new Respuestas("Muy de acuerdo","De acuerdo","Neutro","En desacuerdo","Muy en desacuerdo"));
        lista.add(new Respuestas("Más de 9 horas","Entre 7 y 9 horas","Entre 6 horas y menos de 7","Más de 4 horas y menos de 6","Menos de 4 horas"));
        lista.add(new Respuestas("Nunca","Alguna vez","Varias veces al mes","Varias veces a la semana","Todos los días"));
        lista.add(new Respuestas("Ninguno","1 de ellos","Entre 2 y 3 de ellos","Entre 4 y 5 de ellos","Todos ellos"));
        lista.add(new Respuestas("-------","-------","-------","-------","-------"));
        
        return lista;
    }
    
}

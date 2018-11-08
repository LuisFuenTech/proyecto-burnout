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
 * @author user
 */
public class Preguntas {
    private String pregunta;
    
    public Preguntas(String pregunta)
    {
        this.pregunta = pregunta;
    }
    
    public Preguntas()
    {
        
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public List<Preguntas> preguntasDeTest()
    {
        List<Preguntas> lista = new ArrayList <>();//Crear un ArrayList tipo Programa
        
        lista.add(new Preguntas("1. Está satisfecho con el número de horas que "
                + "trabaja:"));
        lista.add(new Preguntas("2. Está satisfecho con el sistema de turnos "
                + "establecido (se encuentra cómodo trabajando por la mañana, "
                + "tarde o noche, o con las variaciones que se le imponen desde"
                + " la dirección):"));
        lista.add(new Preguntas("3. Está satisfecho con el salario o paga que "
                + "recibe por sus servicios:"));
        lista.add(new Preguntas("4. En su trabajo apenas tiene tiempo para "
                + "tomar un pequeño descanso:"));
        lista.add(new Preguntas("5. En su trabajo realiza tareas que requieren "
                + "un alto nivel de concentración:"));
        lista.add(new Preguntas("6. Al salir del trabajo se encuentra agotado "
                + "física o mentalmente:"));
        lista.add(new Preguntas("7. Trata habitualmente con clientes o usuarios "
                + "enojados:"));
        lista.add(new Preguntas("8. Cuenta con el apoyo de sus jefes o "
                + "superiores (le ayudan cuando lo "));
        lista.add(new Preguntas("9. Su relación con sus compañeros de trabajo "
                + "es:"));
        lista.add(new Preguntas("10. En su trabajo realiza tareas insalubres o "
                + "peligrosas:"));
        lista.add(new Preguntas("11. La temperatura en su puesto de trabajo es "
                + "confortable:"));
        lista.add(new Preguntas("12. Está expuesto a ruidos o sonidos molestos "
                + "en su puesto de trabajo: "));
        lista.add(new Preguntas("13. Cuánto tiempo pasa durmiendo de media cada "
                + "día:"));
        lista.add(new Preguntas("14. Los problemas en su trabajo le han llevado "
                + "a consumir drogas para evadirse o medicamentos como "
                + "ansiolíticos, antidepresivos o somníferos:"));
        lista.add(new Preguntas("15. Diga cuántos de los siguientes síntomas "
                + "sufre habitualmente (varias veces al mes): insomnio, "
                + "ansiedad, irritabilidad, depresión, falta de energía o "
                + "problemas gastrointestinales:"));
        lista.add(new Preguntas("TEST FINALIZADO"));
        
        return lista;
    }
    
}

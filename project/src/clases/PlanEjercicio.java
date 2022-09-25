package clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class PlanEjercicio {
    private String objetivo;
    private boolean text1;
    private boolean text2;
    
    public PlanEjercicio(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public boolean isText1() {
        return text1;
    }

    public void setText1(boolean text1) {
        this.text1 = text1;
    }

    public boolean isText2() {
        return text2;
    }

    public void setText2(boolean text2) {
        this.text2 = text2;
    }
    
    
    public void planEj(){        
        String home = System.getProperty("user.home");
        File file = new File(home+"/Downloads/"+"plan_ejercicios.txt"); 
        String contents = "";
        
        try (Writer writer = new BufferedWriter(new FileWriter(file))) {
                if(null == objetivo){
                    this.text2 = true;
                }
                else switch (objetivo) {
                case "Mantener":
                    contents = "4 ejercicios para mantener tu peso." +
                            System.getProperty("line.separator") + "- Burpees, Squat Jumps, Desplantes con salto, Jumping Jacks"
                            + System.getProperty("line.separator") + "Te tomarán unos minutos de tu día y no hay necesidad de salir de tu casa para realizarlas.";
                    this.text1 = true;
                    break;
                case "Aumentar":
                    contents = "Ejercicios para ganar masa muscular en casa." +
                            System.getProperty("line.separator") + "- Sentadillas con peso, Press con barras y pesas, Plancha arriba y abajo"
                            + System.getProperty("line.separator") + "- Zancadas y saltos, 'Press' de pecho en banco plano con peso, Levantamiento de mancuernas";
                    this.text1 = true;
                    break;
                case "Adelgazar":
                    contents = "Siete ejercicios fáciles para perder peso entrenando en casa y realizar tambien un deficit calorico"
                            + System.getProperty("line.separator") + "- Sentadillas, Flexiones, Plancha abdominal, Cardio"
                            + System.getProperty("line.separator") + "- Burpees, Escaladores, Zancadas";
                    this.text1 = true;
                    break;
                default:
                        this.text2 = true;
                    break;
            }

            
            writer.write(contents);
        } catch (IOException e) {
        }
}
    
    
    
    
}

package clases;

public class Chatbot {
    private String pregunta;
    private String respuesta;

    public Chatbot(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public String responder(){
        String respuesta = "";
        if("hola".equals(pregunta)){
            respuesta = "Hola!";
            this.setRespuesta(respuesta);
            return respuesta;
        }
        else if("chau".equals(pregunta)){
            respuesta = "Que tengas un buen dia!";
            this.respuesta = respuesta;
            return respuesta;
        }
        else if("como hago abdominales".equals(pregunta)){
            respuesta = "Eleva el torso hacia las rodillas sin levantar la espalda completamente del suelo ni levantar los pies.\n"
                    + "Ejerce fuerza en los abdominales, evitando forzar otros músculos. Desciende con suavidad para no forzar la espalda.\n"
                    + "Repite el ejercicio 10 o 15 veces.";
            this.setRespuesta(respuesta);
            return respuesta;
        }
        else if("como hago flexiones de brazos".equals(pregunta)){
            respuesta = "Para realizar este ejercicio, párate a unos pies de distancia de la pared. Inclínate hacia la pared y coloca las palmas contra ella,\n"
                    + "manténlas a una distancia un poco mayor que el ancho de los hombros. Doblando y enderezando los brazos, imita el movimiento hacia arriba\n"
                    + "y hacia abajo de una flexión de brazos estándar.";
            this.setRespuesta(respuesta);
            return respuesta;
        }
        else if("porque hacer gimnasia".equals(pregunta)){
            respuesta = "El ejercicio es una parte importante de un estilo de vida saludable. El ejercicio previene problemas de salud, fortalece, aumenta la energía\n"
                    + " y puede ayudarlo a reducir el estrés. También puede ayudarlo a mantener un peso corporal saludable y controlar su apetito.";
            this.setRespuesta(respuesta);
            return respuesta;
        }
        else if("como estas".equals(pregunta)){
            respuesta = "Muy Bien!";
            this.setRespuesta(respuesta);
            return respuesta;
        }
        else{
            respuesta = "No te entendi! Preguntame otra cosa";
            this.setRespuesta(respuesta);
            return respuesta;
        }
    }
    
}

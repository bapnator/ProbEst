package probestant;

import java.io.File;

public class Generador {
    public static void main(String[] args) {
        // La ruta a tu archivo .flex
        String ruta = "C:/Users/Lenovo Pro/Documents/GitHub/ProbEst/src/probestant/Lexer.flex";
        generarLexer(ruta);
    }

    public static void generarLexer(String ruta) {
        File archivo = new File(ruta);
        // Llama a la herramienta JFlex para generar el archivo
        JFlex.Main.generate(archivo);
    }
}
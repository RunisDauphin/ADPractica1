import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecopiladorCAZ {
    String ruta = "." + File.separator + "DatosC" + File.separator + "calidad_aire_zonas.csv";
    String linea = "";
    
    public RecopiladorCAZ() throws IOException {
        try {
            BufferedReader deposito = new BufferedReader(new FileReader(ruta));
            
            while((linea = deposito.readLine()) != null) {
                String[] valores = linea.split(",");
                System.out.println("C\u00F3digo de zona: " + valores[0] +
                    " | Descripci\u00F3n: " + valores[1] +
                    " | Municipio:" + valores[2]);
                System.out.println(linea);
                break;
            }
        }
        catch (FileNotFoundException exception) {
            Logger.getLogger(RecopiladorCAZ.class.getName()).log(Level.SEVERE, null, exception);
        }
        catch (IOException exception) {
            Logger.getLogger(RecopiladorCAZ.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
}

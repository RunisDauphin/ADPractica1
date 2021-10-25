import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecopiladorCAE {
    String ruta = "." + File.separator + "DatosT" + File.separator + "calidad_aire_estaciones.csv";
    String linea = "";
    
    public RecopiladorCAE() throws IOException {
        try {
            BufferedReader deposito = new BufferedReader(new FileReader(ruta));
            
            while((linea = deposito.readLine()) != null) {
                String[] valores = linea.split(",");
                System.out.println("C\u00F3digo de estaci\u00F3n: " + valores[0] +
                    " | Descripci\u00F3n de zona: " + valores[1] +
                    " | Municipio de estaci\u00F3n" + valores[2] +
                    " | Fecha de alta: " + valores[3] +
                    " | Tipo de \u00E1rea: " + valores[4] +
                    " | Tipo de estaci\u00F3n: " + valores[5] +
                    " | Sub\u00E1rea rural: " + valores[6] +
                    " | Direcci\u00F3n postal: " + valores[7] +
                    " | Coordinaci\u00F3n UTM_ETRS89_x: " + valores[8] +
                    " | Coordinaci\u00F3n UTM_ETRS89_y: " + valores[9] +
                    " | Coordinaci\u00F3n longitud: " + valores[10] +
                    " | Coordinaci\u00F3n latitud: " + valores[11] +
                    " | Coordinaci\u00F3n altitud: " + valores[12] +
                    " | Estado analizador (NO): " + valores[13] +
                    " | Estado analizador (NO2): " + valores[14] +
                    " | Estado analizador (PM10): " + valores[15] +
                    " | Estado analizador (PM2,5): " + valores[16] +
                    " | Estado analizador (O3): " + valores[17] +
                    " | Estado analizador (TOL): " + valores[18] +
                    " | Estado analizador (BEN): " + valores[19] +
                    " | Estado analizador (XIL): " + valores[20] +
                    " | Estado analizador (CO): " + valores[21] +
                    " | Estado analizador (SO2): " + valores[22] +
                    " | Estado analizador (HCT): " + valores[23] +
                    " | Estado analizador (HNM): " + valores[24]);
                System.out.println(linea);
                break;
            }
        }
        catch (FileNotFoundException exception) {
            Logger.getLogger(RecopiladorCAE.class.getName()).log(Level.SEVERE, null, exception);
        }
        catch (IOException exception) {
            Logger.getLogger(RecopiladorCAE.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
}

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RecopiladorCADM {
    String ruta = "." + File.separator + "DatosC" + File.separator + "calidad_aire_datos_mes.csv";
    String linea = "";
    
    public RecopiladorCADM() throws IOException {
        try {
            BufferedReader deposito = new BufferedReader(new FileReader(ruta));
            
            while((linea = deposito.readLine()) != null) {
                String[] valores = linea.split(",");
                System.out.println("Provincia: " + valores[0] +
                    " | Municipio: " + valores[1] +
                    " | Estaci\u00F3n" + valores[2] +
                    " | Magnitud: " + valores[3] +
                    " | Punto de Muestreo: " + valores[4] +
                    " | A\u00F1o: " + valores[5] +
                    " | Mes: " + valores[6] +
                    " | D\u00EDa: " + valores[7] +
                    " | h1: " + valores[8] +
                    " | v1: " + valores[9] +
                    " | h2: " + valores[10] +
                    " | v2: " + valores[11] +
                    " | h3: " + valores[12] +
                    " | v3: " + valores[13] +
                    " | h4: " + valores[14] +
                    " | v4: " + valores[15] +
                    " | h5: " + valores[16] +
                    " | v5: " + valores[17] +
                    " | h6: " + valores[18] +
                    " | v6: " + valores[19] +
                    " | h7: " + valores[20] +
                    " | v7: " + valores[21] +
                    " | h8: " + valores[22] +
                    " | v8: " + valores[23] +
                    " | h9: " + valores[24] +
                    " | v9: " + valores[25] +
                    " | h10: " + valores[26] +
                    " | v10: " + valores[27] +
                    " | h11: " + valores[28] +
                    " | v11: " + valores[29] +
                    " | h12: " + valores[30] +
                    " | v12: " + valores[31] +
                    " | h13: " + valores[32] +
                    " | v13: " + valores[33] +
                    " | h14: " + valores[34] +
                    " | v14: " + valores[35] +
                    " | h15: " + valores[36] +
                    " | v15: " + valores[37] +
                    " | h16: " + valores[38] +
                    " | v16: " + valores[39] +
                    " | h17: " + valores[40] +
                    " | v17: " + valores[41] +
                    " | h18: " + valores[42] +
                    " | v18: " + valores[43] +
                    " | h19: " + valores[44] +
                    " | v19: " + valores[45] +
                    " | h20: " + valores[46] +
                    " | v20: " + valores[47] +
                    " | h21: " + valores[48] +
                    " | v21: " + valores[49] +
                    " | h22: " + valores[50] +
                    " | v22: " + valores[51] +
                    " | h23: " + valores[52] +
                    " | v23: " + valores[53] +
                    " | h24: " + valores[54] +
                    " | v24: " + valores[55]);
                System.out.println(linea);
                break;
            }
        }
        catch (FileNotFoundException exception) {
            Logger.getLogger(RecopiladorCADM.class.getName()).log(Level.SEVERE, null, exception);
        }
        catch (IOException exception) {
            Logger.getLogger(RecopiladorCADM.class.getName()).log(Level.SEVERE, null, exception);
        }
    }
}

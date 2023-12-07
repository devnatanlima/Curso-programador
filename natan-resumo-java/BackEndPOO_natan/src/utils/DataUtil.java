package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
    public String formatador;
    public String formatador2;
    public String formatador3;

    public static String converterDateParaDataEHora(Date data) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return formatador.format(data);

    }
    public static String converterDateParaData(Date data) {
        SimpleDateFormat formatador2 = new SimpleDateFormat("dd/MM/YYYY");
        return formatador2.format(data);

    }
    public static String converterDateParaHora(Date data) {
        SimpleDateFormat formatador3 = new SimpleDateFormat("HH:mm:ss");
        return formatador3.format(data);

    }
    
}

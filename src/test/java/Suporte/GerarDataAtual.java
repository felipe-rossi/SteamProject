package Suporte;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class GerarDataAtual {

    public static String gerarDataeHora(){

        LocalDateTime data = LocalDateTime.now();

        String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        return dataFormatada;
    }
}

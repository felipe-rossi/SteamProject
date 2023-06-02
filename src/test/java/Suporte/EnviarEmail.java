package Suporte;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmail {

    public static final String meuEmail = "felipaovs12@gmail.com";
    public static final String minhaSenha = "celokikjwolrjmoo";

    public static void enviarEmail(String nomeItem, String valorItem, String linkItem){

        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
        email.setSSLOnConnect(true);

        try {
            email.setFrom(meuEmail);
            email.setSubject("Surgiu uma Skin com um valor menor que 30 dolares (150 reais)!");
            email.setMsg("O item: " + nomeItem + " está com o valor de: " + valorItem + "\n" +
            "Aqui está o link para comprar a skin: " + linkItem);
            email.addTo(meuEmail);
            email.send();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

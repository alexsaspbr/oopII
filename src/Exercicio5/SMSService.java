package Exercicio5;

public class SMSService implements IServicoNotificacao {
    @Override
    public void enviar(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando SMS para " + destinatario);
        System.out.println("Mensagem " + mensagem);
        System.out.println("SMS enviado com sucesso!\n");
    }
}

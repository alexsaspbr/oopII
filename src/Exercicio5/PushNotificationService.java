package Exercicio5;

class PushNotificationService implements IServicoNotificacao {
    @Override
    public void enviar(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando push notification para " + destinatario);
        System.out.println("Assunto " + assunto);
        System.out.println("Mensagem " + mensagem);
        System.out.println("Push notification enviado com sucesso!\n");
    }
}

package Exercicio5;

class SlackService implements IServicoNotificacao {
    @Override
    public void enviar(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando Slack para " + destinatario);
        System.out.println("Assunto " + assunto);
        System.out.println("Mensagem " + mensagem);
        System.out.println("Slack enviado com sucesso!\n");
    }
}

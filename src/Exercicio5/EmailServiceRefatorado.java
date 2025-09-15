package Exercicio5;

class EmailServiceRefatorado implements IServicoNotificacao {
    @Override
    public void enviar(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando email para " + destinatario);
        System.out.println("Assunto " + assunto);
        System.out.println("Mensagem " + mensagem);
        System.out.println("E-mail enviado com sucesso!\n");
    }
}

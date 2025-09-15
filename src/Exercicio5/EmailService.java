package Exercicio5;

class EmailService {
    public void enviarEmail(String destinatario, String assunto, String mensagem) {
        System.out.println("Enviando email para " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Email enviado com sucesso!\n");
    }
}

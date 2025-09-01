package Solid.Exercicio05;

// Classe que viola o DIP
public class Notificador {
    private EmailService emailService;
    
    public Notificador() {
        this.emailService = new EmailService();
    }
    
    public void enviarNotificacao(String mensagem) {
        emailService.enviarEmail("usuario@exemplo.com", mensagem);
    }
}

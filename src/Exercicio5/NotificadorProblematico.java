package Exercicio5;

class NotificadorProblematico {
    private EmailService emailService;

    public NotificadorProblematico() {
        this.emailService = new EmailService();
    }

    public void notificar(String destinatario ,String mensagem) {
        emailService.enviarEmail(destinatario, "Notificação", mensagem);
    }
}

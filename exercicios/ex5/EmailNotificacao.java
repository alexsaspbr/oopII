package exercicios.ex5;

public class EmailNotificacao implements Notificacao {
    private String email;
    
    public EmailNotificacao(String email) {
        this.email = email;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando email para: " + email);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("Email enviado com sucesso!");
    }
}

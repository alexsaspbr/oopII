package exercicios.ex5;

public class SmsNotificacao implements Notificacao {
    private String numeroTelefone;
    
    public SmsNotificacao(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
    public String getNumeroTelefone() {
        return numeroTelefone;
    }
    
    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
    
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para: " + numeroTelefone);
        System.out.println("Mensagem: " + mensagem);
        System.out.println("SMS enviado com sucesso!");
    }
}

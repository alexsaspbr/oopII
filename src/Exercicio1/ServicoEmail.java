package Exercicio1;

class ServicoEmail {
    public boolean enviarEmail(String destinatario, String assunto, String conteudo) {
        if (!validarEmail(destinatario)) {
            System.out.println("X Email inválido: " + destinatario);
            return false;
        }

        System.out.println("Conectando ao servidor SMTP...");
        System.out.println("Enviando email para: " + destinatario);
        System.out.println("Assunto: " + assunto);
        System.out.println("Email enviado com sucesso!");

        return true;
    }

    private boolean validarEmail(String email) {
        return email != null && email.contains("@");
    }
}

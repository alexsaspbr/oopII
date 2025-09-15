package Exercicio5;

public class Main {
    public static void main(String[] args) {
        demonstrarViolacaoDIP();
        demonstrarDIPCorreto();
        demonstrarTestes();
        demonstrarFactory();
    }

    private static void demonstrarViolacaoDIP() {
        System.out.println("=".repeat(50));
        System.out.println("🚫 EXEMPLO VIOLANDO O DIP");
        System.out.println("=".repeat(50));

        NotificadorProblematico notificador = new NotificadorProblematico();
        notificador.notificar("usuario@exemplo.com", "Bem-vindo ao sistema!");

        System.out.println("❌ Problemas:");
        System.out.println("- Notificador está acoplado ao EmailService");
        System.out.println("- Difícil de testar (dependência hard-coded)");
        System.out.println("- Impossível trocar o tipo de notificação");
        System.out.println("- Violação do princípio aberto/fechado\n");
    }

    private static void demonstrarDIPCorreto() {
        System.out.println("=".repeat(50));
        System.out.println("✅ EXEMPLO SEGUINDO O DIP");
        System.out.println("=".repeat(50));

        // Criando diferentes serviços
        IServicoNotificacao emailService = new EmailServiceRefatorado();
        IServicoNotificacao smsService = new SMSService();
        IServicoNotificacao pushService = new PushNotificationService();
        IServicoNotificacao slackService = new SlackService();

        // Usando com email
        System.out.println("📧 Usando EmailService:");
        Notificador notificadorEmail = new Notificador(emailService);
        notificadorEmail.notificar("usuario@exemplo.com", "Bem-vindo ao sistema!");

        // Usando com SMS
        System.out.println("📱 Usando SMSService:");
        Notificador notificadorSMS = new Notificador(smsService);
        notificadorSMS.notificar("+55119999-9999", "Código de verificação: 123456");

        // Usando com Push Notification
        System.out.println("🔔 Usando PushNotificationService:");
        Notificador notificadorPush = new Notificador(pushService);
        notificadorPush.notificar("user_id_123", "Nova mensagem recebida!");

        // Usando com Slack
        System.out.println("💬 Usando SlackService:");
        Notificador notificadorSlack = new Notificador(slackService);
        notificadorSlack.notificar("@usuario", "Reunião em 15 minutos!");

        // Demonstrando troca de serviço em tempo de execução
        System.out.println("🔄 Trocando serviço em tempo de execução:");
        notificadorEmail.trocarServico(smsService);
        notificadorEmail.notificar("+55119999-8888", "Serviço trocado dinamicamente!");

        System.out.println("✅ Vantagens do DIP:");
        System.out.println("- Baixo acoplamento entre classes");
        System.out.println("- Fácil de testar com mocks");
        System.out.println("- Flexível para adicionar novos tipos de notificação");
        System.out.println("- Segue o princípio aberto/fechado");
        System.out.println("- Inversão de controle implementada\n");
    }

    private static void demonstrarTestes() {
        System.out.println("=".repeat(50));
        System.out.println("🧪 EXEMPLO DE TESTE UNITÁRIO");
        System.out.println("=".repeat(50));

        MockNotificationService mockService = new MockNotificationService();
        Notificador notificador = new Notificador(mockService);

        // Executar a ação
        notificador.notificar("teste@exemplo.com", "Mensagem de teste");

        // Verificar o resultado
        if (mockService.isFoiChamado()) {
            System.out.println("✅ Teste passou!");
            System.out.println("📧 Destinatário: " + mockService.getUltimoDestinatario());
            System.out.println("📋 Assunto: " + mockService.getUltimoAssunto());
            System.out.println("💬 Mensagem: " + mockService.getUltimaMensagem());
        } else {
            System.out.println("❌ Teste falhou!");
        }
        System.out.println();
    }

    private static void demonstrarFactory() {
        System.out.println("=".repeat(50));
        System.out.println("🏭 USANDO FACTORY PATTERN COM DIP");
        System.out.println("=".repeat(50));

        // Criando notificadores usando factory
        IServicoNotificacao emailService = NotificationServiceFactory.criarServico(TipoNotificacao.EMAIL);
        IServicoNotificacao smsService = NotificationServiceFactory.criarServico(TipoNotificacao.SMS);

        Notificador notificadorFactory1 = new Notificador(emailService);
        Notificador notificadorFactory2 = new Notificador(smsService);

        notificadorFactory1.notificar("factory@exemplo.com", "Criado via Factory!");
        notificadorFactory2.notificar("+5511888888888", "SMS via Factory!");

        System.out.println("✅ Factory Pattern + DIP:");
        System.out.println("- Criação centralizada de objetos");
        System.out.println("- Ainda seguindo o DIP");
        System.out.println("- Código mais limpo e organizadao");
    }
}

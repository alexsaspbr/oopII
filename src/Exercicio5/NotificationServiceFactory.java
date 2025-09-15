package Exercicio5;

class NotificationServiceFactory {
    public static IServicoNotificacao criarServico(TipoNotificacao tipo) {
        switch (tipo) {
            case EMAIL:
                return new EmailServiceRefatorado();
            case SMS:
                return new SMSService();
            case PUSH:
                return new PushNotificationService();
            case SLACK:
                return new SlackService();
            default:
                throw new IllegalArgumentException("Tipo de notificação não suportado" + tipo);
        }
    }
}

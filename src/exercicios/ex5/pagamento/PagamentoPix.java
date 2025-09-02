package exercicios.ex5.pagamento;

import exercicios.ex5.servico.VaultService;

import java.io.IOException;
import java.math.BigDecimal;

public class PagamentoPix implements Pagamento {
    private final String qrCode;

    public PagamentoPix(BigDecimal valor, int id) {
        try {
            this.qrCode = VaultService.getPixQRCode(valor, id);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean pagar(java.math.BigDecimal valor) {
        System.out.println(qrCode);
        return true;
    }

}

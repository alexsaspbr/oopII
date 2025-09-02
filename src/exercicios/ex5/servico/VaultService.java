package exercicios.ex5.servico;

import exercicios.ex5.json.JsonPix;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class VaultService {
    private static final ObjectMapper mapper = new ObjectMapper();

    private static JsonPix getDadosPIX() throws IOException {
        Map<String, Object> dados = mapper.readValue(new File("src/exercicios/ex5/vault/config.json"), Map.class);
        JsonPix json = mapper.convertValue(dados.get("pix"), JsonPix.class);
        return json;
    }

    public static String getPixQRCode(java.math.BigDecimal valor, Integer idPedido) throws IOException {
        JsonPix dadosPix = dadosAjustados();
        String valorString = valor.setScale(2).toPlainString();
        String nome = dadosPix.getNome();
        String cidade = dadosPix.getCidade();
        String qrString = "000201" +
                        "26580014BR.GOV.BCB.PIX" +
                        "0136%s".formatted(dadosPix.getChave()) +
                        "52040000" +
                        "5303986" +
                        "54%02d%s".formatted(valorString.length(), valorString) +
                        "5802BR" +
                        "59%02d%s".formatted(nome.length(), nome) +
                        "60%02d%s".formatted(cidade.length(), cidade) +
                        "62140510RPntNEWDeS" +
                        "6304906A";
        return qrString;
    }

    private static JsonPix dadosAjustados(){
        JsonPix dadosPix = new JsonPix();
        try {
            dadosPix = getDadosPIX();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String nome = dadosPix.getNome();
        String cidade = dadosPix.getCidade();
        nome = trimToLength(nome);
        cidade = trimToLength(cidade);
        dadosPix.setNome(nome);
        dadosPix.setCidade(cidade);
        return dadosPix;
    }

    public static String trimToLength(String s){
        s = s.trim().toUpperCase();
            if(s.length() > 25) {
                s = s.substring(0, 25);
            }
        return s;
    }
}

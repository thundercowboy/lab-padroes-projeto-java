package subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {

        return instancia;
    }

    public String recuperCidade(String cep) {
        return "São Paulo";
    }

    public String recuperEstado(String cep) {
        return "SP";
    }

}
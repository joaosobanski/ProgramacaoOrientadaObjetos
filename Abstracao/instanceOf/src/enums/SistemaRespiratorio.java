package enums;

public enum SistemaRespiratorio {
    PUMONAR("Pulmonar"),
    SUBCUTANOL("SubCutanel"),
    BRANQUIA("Branquia");

    String tipo;

    private SistemaRespiratorio(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}

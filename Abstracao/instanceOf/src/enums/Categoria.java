package enums;

public enum Categoria {
    TERRESTRE("Terrestre"),
    AQUATICO("Aquatico"),
    VOADOR("Voador");

    String tipo;

    private Categoria(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

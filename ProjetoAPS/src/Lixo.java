public class Lixo {
    
    private String tipoMaterial;

    private String nome;

    private Lixo() {}

    private Lixo(String tipoMaterial, String nome) {
        this.tipoMaterial = tipoMaterial;
        this.nome = nome;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

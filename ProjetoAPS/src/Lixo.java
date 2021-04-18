public class Lixo {
    
    private String nome;

    private String tipoMaterial;

    public Lixo() {}

    public Lixo(String nome, String tipoMaterial) {
        this.nome = nome;
        this.tipoMaterial = tipoMaterial;
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

    @Override
    public String toString() {
        return this.nome;
    }

}

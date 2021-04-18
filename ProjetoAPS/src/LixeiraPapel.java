public class LixeiraPapel extends LixeiraNaoOrganico {
    
    public LixeiraPapel() {
        this.setCor("Azul");
        this.setTipoMaterial("Papel");
    }

    @Override
    public void verDescartaveis() {
        
    }

    @Override
    public String toString() {
        return "Lixeira de Papel";
    }
}

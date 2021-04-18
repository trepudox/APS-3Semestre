public class LixeiraPlastico extends LixeiraNaoOrganico {
    
    public LixeiraPlastico() {
        this.setCor("Vermelho");
        this.setTipoMaterial("Plástico");
    }
    
    @Override
    public void verDescartaveis() {
        
    }

    @Override
    public String toString() {
        return "Lixeira de Plastico";
    }

}

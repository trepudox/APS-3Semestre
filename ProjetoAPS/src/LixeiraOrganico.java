public class LixeiraOrganico extends Lixeira {
    
    public LixeiraOrganico() {
        this.setCor("Marrom");
        this.setTipoMaterial("Organico");
    }

    public void verDescartaveis() {
        
    }

    @Override
    public String toString() {
        return "Lixeira Organica";
    }

}

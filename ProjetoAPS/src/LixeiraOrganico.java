public class LixeiraOrganico extends Lixeira {
    
    public LixeiraOrganico() {
        this.setCor("Marrom");
        this.setTipoMaterial("Organico");
    }

    public void verDescartaveis() {
        System.out.println("Exemplo de descartáveis: Restos de alimento, cascas de fruta, folhas e madeiras");
    }

    @Override
    public String toString() {
        return "Lixeira Organica";
    }

}

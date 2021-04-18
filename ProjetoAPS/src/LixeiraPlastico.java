public class LixeiraPlastico extends LixeiraNaoOrganico {
    
    public LixeiraPlastico() {
        this.setCor("Vermelho");
        this.setTipoMaterial("Plastico");
    }
    
    @Override
    public void verDescartaveis() {
        System.out.println("Exemplo de descartáveis: Embalagens de plástico, sacolas, garrafas PET");
    }

    @Override
    public String toString() {
        return "Lixeira de Plastico";
    }

}

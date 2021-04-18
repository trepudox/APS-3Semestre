public class LixeiraPapel extends LixeiraNaoOrganico {
    
    public LixeiraPapel() {
        this.setCor("Azul");
        this.setTipoMaterial("Papel");
    }

    @Override
    public void verDescartaveis() {
        System.out.println("Exemplo de descartáveis: Papel, jornais, caixas em geral");
    }

    @Override
    public String toString() {
        return "Lixeira de Papel";
    }
}

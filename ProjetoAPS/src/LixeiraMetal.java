public class LixeiraMetal extends LixeiraNaoOrganico implements LixoCortante {
    
    private boolean embrulhado;

    public LixeiraMetal() {
        this.setCor("Amarelo");
        this.setTipoMaterial("Metal");
        this.setEmbrulhado(false);
    }

    public void embrulharLixo() {

    }

    @Override
    public void verDescartaveis() {
        
    }
    
    public boolean isEmbrulhado() {
        return embrulhado;
    }

    public void setEmbrulhado(boolean embrulhado) {
        this.embrulhado = embrulhado;
    }

}

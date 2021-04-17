public class LixeiraVidro extends LixeiraNaoOrganico implements LixoCortante {
    
    private boolean embrulhado;

    public LixeiraVidro() {
        this.setCor("Verde");
        this.setTipoMaterial("Vidro");
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

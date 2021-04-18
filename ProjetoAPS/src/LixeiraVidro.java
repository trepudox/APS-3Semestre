public class LixeiraVidro extends LixeiraNaoOrganico implements LixoCortante {
    
    private boolean embrulhado;

    public LixeiraVidro() {
        this.setCor("Verde");
        this.setTipoMaterial("Vidro");
        this.setEmbrulhado(false);
    }

    public void embrulharLixo() {
        System.out.println();
        System.out.println(this.isEmbrulhado() ? "O lixo já está embrulhado, não é possível embrulhá-lo novamente"
        : "Você embrulhou o lixo, muito obrigado por estar se preocupando com o meio ambiente e com quem trabalha reciclando!");
        this.setEmbrulhado(true);
        System.out.println();
    }

    @Override
    public void verDescartaveis() {
        System.out.println("teste");
    }

    public boolean isEmbrulhado() {
        return embrulhado;
    }

    public void setEmbrulhado(boolean embrulhado) {
        this.embrulhado = embrulhado;
    }

    @Override
    public String toString() {
        return "Lixeira de Vidro";
    }

}

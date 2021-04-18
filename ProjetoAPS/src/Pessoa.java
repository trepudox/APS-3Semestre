public class Pessoa {
    
    private String nome;

    public Pessoa() {};

    public Pessoa(String nome) {
        this.nome = nome;
    }
 
    public void jogarLixo(Lixo lixo, Lixeira lixeira) {
        System.out.println("Você jogou " + lixo.getNome() + " na " + lixeira.toString());
        System.out.println(lixo.getTipoMaterial().equals(lixeira.getTipoMaterial()) ? "Viva! Você jogou o lixo na lixeira correta, obrigado por ajudar o meio ambiente e por contribuir com o desenvolvimento sustentável!" : "Ah não... Você errou a lixeira, esse material era " + (lixo.getTipoMaterial().equals("Organico") ? "organico" : ("de " + lixeira.getTipoMaterial().toLowerCase())));
        lixeira.getLixoDentro().add(lixo);

        if(lixeira instanceof LixeiraMetal) {
            LixeiraMetal lixeiraMetal = (LixeiraMetal) lixeira;
            lixeiraMetal.setEmbrulhado(false);
        }

        if(lixeira instanceof LixeiraVidro) {
            LixeiraVidro lixeiraVidro = (LixeiraVidro) lixeira;
            lixeiraVidro.setEmbrulhado(false);
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

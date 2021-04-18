import java.util.ArrayList;
import java.util.Optional;

public abstract class Lixeira {
    
    private String cor;

    private String tipoMaterial;

    private ArrayList<Lixo> lixoDentro = new ArrayList<>();

    public abstract void verDescartaveis();

    public final void verInfo() throws Exception {
        System.out.println("Cor da lixeira: " + this.getCor());
        Thread.sleep(100);
        System.out.println("Tipo de material: " + this.getTipoMaterial());
        Thread.sleep(100);
        this.verDescartaveis();
        Thread.sleep(100);
        System.out.println("Lixo contido dentro: " + (Optional.ofNullable(this.getLixoDentro()).isPresent() ? this.getLixoDentro().toString() : "Nada"));
        Thread.sleep(100);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public ArrayList<Lixo> getLixoDentro() {
        return lixoDentro;
    }

    public void setLixoDentro(ArrayList<Lixo> lixoDentro) {
        this.lixoDentro = lixoDentro;
    }

}

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private Long id;
    private String nomeFantasia;
    private String Cnpj;
    private List<Produto> catalogo = new ArrayList<>();
    private Endereco endereco;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setCnpj(String cnpj) {
        Cnpj = cnpj;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "id=" + id +
                ", nomeFantasia='" + nomeFantasia + '\'' +
                ", Cnpj='" + Cnpj + '\'' +
                ", catalogo=" + catalogo +
                ", endereco=" + endereco +
                '}';
    }
}

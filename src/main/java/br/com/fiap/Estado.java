package br.com.fiap;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_ESTADO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_ESTADO", columnNames = {"NM_TP_ESTADO"})
})
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ESTADO")
    @SequenceGenerator(name = "SQ_ESTADO", sequenceName = "SQ_ESTADO")
    @Column(name = "ID_ESTADO")
    private int id;
    @Column(name = "DS_NOME", nullable = false)
    private String nome;
    @Column(name = "DS_SIGLA", nullable = false)
    private String sigla;

    public int getId() {
        return id;
    }

    public Estado setId(int id) {
        this.id = id;
        return this;
    }
    public String getNome() {
        return nome;
    }

    public Estado setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public Estado() {
    }

    public Estado(int id, String nome, String sigla) {
        this.id = id;
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public Estado setSigla(String sigla) {
        this.sigla = sigla;
        return this;
    }
    @Override
    public String toString() {
        return "Estado{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                '}';
    }

}

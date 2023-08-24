package br.com.fiap;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_TP_ACAO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_TP_ACAO", columnNames = {"NM_TP_ACAO"})
})
public class TipoDeAcao {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TIPODEACAO")
    @SequenceGenerator(name = "SQ_TIPODEACAO", sequenceName = "SQ_TIPODEACAO")
    @Column(name = "ID_TIPODEACAO", nullable = false)
     private  long id;
    @Column(name = "NOME_TIPODEACAO", nullable = false)
     private String nome;

    public long getId() {
        return id;
    }

    public TipoDeAcao setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public TipoDeAcao(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    public TipoDeAcao() {
    }

    public TipoDeAcao setNome(String nome) {
        this.nome = nome;
        return this;
    }
    @Override
    public String toString() {
        return "TipoDeAcao{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}



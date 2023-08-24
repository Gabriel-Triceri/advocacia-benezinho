package br.com.fiap;
import jakarta.persistence.*;
@Entity
@Table(name = "TB_ADVOGADO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_ADVOGADO", columnNames = {"NM_TP_ADVOGADO"})
})
public class Advogado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ADVOGADO")
    @SequenceGenerator(name = "SQ_ADVOGADO", sequenceName = "SQ_ADVOGADO")
    @Column(name = "ID_ADVOGADO")
    private long id;
    @Column(name = "NOME", nullable = false)
    private  String nome;
    @Column(name = "NUMEROOAB", nullable = false,)
    private String numeroOAB;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_ESTADO",
            referencedColumnName = "ID_ESTADO",
            foreignKey = @ForeignKey(name = "FK_ESTADO_CHAMADO"),
            nullable = false
    )
    private
    Estado estado;

    public long getId() {
        return id;
    }

    public Advogado setId(long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Advogado setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getNumeroOAB() {
        return numeroOAB;
    }

    public Advogado setNumeroOAB(String numeroOAB) {
        this.numeroOAB = numeroOAB;
        return this;
    }
}

package br.com.fiap;
import jakarta.persistence.*;
@Entity
@Table(name = "TB_PROCESSO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_PROCESSO", columnNames = {"NM_PROCESSO"})
})
public class Processo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROCESSO")
    @SequenceGenerator(name = "SQ_PROCESSO", sequenceName = "SQ_PROCESSO")
    @Column(name = "ID_PROCESSO")
     private long id;
    @Column(name = "TITULO", nullable = false)
     private String numero;
    @Column(name = "PROBONO", nullable = false)
    private  boolean proBono;
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(
            name = "ID_ADVOGADO",
            referencedColumnName = "ID_ADVOGADO",
            foreignKey = @ForeignKey(name = "FK_ADVOGADO_CHAMADO")
    )
    private Advogado advogado;

    public long getId() {
        return id;
    }
    public Processo() {
    }

    public Processo(long id, String numero, boolean proBono) {
        this.id = id;
        this.numero = numero;
        this.proBono = proBono;
    }

    public Processo setId(long id) {
        this.id = id;
        return this;
    }

    public String getNumero() {
        return numero;
    }

    public Processo setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public boolean isProBono() {
        return proBono;
    }

    public Processo setProBono(boolean proBono) {
        this.proBono = proBono;
        return this;
    }
    @Override
    public String toString() {
        return "Processo{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", proBono=" + proBono +
                '}';
    }

}

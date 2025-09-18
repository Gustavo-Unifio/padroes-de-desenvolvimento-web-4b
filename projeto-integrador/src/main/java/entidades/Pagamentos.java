package entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Pagamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public Double valor;
    public String metodoPagamento;
    public String status;
    public LocalDate dataPagamento;
    public String comprovanteUrl;
    @ManyToOne
    public Contratacoes contratacoes;
}

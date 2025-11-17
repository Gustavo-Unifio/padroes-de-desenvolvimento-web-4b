package entidades;

import java.time.LocalDate;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
//import io.quarkus.panache.common.Sort;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.ManyToOne;

@Entity
public class Pagamentos extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public Double valor;
    public String metodoPagamento;
    public String status;
    public LocalDate dataPagamento;
    public String comprovanteUrl;
    //@ManyToOne
    //public Contratacoes contratacoes;
}
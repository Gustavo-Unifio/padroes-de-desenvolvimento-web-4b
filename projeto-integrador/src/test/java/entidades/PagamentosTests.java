package entidades;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class PagamentosTests {
    @Test
    @Transactional
    public void testInserirUmPagamento() {
        Pagamentos pagamentos = new Pagamentos();
        pagamentos.valor = 59.99;
        pagamentos.metodoPagamento = "Pix";
        pagamentos.status = "APROVADO";
        pagamentos.dataPagamento = LocalDate.of(2025, 12, 20);
        pagamentos.comprovanteUrl = "https://exemplo.com/comprovante6.jpg";
        pagamentos.contratacoes = contratacoes.findById(6);

        pagamentos.persist();

        Assertions.assertEquals(6, pagamentos.id);
    }
}

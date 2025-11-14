package recursos;

import java.util.List;

import entidades.Pagamentos;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path ("pagamentos")
public class PagamentosRecurso {
    @GET
    public List<Pagamentos> listar() {
        return Pagamentos.listAll(Sort.ascending("codigo"));
    }

    @POST
    @Transactional
    public void salvar (Pagamentos pagamentos) {
        pagamentos.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir (@PathParam("id") Integer id) {
        Pagamentos pagamentos = Pagamentos.findById(id);

        if (pagamentos != null) {
            pagamentos.delete();
        }
    }
}

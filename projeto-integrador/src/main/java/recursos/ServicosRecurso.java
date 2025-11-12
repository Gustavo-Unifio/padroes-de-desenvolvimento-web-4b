package recursos;

import java.util.List;

import entidades.Servicos;
import io.quarkus.panache.common.Sort;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path ("servicos")
public class ServicosRecurso {
    @GET
    public List<Servicos> listar() {
        return Servicos.listAll(Sort.ascending("id"));
    }

    @POST
    @Transactional
    public void salvar (Servicos servicos) {
        servicos.persist();
    }

    @DELETE
    @Path("{id}")
    @Transactional
    public void excluir (@PathParam("id") Integer id) {
        Servicos servicos = Servicos.findById(id);

        if (servicos != null) {
            servicos.delete();
        }
    }
}

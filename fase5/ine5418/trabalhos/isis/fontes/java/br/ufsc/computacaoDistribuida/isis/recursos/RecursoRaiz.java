package br.ufsc.computacaoDistribuida.isis.recursos;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class RecursoRaiz {

	@GET
	public Response obterRaiz() {
		File arquivo = new File("fontes/html/isis.html");
		Response resposta = Response
				.status(200)
				.entity(arquivo)
				.build();
		return resposta;
	}
}

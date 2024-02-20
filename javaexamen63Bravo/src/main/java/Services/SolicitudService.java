package Services;

import java.util.List;

import Business.GestionSolicitud;
import Modelo.Cuota;
import Modelo.Solicitud;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("solicitud")
public class SolicitudService {

	@Inject
	private GestionSolicitud gSolicitud;
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("agregar")
	public Response agregarSolicitud(Solicitud solicitud) {
		gSolicitud.cuotas(solicitud);
		return Response.ok(solicitud).build();
	}
}

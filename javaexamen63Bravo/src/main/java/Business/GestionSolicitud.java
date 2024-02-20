package Business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import DAO.SolicitudDAO;
import Modelo.Cuota;
import Modelo.Solicitud;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class GestionSolicitud {
	@Inject
	private SolicitudDAO solicitudDAO;
	
	public void cuotas(Solicitud solicitud) {
		List<Cuota> cuotas = new ArrayList<Cuota>();
		for(int mes = 0; mes<solicitud.getMeses(); mes++) {
			Cuota cuota = new Cuota();
			cuota.setCuotaCapital(solicitud.getMonto() / solicitud.getMeses());
			cuota.setCuotaInteres(cuota.getCuotaCapital() / 10);
			cuota.setCuotaTotal(cuota.getCuotaCapital() + cuota.getCuotaInteres());
			cuotas.add(cuota);
		}
		solicitud.setCuotas(cuotas);
		solicitud.setFecha(new Date());
		solicitudDAO.insert(solicitud);
	}
	
}

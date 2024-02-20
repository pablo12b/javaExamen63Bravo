package Modelo;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Solicitud {
	@Id
	@GeneratedValue
	private int id;
	private String cedulaCliente;
	private String nombreCliente;
	private String correoElectronico;
	private Date fecha;
	private double monto;
	private int meses;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Cuota> cuotas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedulaCliente() {
		return cedulaCliente;
	}
	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	public int getMeses() {
		return meses;
	}
	public void setMeses(int meses) {
		this.meses = meses;
	}
	public List<Cuota> getCuotas() {
		return cuotas;
	}
	public void setCuotas(List<Cuota> cuotas) {
		this.cuotas = cuotas;
	}
	
	@Override
	public String toString() {
		return "Solicitud [id=" + id + ", cedulaCliente=" + cedulaCliente + ", nombreCliente=" + nombreCliente
				+ ", correoElectronico=" + correoElectronico + ", fecha=" + fecha + ", monto=" + monto + ", meses="
				+ meses + ", cuotas=" + cuotas + "]";
	}
	
	
	
}

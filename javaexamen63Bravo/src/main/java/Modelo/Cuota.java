package Modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cuota {
	@Id
	@GeneratedValue
	private int id;
	private double cuotaCapital;
	private double cuotaInteres;
	private double cuotaTotal;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCuotaCapital() {
		return cuotaCapital;
	}
	public void setCuotaCapital(double cuotaCapital) {
		this.cuotaCapital = cuotaCapital;
	}
	public double getCuotaInteres() {
		return cuotaInteres;
	}
	public void setCuotaInteres(double cuotaInteres) {
		this.cuotaInteres = cuotaInteres;
	}
	public double getCuotaTotal() {
		return cuotaTotal;
	}
	public void setCuotaTotal(double cuotaTotal) {
		this.cuotaTotal = cuotaTotal;
	}
	@Override
	public String toString() {
		return "Cuota [id=" + id + ", cuotaCapital=" + cuotaCapital + ", cuotaInteres=" + cuotaInteres + ", cuotaTotal="
				+ cuotaTotal + "]";
	}
	
}

package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n01.model.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Sucursal {

    @Id
    private Integer pk_SucursalID;
    private String nomSucursal;
    private String paisSucursal;
    
	public Integer getPk_SucursalID() {
		return pk_SucursalID;
	}
	public void setPk_SucursalID(Integer pk_SucursalID) {
		this.pk_SucursalID = pk_SucursalID;
	}
	public String getNomSucursal() {
		return nomSucursal;
	}
	public void setNomSucursal(String nomSucursal) {
		this.nomSucursal = nomSucursal;
	}
	public String getPaisSucursal() {
		return paisSucursal;
	}
	public void setPaisSucursal(String paisSucursal) {
		this.paisSucursal = paisSucursal;
	}
    
    
}

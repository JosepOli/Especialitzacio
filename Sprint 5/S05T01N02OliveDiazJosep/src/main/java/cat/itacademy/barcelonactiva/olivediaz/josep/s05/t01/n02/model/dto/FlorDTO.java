package cat.itacademy.barcelonactiva.olivediaz.josep.s05.t01.n02.model.dto;

import java.util.Arrays;
import java.util.List;

public class FlorDTO {

	private Integer pk_FlorID;
	private String nomFlor;
	private String paisFlor;
	private String tipusFlor;

	private static final List<String> PAISOS_UE = Arrays.asList("Austria", "Belgium", "Bulgaria", "Croatia", "Cyprus",
			"Czech Republic", "Denmark", "Estonia", "Finland", "France", "Germany", "Greece", "Hungary", "Ireland",
			"Italy", "Latvia", "Lithuania", "Luxembourg", "Malta", "Netherlands", "Poland", "Portugal", "Romania",
			"Slovakia", "Slovenia", "Spain", "Sweden");

	public String getTipusFlor() {
		return PAISOS_UE.contains(paisFlor) ? "UE" : "Fora UE";
	}

	public Integer getPk_FlorID() {
		return pk_FlorID;
	}

	public void setPk_FlorID(Integer pk_FlorID) {
		this.pk_FlorID = pk_FlorID;
	}

	public String getNomFlor() {
		return nomFlor;
	}

	public void setNomFlor(String nomFlor) {
		this.nomFlor = nomFlor;
	}

	public String getPaisFlor() {
		return paisFlor;
	}

	public void setPaisFlor(String paisFlor) {
		this.paisFlor = paisFlor;
	}

}

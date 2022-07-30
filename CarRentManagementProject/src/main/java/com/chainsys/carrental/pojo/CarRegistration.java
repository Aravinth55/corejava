package com.chainsys.carrental.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "carregistration")
public class CarRegistration {
	@Id
	@Column(name = "CARREGNO")
	private int carRegno;
	@Column(name = "OWNERID")
	private int ownerId;
	@Column(name = "CARMAKE")
	private String carMake;
	@Column(name = "CARMODEL")
	private String carModel;
	@Column(name = "CARCOLOUR")
	private String carColour;
	@Column(name = "FUELTYPE")
	private String fuelType;
	@Column(name = "CARCAPACITY")
	private int carCapacity;
	@Column(name = "CARAVAILABLE")
	private String carAvailable;

	public int getCarRegno() {
		return carRegno;
	}

	public void setCarRegno(int carRegno) {
		this.carRegno = carRegno;
	}

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getCarMake() {
		return carMake;
	}

	public void setCarMake(String carMake) {
		this.carMake = carMake;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getCarCapacity() {
		return carCapacity;
	}

	public void setCarCapacity(int carCapacity) {
		this.carCapacity = carCapacity;
	}

	public String getCarAvailable() {
		return carAvailable;
	}

	public void setCarAvailable(String carAvailable) {
		this.carAvailable = carAvailable;
	}

}

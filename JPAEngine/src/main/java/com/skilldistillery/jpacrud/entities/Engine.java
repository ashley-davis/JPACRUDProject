package com.skilldistillery.jpacrud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Engine {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	
	private double sizeInLiters;
	
	private double numCylinders;
	
	private String fuelType;
	
	private String fuelSystem;
	
	private String configuration;
	
	private String valvetrain;
	
	private int horsepower;
	
	private String originCountry;
	
	private String vehicle;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	public double getSizeInLiters() {
		return sizeInLiters;
	}

	public void setSizeInLiters(double sizeInLiters) {
		this.sizeInLiters = sizeInLiters;
	}

	public double getNumCylinders() {
		return numCylinders;
	}

	public void setNumCylinders(double numCylinders) {
		this.numCylinders = numCylinders;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getFuelSystem() {
		return fuelSystem;
	}

	public void setFuelSystem(String fuelSystem) {
		this.fuelSystem = fuelSystem;
	}

	public String getConfiguration() {
		return configuration;
	}

	public void setConfiguration(String configuration) {
		this.configuration = configuration;
	}

	public String getValvetrain() {
		return valvetrain;
	}

	public void setValvetrain(String valvetrain) {
		this.valvetrain = valvetrain;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public String getOriginCountry() {
		return originCountry;
	}

	public void setOriginCountry(String originCountry) {
		this.originCountry = originCountry;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public Engine() {
		super();
	}
	public Engine(int id, String name, double sizeInLiters, double numCylinders, String fuelType, String fuelSystem,
			String configuration, String valvetrain, int horsepower, String originCountry, String vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.sizeInLiters = sizeInLiters;
		this.numCylinders = numCylinders;
		this.fuelType = fuelType;
		this.fuelSystem = fuelSystem;
		this.configuration = configuration;
		this.valvetrain = valvetrain;
		this.horsepower = horsepower;
		this.originCountry = originCountry;
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Engine [id=" + id + ", name=" + name + ", sizeInLiters=" + sizeInLiters + ", numCylinders="
				+ numCylinders + ", fuelType=" + fuelType + ", fuelSystem=" + fuelSystem + ", configuration="
				+ configuration + ", valvetrain=" + valvetrain + ", horsepower=" + horsepower + ", originCountry="
				+ originCountry + ", vehicle=" + vehicle + "]";
	}
}

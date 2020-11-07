package br.gov.rj.petropolis.turispetro.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import br.gov.rj.petropolis.turispetro.model.Category;
import br.gov.rj.petropolis.turispetro.model.Phone;

public class EstablishmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String street;
	private Integer number;
	private String neighborhood;
	private String city;
	private String state;
	private String zip;
	private String addon;
	private String site;
	private String email;
	private Integer capacity;
	private String lat;
	private String lon;
	private Double avarage;
	private Category category;  
	private List<Phone> phone = new ArrayList<>();
	
	public EstablishmentDTO() {
		
	}

	public EstablishmentDTO(Integer id, String name, String street, Integer number, String neighborhood, String city,
			String state, String zip, String addon, String site, String email, Integer capacity, String lat, String lon,
			Double avarage, Category category, List<Phone> phone) {
		this.id = id;
		this.name = name;
		this.street = street;
		this.number = number;
		this.neighborhood = neighborhood;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.addon = addon;
		this.site = site;
		this.email = email;
		this.capacity = capacity;
		this.lat = lat;
		this.lon = lon;
		this.avarage = avarage;
		this.category = category;
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getAddon() {
		return addon;
	}

	public void setAddon(String addon) {
		this.addon = addon;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public Double getAvarage() {
		return avarage;
	}

	public void setAvarage(Double avarage) {
		this.avarage = avarage;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Phone> getPhone() {
		return phone;
	}

	public void setPhone(List<Phone> phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EstablishmentDTO other = (EstablishmentDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}

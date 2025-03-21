package day6;

import java.util.Objects;

public class Address {
	private String street;
    private String city;
    private String postalCode;
	public Address(String street, String city, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	@Override
	public int hashCode() {
		return Objects.hash(city, postalCode, street);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(postalCode, other.postalCode)
				&& Objects.equals(street, other.street);
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", postalCode=" + postalCode + "]";
	}
}

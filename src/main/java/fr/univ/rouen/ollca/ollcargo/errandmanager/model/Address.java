package fr.univ.rouen.ollca.ollcargo.errandmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Represent an Address
 */
@Entity
public class Address {

    /**
     * the address id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * City of address
     */
    private String city;

    /**
     * Country of address
     */
    private String country;

    /**
     * Address street
     */
    private String street;

    /**
     * Postal code of the address
     */
    private int zipcode;

    /**
     * Shop address
     */
    private String companyName;

    /**
     * Additional address
     */
    private String complement;

    /**
     * Class constructor with no parameter
     */
    public Address() { }

    /**
     * Class constructor specifying the city, country, street, zipcode, company name,
     *                     complement
     */
    public Address(String city, String country, String street, int zipcode, String companyName, String complement) {
        this.city = city;
        this.country = country;
        this.street = street;
        this.zipcode = zipcode;
        this.companyName = companyName;
        this.complement = complement;
    }

    /**
     *
     * @return the address id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return city of address
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return country of address
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     *
     * @return address street
     */
    public String getStreet() {
        return street;
    }

    /**
     *
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     *
     * @return postal code of address
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return shop address
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     *
     * @param companyName
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     *
     * @return additional address
     */
    public String getComplement() {
        return complement;
    }

    /**
     *
     * @param complement
     */
    public void setComplement(String complement) {
        this.complement = complement;
    }
}

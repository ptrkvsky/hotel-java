package my.hotelId.model;

import java.util.Objects;

/**
 * CLASS HOTEL.
 * 
 * @author Johan Petrikovsky
 */

public class Hotel {

    private int nuhotel;
    private int nutypehotel;
    private String nomhotel;
    private String adressehotel;
    private String cphotel;
    private String villehotel;

    /**
     * Hotel constructor
     * 
     * @param nuhotel      hotel numero
     * @param nutypehotel  the location of the image, relative to the url argument
     * @param nomhotel     hotel name
     * @param adressehotel hotel address
     * @param cphotel      hotel postal code
     * @param villehotel   hotel city
     */
    public Hotel(int nuhotel, int nutypehotel, String nomhotel, String adressehotel, String cphotel,
            String villehotel) {
        this.setNuhotel(nuhotel);
        this.setNutypehotel(nutypehotel);
        this.setNomhotel(nomhotel);
        this.setAdressehotel(adressehotel);
        this.setCphotel(cphotel);
        this.setVillehotel(villehotel);
        System.out.println("Hello hotel constructor!");
    }

    public Hotel() {
    }

    public int getNuhotel() {
        return this.nuhotel;
    }

    public void setNuhotel(int nuhotel) {
        this.nuhotel = nuhotel;
    }

    public int getNutypehotel() {
        return this.nutypehotel;
    }

    public void setNutypehotel(int nutypehotel) {
        this.nutypehotel = nutypehotel;
    }

    public String getNomhotel() {
        return this.nomhotel;
    }

    public void setNomhotel(String nomhotel) {
        this.nomhotel = nomhotel;
    }

    public String getAdressehotel() {
        return this.adressehotel;
    }

    public void setAdressehotel(String adressehotel) {
        this.adressehotel = adressehotel;
    }

    public String getCphotel() {
        return this.cphotel;
    }

    public void setCphotel(String cphotel) {
        this.cphotel = cphotel;
    }

    public String getVillehotel() {
        return this.villehotel;
    }

    public void setVillehotel(String villehotel) {
        this.villehotel = villehotel;
    }

    public Hotel nuhotel(int nuhotel) {
        this.nuhotel = nuhotel;
        return this;
    }

    public Hotel nutypehotel(int nutypehotel) {
        this.nutypehotel = nutypehotel;
        return this;
    }

    public Hotel nomhotel(String nomhotel) {
        this.nomhotel = nomhotel;
        return this;
    }

    public Hotel adressehotel(String adressehotel) {
        this.adressehotel = adressehotel;
        return this;
    }

    public Hotel cphotel(String cphotel) {
        this.cphotel = cphotel;
        return this;
    }

    public Hotel villehotel(String villehotel) {
        this.villehotel = villehotel;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Hotel)) {
            return false;
        }
        Hotel hotel = (Hotel) o;
        return nuhotel == hotel.nuhotel && nutypehotel == hotel.nutypehotel && Objects.equals(nomhotel, hotel.nomhotel)
                && Objects.equals(adressehotel, hotel.adressehotel) && Objects.equals(cphotel, hotel.cphotel)
                && villehotel == hotel.villehotel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nuhotel, nutypehotel, nomhotel, adressehotel, cphotel, villehotel);
    }

    @Override
    public String toString() {
        return "{" + " nuhotel='" + getNuhotel() + "'" + ", nutypehotel='" + getNutypehotel() + "'" + ", nomhotel='"
                + getNomhotel() + "'" + ", adressehotel='" + getAdressehotel() + "'" + ", cphotel='" + getCphotel()
                + "'" + ", villehotel='" + getVillehotel() + "'" + "}";
    }
}
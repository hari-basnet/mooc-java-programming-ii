
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habasnet
 */
public class LiteracyData {
    private String country;
    private int year;
    private String gender;
    private double literacyRate;

    public LiteracyData(String country, int year, String gender, double literacyRate) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.literacyRate = literacyRate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getLiteracyRate() {
        return literacyRate;
    }

    public void setLiteracyRate(double literacyRate) {
        this.literacyRate = literacyRate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.country);
        hash = 89 * hash + this.year;
        hash = 89 * hash + Objects.hashCode(this.gender);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.literacyRate) ^ (Double.doubleToLongBits(this.literacyRate) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LiteracyData other = (LiteracyData) obj;
        if (this.year != other.year) {
            return false;
        }
        if (Double.doubleToLongBits(this.literacyRate) != Double.doubleToLongBits(other.literacyRate)) {
            return false;
        }
        if (!Objects.equals(this.country, other.country)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.literacyRate;
    }

    
}

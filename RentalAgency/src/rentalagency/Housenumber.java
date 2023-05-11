/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalagency;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Hp
 */
@Entity
@Table(name = "housenumber", catalog = "uwezo_agency", schema = "")
@NamedQueries({
    @NamedQuery(name = "Housenumber.findAll", query = "SELECT h FROM Housenumber h")
    , @NamedQuery(name = "Housenumber.findByHouse", query = "SELECT h FROM Housenumber h WHERE h.house = :house")
    , @NamedQuery(name = "Housenumber.findByHouseNumber", query = "SELECT h FROM Housenumber h WHERE h.houseNumber = :houseNumber")
    , @NamedQuery(name = "Housenumber.findByPrice", query = "SELECT h FROM Housenumber h WHERE h.price = :price")
    , @NamedQuery(name = "Housenumber.findByLocation", query = "SELECT h FROM Housenumber h WHERE h.location = :location")
    , @NamedQuery(name = "Housenumber.findByEstate", query = "SELECT h FROM Housenumber h WHERE h.estate = :estate")
    , @NamedQuery(name = "Housenumber.findByHouseName", query = "SELECT h FROM Housenumber h WHERE h.houseName = :houseName")})
public class Housenumber implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "house")
    private String house;
    @Id
    @Basic(optional = false)
    @Column(name = "houseNumber")
    private String houseNumber;
    @Column(name = "price")
    private Integer price;
    @Column(name = "location")
    private String location;
    @Column(name = "estate")
    private String estate;
    @Column(name = "house Name")
    private String houseName;

    public Housenumber() {
    }

    public Housenumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        String oldHouse = this.house;
        this.house = house;
        changeSupport.firePropertyChange("house", oldHouse, house);
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        String oldHouseNumber = this.houseNumber;
        this.houseNumber = houseNumber;
        changeSupport.firePropertyChange("houseNumber", oldHouseNumber, houseNumber);
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        Integer oldPrice = this.price;
        this.price = price;
        changeSupport.firePropertyChange("price", oldPrice, price);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    public String getEstate() {
        return estate;
    }

    public void setEstate(String estate) {
        String oldEstate = this.estate;
        this.estate = estate;
        changeSupport.firePropertyChange("estate", oldEstate, estate);
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        String oldHouseName = this.houseName;
        this.houseName = houseName;
        changeSupport.firePropertyChange("houseName", oldHouseName, houseName);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (houseNumber != null ? houseNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Housenumber)) {
            return false;
        }
        Housenumber other = (Housenumber) object;
        if ((this.houseNumber == null && other.houseNumber != null) || (this.houseNumber != null && !this.houseNumber.equals(other.houseNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rentalagency.Housenumber[ houseNumber=" + houseNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

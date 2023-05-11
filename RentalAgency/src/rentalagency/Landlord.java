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
@Table(name = "landlord", catalog = "uwezo_agency", schema = "")
@NamedQueries({
    @NamedQuery(name = "Landlord.findAll", query = "SELECT l FROM Landlord l")
    , @NamedQuery(name = "Landlord.findByIdNumber", query = "SELECT l FROM Landlord l WHERE l.idNumber = :idNumber")
    , @NamedQuery(name = "Landlord.findByFirstName", query = "SELECT l FROM Landlord l WHERE l.firstName = :firstName")
    , @NamedQuery(name = "Landlord.findByOtherName", query = "SELECT l FROM Landlord l WHERE l.otherName = :otherName")
    , @NamedQuery(name = "Landlord.findByGender", query = "SELECT l FROM Landlord l WHERE l.gender = :gender")
    , @NamedQuery(name = "Landlord.findByMobileNumber", query = "SELECT l FROM Landlord l WHERE l.mobileNumber = :mobileNumber")
    , @NamedQuery(name = "Landlord.findByHouse", query = "SELECT l FROM Landlord l WHERE l.house = :house")
    , @NamedQuery(name = "Landlord.findByAmount", query = "SELECT l FROM Landlord l WHERE l.amount = :amount")
    , @NamedQuery(name = "Landlord.findByDate", query = "SELECT l FROM Landlord l WHERE l.date = :date")
    , @NamedQuery(name = "Landlord.findByLocation", query = "SELECT l FROM Landlord l WHERE l.location = :location")})
public class Landlord implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_number")
    private Integer idNumber;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "other_name")
    private String otherName;
    @Column(name = "gender")
    private String gender;
    @Column(name = "mobile_number")
    private Integer mobileNumber;
    @Column(name = "house")
    private String house;
    @Column(name = "amount")
    private Integer amount;
    @Column(name = "date")
    private String date;
    @Column(name = "location")
    private String location;

    public Landlord() {
    }

    public Landlord(Integer idNumber) {
        this.idNumber = idNumber;
    }

    public Integer getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(Integer idNumber) {
        Integer oldIdNumber = this.idNumber;
        this.idNumber = idNumber;
        changeSupport.firePropertyChange("idNumber", oldIdNumber, idNumber);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String oldFirstName = this.firstName;
        this.firstName = firstName;
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName);
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        String oldOtherName = this.otherName;
        this.otherName = otherName;
        changeSupport.firePropertyChange("otherName", oldOtherName, otherName);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public Integer getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Integer mobileNumber) {
        Integer oldMobileNumber = this.mobileNumber;
        this.mobileNumber = mobileNumber;
        changeSupport.firePropertyChange("mobileNumber", oldMobileNumber, mobileNumber);
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        String oldHouse = this.house;
        this.house = house;
        changeSupport.firePropertyChange("house", oldHouse, house);
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        Integer oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        String oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        String oldLocation = this.location;
        this.location = location;
        changeSupport.firePropertyChange("location", oldLocation, location);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNumber != null ? idNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Landlord)) {
            return false;
        }
        Landlord other = (Landlord) object;
        if ((this.idNumber == null && other.idNumber != null) || (this.idNumber != null && !this.idNumber.equals(other.idNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rentalagency.Landlord[ idNumber=" + idNumber + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

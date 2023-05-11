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
@Table(name = "tenant", catalog = "uwezo", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tenant.findAll", query = "SELECT t FROM Tenant t")
    , @NamedQuery(name = "Tenant.findByIdNo", query = "SELECT t FROM Tenant t WHERE t.idNo = :idNo")
    , @NamedQuery(name = "Tenant.findByFirstName", query = "SELECT t FROM Tenant t WHERE t.firstName = :firstName")
    , @NamedQuery(name = "Tenant.findByOtherName", query = "SELECT t FROM Tenant t WHERE t.otherName = :otherName")
    , @NamedQuery(name = "Tenant.findByPhoneNumber", query = "SELECT t FROM Tenant t WHERE t.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "Tenant.findByHouse", query = "SELECT t FROM Tenant t WHERE t.house = :house")
    , @NamedQuery(name = "Tenant.findByHouseNumber", query = "SELECT t FROM Tenant t WHERE t.houseNumber = :houseNumber")})
public class Tenant implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_NO")
    private Integer idNo;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "otherName")
    private String otherName;
    @Column(name = "phoneNumber")
    private Integer phoneNumber;
    @Column(name = "house")
    private String house;
    @Column(name = "houseNumber")
    private String houseNumber;

    public Tenant() {
    }

    public Tenant(Integer idNo) {
        this.idNo = idNo;
    }

    public Integer getIdNo() {
        return idNo;
    }

    public void setIdNo(Integer idNo) {
        Integer oldIdNo = this.idNo;
        this.idNo = idNo;
        changeSupport.firePropertyChange("idNo", oldIdNo, idNo);
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

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        Integer oldPhoneNumber = this.phoneNumber;
        this.phoneNumber = phoneNumber;
        changeSupport.firePropertyChange("phoneNumber", oldPhoneNumber, phoneNumber);
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idNo != null ? idNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tenant)) {
            return false;
        }
        Tenant other = (Tenant) object;
        if ((this.idNo == null && other.idNo != null) || (this.idNo != null && !this.idNo.equals(other.idNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rentalagency.Tenant[ idNo=" + idNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

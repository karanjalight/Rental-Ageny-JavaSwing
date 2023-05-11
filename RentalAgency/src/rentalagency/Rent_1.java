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
@Table(name = "rent", catalog = "uwezo_agency", schema = "")
@NamedQueries({
    @NamedQuery(name = "Rent_1.findAll", query = "SELECT r FROM Rent_1 r")
    , @NamedQuery(name = "Rent_1.findById", query = "SELECT r FROM Rent_1 r WHERE r.id = :id")
    , @NamedQuery(name = "Rent_1.findByName", query = "SELECT r FROM Rent_1 r WHERE r.name = :name")
    , @NamedQuery(name = "Rent_1.findByHouse", query = "SELECT r FROM Rent_1 r WHERE r.house = :house")
    , @NamedQuery(name = "Rent_1.findByHouseNumber", query = "SELECT r FROM Rent_1 r WHERE r.houseNumber = :houseNumber")
    , @NamedQuery(name = "Rent_1.findByAmount", query = "SELECT r FROM Rent_1 r WHERE r.amount = :amount")
    , @NamedQuery(name = "Rent_1.findByMonthAndDate", query = "SELECT r FROM Rent_1 r WHERE r.monthAndDate = :monthAndDate")})
public class Rent_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "house")
    private String house;
    @Column(name = "house number")
    private String houseNumber;
    @Column(name = "amount")
    private String amount;
    @Column(name = "month and date")
    private String monthAndDate;

    public Rent_1() {
    }

    public Rent_1(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String oldName = this.name;
        this.name = name;
        changeSupport.firePropertyChange("name", oldName, name);
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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        String oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
    }

    public String getMonthAndDate() {
        return monthAndDate;
    }

    public void setMonthAndDate(String monthAndDate) {
        String oldMonthAndDate = this.monthAndDate;
        this.monthAndDate = monthAndDate;
        changeSupport.firePropertyChange("monthAndDate", oldMonthAndDate, monthAndDate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rent_1)) {
            return false;
        }
        Rent_1 other = (Rent_1) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rentalagency.Rent_1[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

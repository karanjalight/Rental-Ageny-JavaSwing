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
@Table(name = "agent", catalog = "uwezo_agency", schema = "")
@NamedQueries({
    @NamedQuery(name = "Agent.findAll", query = "SELECT a FROM Agent a")
    , @NamedQuery(name = "Agent.findById", query = "SELECT a FROM Agent a WHERE a.id = :id")
    , @NamedQuery(name = "Agent.findByFirstName", query = "SELECT a FROM Agent a WHERE a.firstName = :firstName")
    , @NamedQuery(name = "Agent.findByOtherName", query = "SELECT a FROM Agent a WHERE a.otherName = :otherName")
    , @NamedQuery(name = "Agent.findByPhoneNumber", query = "SELECT a FROM Agent a WHERE a.phoneNumber = :phoneNumber")
    , @NamedQuery(name = "Agent.findByLocation", query = "SELECT a FROM Agent a WHERE a.location = :location")})
public class Agent implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "otherName")
    private String otherName;
    @Column(name = "phoneNumber")
    private String phoneNumber;
    @Column(name = "location")
    private String location;

    public Agent() {
    }

    public Agent(Integer id) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        String oldPhoneNumber = this.phoneNumber;
        this.phoneNumber = phoneNumber;
        changeSupport.firePropertyChange("phoneNumber", oldPhoneNumber, phoneNumber);
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agent)) {
            return false;
        }
        Agent other = (Agent) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rentalagency.Agent[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

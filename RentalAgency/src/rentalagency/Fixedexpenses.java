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
@Table(name = "fixedexpenses", catalog = "uwezo_agency", schema = "")
@NamedQueries({
    @NamedQuery(name = "Fixedexpenses.findAll", query = "SELECT f FROM Fixedexpenses f")
    , @NamedQuery(name = "Fixedexpenses.findById", query = "SELECT f FROM Fixedexpenses f WHERE f.id = :id")
    , @NamedQuery(name = "Fixedexpenses.findByName", query = "SELECT f FROM Fixedexpenses f WHERE f.name = :name")
    , @NamedQuery(name = "Fixedexpenses.findByPosition", query = "SELECT f FROM Fixedexpenses f WHERE f.position = :position")
    , @NamedQuery(name = "Fixedexpenses.findByAmount", query = "SELECT f FROM Fixedexpenses f WHERE f.amount = :amount")})
public class Fixedexpenses implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name = "amount")
    private Integer amount;

    public Fixedexpenses() {
    }

    public Fixedexpenses(Integer id) {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        String oldPosition = this.position;
        this.position = position;
        changeSupport.firePropertyChange("position", oldPosition, position);
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        Integer oldAmount = this.amount;
        this.amount = amount;
        changeSupport.firePropertyChange("amount", oldAmount, amount);
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
        if (!(object instanceof Fixedexpenses)) {
            return false;
        }
        Fixedexpenses other = (Fixedexpenses) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rentalagency.Fixedexpenses[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

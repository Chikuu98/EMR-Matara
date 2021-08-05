/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author user
 */
@Named(value = "emrctrl")
@SessionScoped
public class emrctrl implements Serializable {

    private Integer admitions =100 ;
    private Integer discharges =20 ;
    private Integer total ;
    
    public emrctrl() {
        
    }

    public Integer getAdmitions() {
        return admitions;
    }

    public void setAdmitions(Integer admitions) {
        this.admitions = admitions;
    }

    public Integer getDischarges() {
        return discharges;
    }

    public void setDischarges(Integer discharges) {
        this.discharges = discharges;
    }
    public void admit(){
        admitions++;
    }
    public void discharge(){
        discharges++;
    }
    public void tot(){
        total = admitions-discharges;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    
}

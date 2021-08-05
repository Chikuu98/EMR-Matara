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
    private Integer icubeds=35 ;
    private Integer icuP;
    
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

    public Integer getIcubeds() {
        return icubeds;
    }

    public void setIcubeds(Integer icubeds) {
        this.icubeds = icubeds;
    }
    public void icuin(){
        icubeds--;
    }
    public void icuout(){
        icubeds++;
    }

    public Integer getIcuP() {
        return icuP;
    }

    public void setIcuP(Integer icuP) {
        this.icuP = icuP;
    }
    public void icup(){
    icuP = 35-icubeds;
    }
}

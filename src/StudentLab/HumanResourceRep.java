/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentLab;

import lab1.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Matthew
 */
public class HumanResourceRep {

    private Date currentDate;
    private int cubeId;
    private Employee employee;

    public HumanResourceRep() {
 
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }
    
    public void hireEmployee(Employee employee){
        this.employee = employee;
    }
    
    public void startOrientation(){
        employee.orientation();
    }
    
    public String getStatus() {
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(currentDate);

        if (employee.isMetWithHr() && employee.isMetDeptStaff()
                && employee.isReviewedDeptPolicies() && employee.isMovedIn()) {
            return "Orientation is completed on: " + fmtDate;
        } else {
            return fmtDate + ": Orientation in progress...";
        }
    }
    
}

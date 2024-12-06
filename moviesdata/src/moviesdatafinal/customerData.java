/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesdatafinal;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author legion
 */
public class customerData {
     private Integer id; 
    private String type;
    private String title;
    private int quantity;
    private double total;
    private Date date;
    private Time time;

    public customerData(Integer id, String type,String title, Integer quantity, double total, Date date , Time time) {
        this.id = id;
        this.type = type;
        this.title=title;
        this.quantity = quantity;
        this.total = total;
        this.date = date;
        this.time=time;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotal() {
        return total;
    }

    public Date getDate() {
        return date;
    }
    public Time getTime(){
        return time;
    
    }
    public String getTitle() {
        return title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    
}

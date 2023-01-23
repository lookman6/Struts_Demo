/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author elhaddadmohamed
 */
public class MonAction extends ActionSupport {
    private String Name ;

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
  
    @Override
    public String execute() throws Exception
    {
        setName("Hello "+Name);
        return SUCCESS ;
    }
    public String Salam() throws Exception
    {
        setName("SALAM  "+Name);
        return SUCCESS ;
    }
    
}

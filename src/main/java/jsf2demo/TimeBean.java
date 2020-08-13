package jsf2demo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Named;
import java.util.Date;

@ManagedBean(name = "timeBean")
@RequestScoped
public class TimeBean {

    public String getTime(){
        return new Date().toString();
    }
}

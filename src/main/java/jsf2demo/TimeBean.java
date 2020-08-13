package jsf2demo;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.Date;

@Named(value = "timeBean")
@RequestScoped
public class TimeBean {
    public TimeBean() {
    }

    public String getTime(){
        return new Date().toString();
    }
}

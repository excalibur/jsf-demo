package org;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by excalibur on 2014/7/2.
 */
@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

    @ManagedProperty(value="#{message}")
    private MessageBean messageBean;


    public void setMessageBean(MessageBean messageBean) {
        this.messageBean = messageBean;
    }

}

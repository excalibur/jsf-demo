package org;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 * Created by excalibur on 2014/7/2.
 */

public class MessageBean implements Serializable {
    private int num;
    private String response = null;
    private int inputNum;

    public MessageBean() {
        num = 6;
        System.out.println("-------------");


    }

    public String check() {
        System.out.println("--------check-----");
        if (num == inputNum) {
            response = "猜中了";
        } else {
            response = "错误了";
        }
        return "result";
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getInputNum() {
        return inputNum;
    }

    public void setInputNum(int inputNum) {
        this.inputNum = inputNum;
    }
}

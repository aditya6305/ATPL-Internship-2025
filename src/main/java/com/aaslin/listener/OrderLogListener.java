package com.aaslin.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class OrderLogListener implements ServletRequestListener {

    public void requestInitialized(ServletRequestEvent sre) {
        sre.getServletContext().log("Order Request Received at: " + new java.util.Date());
    }
}
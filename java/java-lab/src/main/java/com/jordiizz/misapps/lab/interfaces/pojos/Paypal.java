package com.jordiizz.misapps.lab.interfaces.pojos;

import java.math.BigDecimal;

import com.jordiizz.misapps.lab.interfaces.enums.MetodoPago;
import com.jordiizz.misapps.lab.interfaces.interfaces.Pago;

public class Paypal implements Pago{

    private String email;
    private String password;

    public Paypal(){}
    
    public Paypal(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String verificarMetodoPago(){    
        return MetodoPago.PAYPAL.name();
    }

    @Override
    public void procesarPago(BigDecimal monto){
        System.out.println("Pago con Paypal ralizado con éxito\n" + monto);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}

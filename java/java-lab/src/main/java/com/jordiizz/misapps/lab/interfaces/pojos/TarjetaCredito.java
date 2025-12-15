package com.jordiizz.misapps.lab.interfaces.pojos;

import com.jordiizz.misapps.lab.interfaces.enums.MetodoPago;
import com.jordiizz.misapps.lab.interfaces.interfaces.Pago;
import java.math.BigDecimal;;

public class TarjetaCredito implements Pago{

    private String numeroTarjeta;
    private String password;

    public TarjetaCredito(){}

    public TarjetaCredito(String numeroTarjeta, String password){
        this.numeroTarjeta = numeroTarjeta;
        this.password = password;
    }

    @Override
    public String verificarMetodoPago(){
        return MetodoPago.TARJETA_CREDITO.name();
    }

    @Override
    public void procesarPago(BigDecimal monto){
        System.out.println("Pago con Tarjeta de Crédito ralizado con éxito\n" + monto);
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String nombreTitular) {
        this.numeroTarjeta = nombreTitular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

}

package com.jordiizz.misapps.lab.interfaces.services;

import java.math.BigDecimal;

import com.jordiizz.misapps.lab.interfaces.interfaces.Pago;

public class PagoService {

    public void procesarPago(BigDecimal monto, Pago pago){
        pago.procesarPago(monto);
        System.out.println(
            "Método de pago Seleccionado:"
            + pago.verificarMetodoPago()
        );
    }
}

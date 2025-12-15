package com.jordiizz.misapps.lab.interfaces;

import java.math.BigDecimal;

import com.jordiizz.misapps.lab.interfaces.pojos.Paypal;
import com.jordiizz.misapps.lab.interfaces.pojos.TarjetaCredito;
import com.jordiizz.misapps.lab.interfaces.services.PagoService;

public class App {
    
     public static void main( String[] args )
    {
        PagoService pagoService = new PagoService();

        /* PRIMER PAGO, REALIZADO CON TARJETAS */
        TarjetaCredito tarjetaCredito = new TarjetaCredito("4000-1234-5678-9010","1234");
        BigDecimal monto1 = new BigDecimal("120");
        pagoService.procesarPago(monto1, tarjetaCredito);


        /* SEGUNDO PAGO CON PAYPAL */
        Paypal paypal = new Paypal("email.test@gmail.com","1234");
        BigDecimal monto2 = new BigDecimal("240");
        pagoService.procesarPago(monto2, paypal);

    }


}

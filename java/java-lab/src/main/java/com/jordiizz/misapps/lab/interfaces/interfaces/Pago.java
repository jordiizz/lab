package com.jordiizz.misapps.lab.interfaces.interfaces;

import java.math.BigDecimal;

public interface Pago {
    String verificarMetodoPago();
    void procesarPago(BigDecimal monto);
}

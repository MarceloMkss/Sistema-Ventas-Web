package com.mkss.infotek.SistemasVentasWeb.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleVenta implements Serializable {

	private static final long serialVersionUID = 5395542305106662634L;

	
	private int id;
	private int cantidad;
	private BigDecimal precioVenta;
	
	private Producto producto;
	private Venta venta;

}

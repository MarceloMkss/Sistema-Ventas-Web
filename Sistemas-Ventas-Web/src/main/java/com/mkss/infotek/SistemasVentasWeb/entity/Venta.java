package com.mkss.infotek.SistemasVentasWeb.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Venta implements Serializable {

	private static final long serialVersionUID = -3183473178992482327L;
	
	private int id;
	private String numeroSerie;
	private Date fechaVentas;
	private BigDecimal monto;
	private String estado;
	
	private Cliente cliente;
	private Empleado empleado;
	

}

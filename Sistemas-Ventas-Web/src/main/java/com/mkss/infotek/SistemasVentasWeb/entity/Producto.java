package com.mkss.infotek.SistemasVentasWeb.entity;


import java.io.Serializable;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto implements Serializable {
	
	private static final long serialVersionUID = -3925057547649446152L;
	
	private int id;
	private String nombres;
	private BigDecimal precio;
	private int stock;
	private String estado;
}

package com.mkss.infotek.SistemasVentasWeb.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente implements Serializable {
	
	private static final long serialVersionUID = 2052735096258959066L;
	
	private int id;
	private String dni;
	private String nombres;
	private String direccion;
	private String estado;

}

package com.mkss.infotek.SistemasVentasWeb.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Empleado implements Serializable {
	
	private static final long serialVersionUID = 1330423787536692087L;
	
	private int id;
	private String dni;
	private String nombres;
	private String telefono;
	private String estado;
	private String user;
	
}

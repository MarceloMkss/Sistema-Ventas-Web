package com.mkss.infotek.SistemasVentasWeb.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mkss.infotek.SistemasVentasWeb.entity.Cliente;

@Repository
public class ClienteDaoMysql implements Dao<Cliente> {

	
	@Autowired
	JdbcTemplate jdbc;
	
	
	@Override
	public Iterable<Cliente> obtenerTodos() {
		
		return jdbc.query("SELECT * FROM cliente", new BeanPropertyRowMapper<Cliente>(Cliente.class));
	}

	@Override
	public Cliente obtenerPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertar(Cliente objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modificar(Cliente objeto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

}

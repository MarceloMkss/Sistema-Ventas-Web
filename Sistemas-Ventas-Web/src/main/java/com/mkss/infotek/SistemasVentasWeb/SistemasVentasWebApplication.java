package com.mkss.infotek.SistemasVentasWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mkss.infotek.SistemasVentasWeb.repository.ClienteDaoMysql;

import lombok.extern.java.Log;

@Log
@SpringBootApplication
public class SistemasVentasWebApplication implements CommandLineRunner {

	@Autowired
	private ClienteDaoMysql dao;

	public static void main(String[] args) {
		SpringApplication.run(SistemasVentasWebApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		log.info(dao.obtenerTodos().toString());
		

	}

}

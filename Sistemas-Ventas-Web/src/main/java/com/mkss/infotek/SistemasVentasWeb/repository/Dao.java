package com.mkss.infotek.SistemasVentasWeb.repository;

public interface Dao<T> {

	Iterable<T> obtenerTodos();

	T obtenerPorId(Long id);

	void insertar(T objeto);

	void modificar(T objeto);

	void eliminar(Long id);

}

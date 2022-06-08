package com.lcr.eed.examen.OptimizacionYDocumentacion;
/**
 * Simula el comportamiento de un perro
 * @author laura
 *
 */
public class Perro extends Mascota {
	/**
	 * Contiene informacion del ladrido de un perro.
	 */
	private static final String GUAUUUUUUUUUU = "GUAUUUUUUUUUU";
	/**
	 * Crea un objeto perro con los parametros nombre y edad
	 * @param name	Nombre del perro
	 * @param age	Edad del Perro
	 * @throws EdadErroneaException	Lanzada si la edad es erronea
	 */
	public Perro(String name, int age) throws EdadErroneaException {
		super();
		setAge(age);
		this.name = name;
	}
	/**
	 * Devuelve el ladrido de un perro.
	 * @return
	 */
	public String ladrar() {
		return GUAUUUUUUUUUU;
	}

}

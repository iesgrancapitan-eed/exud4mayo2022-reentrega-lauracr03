package com.lcr.eed.examen.OptimizacionYDocumentacion;
/**
 * Simula el comportamiento de una mascota.
 * @author laura
 *
 */
public class Mascota {
	/**
	 * Almacena informacion de la edad de la mascota.
	 */
	private int age;
	/**
	 * Almacena el nombre de la mascota.
	 */
	protected String name;
	/**
	 * Crea una mascota vacia
	 */
	public Mascota() {
		super();
	}
	/**
	 * Modifica la edad de la mascota.
	 * @param age	Edad de la mascota.
	 * @throws EdadErroneaException	Lanzada si la edad es erronea.
	 */
	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}
	/**
	 * Devuelve la edad de la mascota.
	 * @return
	 */
	public int getAge() {
		return this.age;
	}
	/**
	 * Devuelve el nombre de la mascota.
	 * @return
	 */
	public String getName() {
		return name;
	}

}
package com.lcr.eed.examen.OptimizacionYDocumentacion;
/**
 * Lanzada si hay algun error en la edad.
 * @author laura
 *
 */
public class EdadErroneaException extends Exception {
	/**
	 * Crea un objeto exception si la edad del perro es erronea.
	 * @param message	mensaje que se le pasa a super.
	 */
	public EdadErroneaException(String message) {
		super(message);
	}
}

package com.lcr.eed.examen.OptimizacionYDocumentacion;

public class Mascota {

	private int age;
	protected String name;

	public Mascota() {
		super();
	}

	public void setAge(int age) throws EdadErroneaException {
		if (age < 0)
			throw new EdadErroneaException("La edad no puede ser negativa");
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}

	public String getName() {
		return name;
	}

}
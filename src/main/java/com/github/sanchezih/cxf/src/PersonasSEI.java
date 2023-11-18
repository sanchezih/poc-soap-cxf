package com.github.sanchezih.cxf.src;

import java.util.List;

/**
 * SEI (Service Endpoint Interface)
 * 
 * Interface que realiza el crud de personas
 * 
 * @author ihsanch
 *
 */
public interface PersonasSEI {

	/**
	 * Agrega una persona al listado
	 * 
	 * @param persona
	 */
	public void addPersona(Persona persona);

	/**
	 * Devuelve una persona y en caso de no encontrarla lanza una excepcion
	 * 
	 * @param nombre
	 * @return
	 * @throws Exception
	 */
	public Persona getPersona(String nombre) throws Exception;

	/**
	 * Obtiene el listado de personas almacenado
	 * 
	 * @return
	 */
	public List<Persona> getPersonas();

	/**
	 * Elimina una persona del listado y si no existe lanza una excepcion
	 * 
	 * @param nombre
	 * @throws Exception
	 */
	public void removePersona(String nombre) throws Exception;
}

package edu.pitt.cs;

public class CatImpl implements Cat {

	private boolean _rented;
	private String _name;
	private int _id;
	
	

	public CatImpl(int id, String name) {
		_id = id;
		_name = name;
		_rented = false;
	}

	/**
	 * Rent cat. Simply sets the _rented flag to true.
	 */
	public void rentCat() {
		_rented = true;
	}

	/**
	 * Return cat. Simply sets the _rented flag to false.
	 */
	public void returnCat() {
		_rented = false;
	}

	/**
	 * Rename cat. Simply sets the name to the new name.
	 * 
	 * @param String name New name of the cat
	 */
	public void renameCat(String name) {
		_name = name;
	}

	/**
	 * Accessor for _name variable. Returns the name of this cat.
	 * 
	 * @return String name of cat
	 */

	public String getName() {
		return _name;
	}

	/**
	 * Accessor for _id variable. Returns the ID of this cat.
	 * 
	 * @return int ID of this cat
	 */

	public int getId() {
		return _id;
	}

	/**
	 * Accessor for _rented variable. Returns if cat is rented.
	 * 
	 * @return boolean - true if rented, false otherwise
	 */

	public boolean getRented() {
		return _rented;
	}

	/**
	 * Returns string version of this cat, in form: "ID *id_num*. *name*" Example
	 * for cat of ID 1, name Jennyanydots: "ID 1. Jennyanydots"
	 * 
	 * @return String string version of cat
	 */

	public String toString() {
		return "ID " + _id + ". " + _name;
	}

}
package com.bensites.java.groovy.things

/**
 * A person is a person.
 * @author Ben
 * @see Relation
 */
class Person extends Object{
	/**
	 * Creates a person including their gender
	 * @param fName First Name
	 * @param lName Last Name
	 * @param Gender Male or Female is recommended
	 */
	public Person(String fName, String lName, String Gender) {
		this(fName, lName)
		gender = Gender
	}
	/**
	 * Creates a new person.
	 * @param fName First Name
	 * @param lName Last Name
	 */
	public Person(String fName, String lName) {
		firstName = fName
		lastName = lName
	}
	
	public firstName
	private lastName
	public prefix
	public suffix
	public gender
	private pronoun
	
	/**
	 * Returns the first and last name of a person, including any prefixes/suffixes
	 */
	@Override
	public String toString() {
		if(prefix != null && suffix != null)
			"$prefix $firstName $lastName $suffix"
		else if (prefix != null)
			"$prefix $firstName $lastName"
		else if (suffix != null)
			"$firstName $lastName $suffix"
		else
			"$firstName $lastName"
	}
	
	private ArrayList<Person> relations = new ArrayList<>()
	private HashMap<Person, Relation> relationMap = new HashMap<>()
	
	/**
	 * Relates this person to another person
	 * @param person Person to relate to.
	 * @param relation Relationship
	 * @param both If both people should have this same relationship
	 * @see Relation
	 */
	void relateTo(Person person, Relation relation, boolean both) {
		relations.add(person)
		relationMap.put(person, relation)
		if(both) person.relateTo(this, relation, false)
	}
	
	/**
	 * Checks if this person knows the person passed as a param
	 */
	boolean isRelated(Person person) {
		relations.contains(person)
	}
	
	/**
	 * Checks if this person knows the person passed as a param.
	 * @param relation Relationship that the person must have
	 */
	boolean isRelated(Person person, Relation relation) {
		relationMap.get(person) == relation
	}
	/**
	 * Sees what this person thinks that the person passed in is to them.
	 * @return A Relation
	 * @see Relation
	 */
	Relation relatedAs(Person person) {
		relationMap.get(person)
	}
	
	/**
	 * @return This person's pronoun. It is based on gender if no pronoun is found
	 */
	String pronoun() {
		if(pronoun == null) {
			if(gender == "Male")
				"his"
			else if(gender == "Female")
				"her"
			else
				"his/her"
		} else
			pronoun
	}
	/**
	 * Gets all related persons that are related in the same way
	 * @param relation Relationship to check for
	 * @return Returns all relations of a person
	 * @see Relation
	 */
	Person[] getAllRelations(Relation relation) {
		List<Person> allRelations = new ArrayList<Person>()
		for (Person related in relations)
			if(relatedAs(related) == relation) {
				allRelations.add(related)
			}
		allRelations.toArray()
	}
	
}
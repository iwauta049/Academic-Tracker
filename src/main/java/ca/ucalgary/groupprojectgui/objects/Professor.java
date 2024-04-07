package ca.ucalgary.groupprojectgui.objects;

import java.util.Objects;

/**
 * ca.ucalgary.groupprojectgui.objects.Professor.java - Represents a ca.ucalgary.groupprojectgui.objects.Professor otherect
 */
public class Professor {

    // Properties
    private String name;
    private String email;

    public Professor(String name, String email){
        this.name = name;
        this.email = email;
    }

    // Getter methods...

    /**
     * Getter method for name
     * @return name of the professor
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for email
     * @return email address of the professor
     */
    public String getEmail() {
        return email;
    }


    // Setter methods...

    /**
     * Sets the name of the professor
     * @param name name of the professor
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the email address of the professor
     * @param email email address of the professor (should end with @ucalgary.ca)
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Deep equals. compare contents of the object
     * @param other other object to compare to
     * @return true if the contents are equal or false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true; // same reference > true
        }
        if (other == null || getClass() != other.getClass()) {
            return false; // 'other' is not ca.ucalgary.groupprojectgui.objects.Professor > false
        }
        // cast 'other'
        Professor professor = (Professor) other;
        // true if all the properties are equal
        return Objects.equals(name, professor.name) &&
                Objects.equals(email, professor.email);
    }

    /**
     * used for deep equals
     * @return hashed 'this'
     */
    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

}

/*
 * Copyright (c) 2023 Informatics Fontys FHTenL University of Applied Science Venlo
 */
package simpletimeapi;

/**
 * Length between two Times.
 * 
 * Hint to implementer:
 * A Duration is allowed to be negative.
 *
 * @author Richard van den Ham {@code r.vandenham@fontys.nl}
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
public interface Duration extends Comparable<Duration> {

    /**
     * Adds a duration. 
     * Adds a Duration to this Duration and returns new Duration object.
     *
     * @param duration The Duration to add.
     * @return a new Duration object.
     */
    Duration plus( Duration duration );

    /**
     * Just a getter. For a duration of 2:45, it returns 2.
     *
     * @return the amount of hours in this duration.
     */
    int getHours();

    /**
     * Just a getter. For a duration of 1:45, it returns 45.
     *
     * @return the amount of minutes in this duration.
     */
    int getMinutes();

    /**
     * Get this duration as a number of minutes. For a duration of 1:45, it
     * returns 60+45=105.
     *
     * @return minutes
     */
    int asMinutes();

    /**
     * Returns textual representation of Duration.
     * @return Duration in minutes written as e.g "300 minutes".
     */
    @Override
    String toString();
    
    /**
     * Equals method.
     * Hint: generate equals method together with hashCode.
     * @param other
     * @return true if the value of this Duration is equal to the value of other Duration.
     */
    @Override
    boolean equals(Object other);
    
    /**
     * Return hasCode.
     * Hint: generate hashCode togeteher with equals method. 
     * @return hashCode of this object.
     */
    @Override
    int hashCode();
}

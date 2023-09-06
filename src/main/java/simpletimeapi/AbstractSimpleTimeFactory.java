/*
 * Copyright (c) 2023 Informatics Fontys FHTenL University of Applied Science Venlo
 */
package simpletimeapi;

/**
 * Abstract Factory Interface.
 * Contains all factory methods to be implemented by the student. Each factory
 * method returns an object of the concrete class, developed by the student,
 * under its abstract type. 
 * 
 * @author Richard van den Ham {@code r.vandenham@fontys.nl}
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
public interface AbstractSimpleTimeFactory {

    /**
     * Factory method to create an object of type Time.
     * See JavaDoc of type Time for constructor requirements.
     * 
     * @param hours the number of hours
     * @param minutes the number of minutes, might be negative.
     * @return Time object
     */
    Time createTime( int hours, int minutes );

    /**
     * Factory method to create an object of type Duration. The Duration
     * implementation should have a constructor with two arguments: hours and
     * minutes.
     * 
     * See JavaDoc of type Duration for implementation hint.
     *
     * @param hours hours part of the duration.
     * @param minutes minutes part of the duration.
     * @return Duration object.
     */
    Duration createDuration( int hours, int minutes );

    /**
     * Factory method to create an object of type Duration.
     * See JavaDoc of type Duration for implementation hint.
     * @param lengthInMinutes e.g. 105 minutes
     * @return Duration object.
     */
    Duration createDuration( int lengthInMinutes );

}

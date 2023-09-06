/*
 * Copyright (c) 2023 Informatics Fontys FHTenL University of Applied Science Venlo
 */
package simpletimeapi;

/**
 * The unit of points in Time (instant; like java.time.Instant).
 *
 * All Time instances are ALWAYS normalized. Normalizing results in: <ul>
 * <li>The range for the hours field is {@code [0, 24)} </li>
 * <li>The range for the minutes field is {@code [0, 60)} </li>
 * </ul>
 *
 * Hint to implementer:
 * Assuming that you have a constructor that takes an
 * hours and a minutes parameter, compute the total number of minutes. If this
 * total is less than 0 or greater equal than 24 * 60, an
 * IllegalArgumentException with an appropriate message should be thrown.
 * Otherwise, compute the number of hours and minutes from this total. This
 * implies that negative minutes as parameter value might be allowed.
 *
 *
 * @author Richard van den Ham {@code r.vandenham@fontys.nl}
 * @author Pieter van den Hombergh {@code p.vandenhombergh@fontys.nl}
 */
public interface Time extends Comparable<Time> {

    /**
     * A given time is added to this time. The result is returned as a new Time
     * object. If you add 2 hours to a time of 23:00, the result should be 01:00
     *
     * @param t The time that will be added to this time.
     * @return The Time object as a result of adding t to this time.
     */
    Time addTime( Time t );

    /**
     * Add number of minutes to this time. The result is returned as a new Time
     * object. If you add 120 minutes to a time of 23:00, the result should be 01:00
     *
     * @param minutes The amount to add to this time.
     * @return The new Time object
     */
    Time addTime( int minutes );

    /**
     * Getter for hours of this Time.
     * E.g. Time 23:34 will return value 23.
     *
     * @return hour value of this Time object.
     */
    int getHours();

    /**
     * Getter for minutes of this Time.
     * E.g. Time 23:34 will return value 34.
     * 
     * @return minutes value of this Time object.
     */
    int getMinutes();

    /**
     * This method tests if this time is before the given other time.
     * Hint: use the compareTo method.
     * 
     * @param other The Time object to compare with.
     * @return true if this time is before other.
     */
    default boolean isBefore( Time other ) {
        return this.compareTo( other ) < 0;
    }

    /**
     * This method tests if this time is before or equal to the given other
     * time.
     * Hint: use compareTo method.
     *
     * @param other The Time object to compare with.
     * @return true if this time is before or equal to other.
     */
    default boolean isBeforeOrEqual( Time other ) {
        return this.compareTo( other ) <= 0;
    }

    /**
     * Return the number of minutes since midnight.
     * E.g. 02:40 returns 160 minutes. 
     * 
     * @return the minutes
     */
    default int asMinutes() {
        return getHours() * 60 + getMinutes();
    }

    /**
     * Compute the distance to a point in the future from this time, expressed
     * as duration.
     * For example if you have a time object (13, 30) and until( 14, 20) 
     * the return will be 50 minutes. The Duration until a time that is smaller
     * than this time itself is considered as a Duration till a Time on the next 
     * day. E.g 23:59 until 0:04 results in a Duration of 0:05.
     *
     * @param other time after this time
     * @return the time difference as duration.
     */
    Duration until( Time other );
    
    /**
     * Returns textual representation of Time.
     * @return Time in hh:mm format.
     */
    @Override
    String toString();
    
    /**
     * Equals method.
     * Hint: generate equals method together with hashCode.
     * @param other
     * @return true if the value of this Time is equal to the value of other Time.
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

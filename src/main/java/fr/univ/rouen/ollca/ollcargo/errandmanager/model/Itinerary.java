package fr.univ.rouen.ollca.ollcargo.errandmanager.model;


import org.springframework.data.geo.Point;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Represent an Itinerary
 */
public class Itinerary {

    /**
     * estimated date and time of arrival
     */
    private LocalDateTime estimatedDateOfArrival;
    /**
     * points making up the route
     */
    private List<Point> points;

    /**
     * Class constructor with no parameter
     */
    public Itinerary() { }

    /**
     * Class constructor specifying the estimated date of arrival, list of points.
     */
    public Itinerary(LocalDateTime estimatedDateOfArrival, List<Point> points) {
        this.estimatedDateOfArrival = estimatedDateOfArrival;
        this.points = points;
    }

    /**
     *
     * @return estimated date and time of arrival
     */
    public LocalDateTime getEstimatedDateOfArrival() {
        return estimatedDateOfArrival;
    }

    /**
     *
     * @param estimatedDateOfArrival
     */
    public void setEstimatedDateOfArrival(LocalDateTime estimatedDateOfArrival) {
        this.estimatedDateOfArrival = estimatedDateOfArrival;
    }

    /**
     *
     * @return points making up the route
     */
    public List<Point> getPoints() {
        return points;
    }

    /**
     *
     * @param points
     */
    public void setPoints(List<Point> points) {
        this.points = points;
    }
}

package fr.univ.rouen.ollca.ollcargo.errandmanager.model;

import jakarta.persistence.*;
import org.springframework.data.geo.Point;

import java.io.Serializable;
import java.util.List;

/**
 * Represent an Errand
 */
@Entity
public class Errand implements Serializable {

    private static final long serialVersionUID=123456789;

    /**
     * the errand id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * itinerary to follow
     */
    private List<Point> plannedItinerary;

    /**
     * itinerary already traveled
     */
    private List<Point> performedItinerary;

    /**
     * list of deliveries contained in the race
     */
    @OneToMany
    private List<Delivery> deliveries;

    /**
     * delivery man running the errand
     */
    @OneToOne
    private Carrier carrier;

    /**
     * description of the error associated with the race
     */
    @ManyToOne
    private Error error;

    /**
     * Class constructor with no parameter
     */
    public Errand() { }

    /**
     * Class constructor specifying the planned itinerary, performed itinerary, deliveries, carrier,
     *                     error message
     */
    public Errand(List<Point> plannedItinerary, List<Point> performedItinerary, List<Delivery> deliveries, Carrier carrier, Error error) {
        this.plannedItinerary = plannedItinerary;
        this.performedItinerary = performedItinerary;
        this.deliveries = deliveries;
        this.carrier = carrier;
        this.error = error;
    }

    /**
     *
     * @return the errand id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return itinerary to follow
     */
    public List<Point> getPlannedItinerary() {
        return plannedItinerary;
    }

    /**
     *
     * @param plannedItinerary
     */
    public void setPlannedItinerary(List<Point> plannedItinerary) {
        this.plannedItinerary = plannedItinerary;
    }

    /**
     *
     * @return itinerary already traveled
     */
    public List<Point> getPerformedItinerary() {
        return performedItinerary;
    }

    /**
     *
     * @param performedItinerary
     */
    public void setPerformedItinerary(List<Point> performedItinerary) {
        this.performedItinerary = performedItinerary;
    }

    /**
     *
     * @return list of deliveries contained in the race
     */
    public List<Delivery> getDeliveries() {
        return deliveries;
    }

    /**
     *
     * @param deliveries
     */
    public void setDeliveries(List<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    /**
     *
     * @return delivery man running the errand
     */
    public Carrier getCarrier() {
        return carrier;
    }

    /**
     *
     * @param carrier
     */
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    /**
     *
     * @return delivery man running the errand
     */
    public Error getError() {
        return error;
    }

    /**
     *
     * @param error
     */
    public void setError(Error error) {
        this.error = error;
    }
}


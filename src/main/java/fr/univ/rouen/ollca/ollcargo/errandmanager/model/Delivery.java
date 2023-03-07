package fr.univ.rouen.ollca.ollcargo.errandmanager.model;

import jakarta.persistence.*;

/**
 * Represent a Delivery
 */
@Entity
public class Delivery {

    /**
     * the delivery id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Order reference
     */
    private String orderReference;

    /**
     * Collection point address
     */
    @ManyToOne
    @JoinColumn(name = "collect_point_adress_id")
    private Address collectPointAdress;

    /**
     * Delivery point address
     */
    @ManyToOne
    @JoinColumn(name = "delivery_point_address_id")
    private Address deliveryPointAddress;

    /**
     * Delivery status
     */
    @Enumerated(EnumType.ORDINAL)
    private DeliveryStatus status;

    /**
     * Delivery time range
     */
    @ManyToOne
    @JoinColumn(name = "interval_id")
    private DateInterval interval;

    /**
     * Class constructor with no parameter
     */
    public Delivery() { }

    /**
     * Class constructor specifying the Delivery, with the orderReference, collect point adress, delivery point address,
     *                     status of the delivery, and the interval as delivery time
     */
    public Delivery(String orderReference, Address collectPointAdress, Address deliveryPointAddress, DeliveryStatus status, DateInterval interval) {
        this.orderReference = orderReference;
        this.collectPointAdress = collectPointAdress;
        this.deliveryPointAddress = deliveryPointAddress;
        this.status = status;
        this.interval = interval;
    }

    /**
     *
     * @return the delivery id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return Order reference
     */
    public String getOrderReference() {
        return orderReference;
    }

    /**
     *
     * @param orderReference
     */
    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    /**
     *
     * @return Collection point address
     */
    public Address getCollectPointAdress() {
        return collectPointAdress;
    }

    /**
     *
     * @param collectPointAdress
     */
    public void setCollectPointAdress(Address collectPointAdress) {
        this.collectPointAdress = collectPointAdress;
    }

    /**
     *
     * @return Delivery point address
     */
    public Address getDeliveryPointAddress() {
        return deliveryPointAddress;
    }

    /**
     *
     * @param deliveryPointAddress
     */
    public void setDeliveryPointAddress(Address deliveryPointAddress) {
        this.deliveryPointAddress = deliveryPointAddress;
    }

    /**
     *
     * @return Delivery status
     */
    public DeliveryStatus getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(DeliveryStatus status) {
        this.status = status;
    }

    /**
     *
     * @return Delivery time range
     */
    public DateInterval getInterval() {
        return interval;
    }

    /**
     *
     * @param interval
     */
    public void setInterval(DateInterval interval) {
        this.interval = interval;
    }
}

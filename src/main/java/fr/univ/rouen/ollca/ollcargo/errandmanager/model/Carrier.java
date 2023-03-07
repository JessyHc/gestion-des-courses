package fr.univ.rouen.ollca.ollcargo.errandmanager.model;

import jakarta.persistence.*;

import java.util.UUID;

/**
 * Represent a Carrier
 */
@Entity
public class Carrier {

    /**
     * the carrier id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Associated User ID
     */
    private UUID userId;

    /**
     * Mode of transport used by the delivery person
     */
    private MeanOfTransport meanOfTransport;

    /**
     * Shop address
     */
    private String shopAddress;

    /**
     * Time slots in which the deliverer can deliver
     */
    @ManyToOne
    @JoinColumn(name = "time_interval_id")
    private TimeInterval timeInterval;

    /**
     * Class constructor with no parameter
     */
    public Carrier() { }

    /**
     * Class constructor specifying user id, mean of transport as type of transport, his shop address,
     *                          time slots in which the deliverer can deliverer
     */
    public Carrier(UUID userId, MeanOfTransport meanOfTransport, String shopAddress, TimeInterval timeInterval) {
        this.userId = userId;
        this.meanOfTransport = meanOfTransport;
        this.shopAddress = shopAddress;
        this.timeInterval = timeInterval;
    }

    /**
     *
     * @return the carrier id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return associated User ID
     */
    public UUID getUserId() {
        return userId;
    }

    /**
     *
     * @param userId
     */
    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    /**
     *
     * @return mode of transport used by the delivery person
     */
    public MeanOfTransport getMeanOfTransport() {
        return meanOfTransport;
    }

    /**
     *
     * @param meanOfTransport
     */
    public void setMeanOfTransport(MeanOfTransport meanOfTransport) {
        this.meanOfTransport = meanOfTransport;
    }

    /**
     *
     * @return shop address
     */
    public String getShopAddress() {
        return shopAddress;
    }

    /**
     *
     * @param shopAddress
     */
    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    /**
     *
     * @return time slots in which the deliverer can deliver
     */
    public TimeInterval getTimeInterval() {
        return timeInterval;
    }

    /**
     *
     * @param timeInterval
     */
    public void setTimeInterval(TimeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }
}

package fr.univ.rouen.ollca.ollcargo.errandmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

/**
 * Represent an error
 */
@Entity
public class Error implements Serializable {

    private static final long serialVersionUID = 123456789;

    /**
     * the error id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * description of the error
     */
    private String content;

    /**
     * Class constructor with no parameter
     */
    public Error() { }

    /**
     * Class constructor specifying the planned itinerary, performed itinerary, deliveries, carrier,
     *                     error message
     */
    public Error(String content) {
        this.content = content;
    }
    /**
     *
     * @return the error id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return description of the error
     */
    public String getContent() {
        return content;
    }

    /**
     *
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}

package fr.univ.rouen.ollca.ollcargo.errandmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

/**
 * Represent a DateInterval
 */
@Entity
public class DateInterval {

    /**
     * the date interval id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * start of date range
     */
    private LocalDateTime start;

    /**
     * end of date range
     */
    private LocalDateTime end;

    /**
     * Class constructor with no parameter
     */
    public DateInterval() { }

    /**
     * Class constructor specifying start, end and day as date
     */
    public DateInterval(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }

    /**
     *
     * @return the date interval id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return start of date range
     */
    public LocalDateTime getStart() {
        return start;
    }

    /**
     *
     * @param start
     */
    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    /**
     *
     * @return end of date range
     */
    public LocalDateTime getEnd() {
        return end;
    }

    /**
     *
     * @param end
     */
    public void setEnd(LocalDateTime end) {
        this.end = end;
    }


}

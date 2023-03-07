package fr.univ.rouen.ollca.ollcargo.errandmanager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * Represent a TimeInterval
 */
@Entity
public class TimeInterval {

    /**
     * the address id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Start of time slot
     */
    private LocalDateTime start;

    /**
     * End of time slot
     */
    private LocalDateTime end;

    /**
     * Day concerned by the time slot
     */
    private DayOfWeek day;

    /**
     * Class constructor with no parameter
     */
    public TimeInterval() { }

    /**
     * Class constructor specifying start, end and day as date
     */
    public TimeInterval(LocalDateTime start, LocalDateTime end, DayOfWeek day) {
        this.start = start;
        this.end = end;
        this.day = day;
    }

    /**
     *
     * @return the address id
     */
    public Long getId() {
        return id;
    }

    /**
     *
     * @return Start of time slot
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
     * @return End of time slot
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

    /**
     *
     * @return Day concerned by the time slot
     */
    public DayOfWeek getDay() {
        return day;
    }

    /**
     *
     * @param day
     */
    public void setDay(DayOfWeek day) {
        this.day = day;
    }
}

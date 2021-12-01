package case_study.models.Booking;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private LocalDate bookingTime;
    private LocalDate checkOutTime;

    private String bookingCode;

    public Booking() {
    }

    public Booking(LocalDate bookingTime, LocalDate checkOut) {
        this.bookingTime = bookingTime;
        this.checkOutTime = checkOut;
    }

    public LocalDate getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDate bookingTime) {
        this.bookingTime = bookingTime;
    }

    public LocalDate getCheckOut() {
        return checkOutTime;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOutTime = checkOut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingTime.equals(booking.bookingTime) &&
                checkOutTime.equals(booking.checkOutTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingTime, checkOutTime);
    }

    @Override
    public int compareTo(Booking o) {
        if (this.bookingTime.compareTo(o.bookingTime) == 0) {
            return this.checkOutTime.compareTo(o.checkOutTime);
        } else
            return this.bookingTime.compareTo(o.bookingTime);
    }

    @Override
    public String toString() {
        return "Ngày booking - " + this.bookingTime + "," + "\tNgày trả phòng - " + this.checkOutTime;
    }
}

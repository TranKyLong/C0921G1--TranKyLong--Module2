package case_study.models.booking_contract;

import java.time.LocalDate;
import java.util.Objects;

public class Booking implements Comparable<Booking> {
    private LocalDate bookingTime;
    private LocalDate checkOutTime;
    private String bookingCode;
    private String custommerCode;
    private String servicesName;
    private String servicesType;
    private String serivicesCode;


    public Booking() {
    }

    public Booking(LocalDate bookingTime, LocalDate checkOutTime, String bookingCode, String custommerCode, String servicesName, String servicesType, String serivicesCode) {
        this.bookingTime = bookingTime;
        this.checkOutTime = checkOutTime;
        this.bookingCode = bookingCode;
        this.custommerCode = custommerCode;
        this.servicesName = servicesName;
        this.servicesType = servicesType;
        this.serivicesCode = serivicesCode;
    }

    public String getSerivicesCode() {
        return serivicesCode;
    }

    public void setSerivicesCode(String serivicesCode) {
        this.serivicesCode = serivicesCode;
    }

    public LocalDate getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDate bookingTime) {
        this.bookingTime = bookingTime;
    }

    public LocalDate getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOutTime = checkOut;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public void setCheckOutTime(LocalDate checkOutTime) {
        this.checkOutTime = checkOutTime;
    }

    public String getCustommerCode() {
        return custommerCode;
    }

    public void setCustommerCode(String custommerCode) {
        this.custommerCode = custommerCode;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public String getServicesType() {
        return servicesType;
    }

    public void setServicesType(String servicesType) {
        this.servicesType = servicesType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return bookingCode.equals(booking.bookingCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingCode);
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
        return "Mã booking: " + this.bookingCode + ","
                + "Mã khách hàng: " + this.custommerCode + ","
                + "Mã dịch vụ: " + this.serivicesCode + ","
                + "Tên dịch vụ: " + this.servicesName + ","
                + "Loại dịch vụ: " + this.servicesType + ","
                + "Ngày booking: " + this.bookingTime + ","
                + "Ngày trả phòng: " + this.checkOutTime;
    }

}

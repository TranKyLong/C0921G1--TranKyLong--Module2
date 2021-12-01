package case_study.Services.Person.CustommerServices;
import case_study.models.khach_hang_va_nhan_vien.Customer;
public interface ICustommerServices {
    void displayCustommer();

    Customer getNewCustommer();

    void editOrAddNewCustommer(String sign);
}

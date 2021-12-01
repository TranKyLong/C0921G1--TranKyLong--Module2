package case_study.Services.Person;

import case_study.models.khach_hang_va_nhan_vien.PersonFurama;

public interface IPerson {
    void writeCsv(PersonFurama person,String path);
}

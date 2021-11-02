package ss4_lop_va_doi_tuong.bai_tap.fan;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MainFan {
    public static void main(String[] args) {
        MyFan quat = new MyFan(3,true,10,"yellow");
        System.out.println(quat.toString());
        MyFan quat2 = new MyFan(2,false,5,"blue");
        System.out.println(quat2.toString());
    }
}

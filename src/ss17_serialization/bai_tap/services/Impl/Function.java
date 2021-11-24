package ss17_serialization.bai_tap.services.Impl;

import ss17_serialization.bai_tap.model.Product;
import ss17_serialization.bai_tap.services.FileWriter;
import ss17_serialization.bai_tap.services.ServicesInterface;

import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Function implements ServicesInterface, Serializable {
    Scanner scanner = new Scanner(System.in);
    static Map<Integer, Product> productMap = new HashMap<>();

    static {
        productMap.put(100, new Product("Product1", "manufacturer1", 15.5, "hết hàng"));
        productMap.put(102, new Product("Product12", "manufacturer2", 15.5, "this is note"));
        productMap.put(103, new Product("Product15", "manufacturer3", 15.5, "no avaiable"));
        productMap.put(104, new Product("BUG", "FORMSOFTWARE", 15.5, "No bug, it's all feature"));
    }

    @Override
    public void adding() {
        int id = 0;
        double priceProduct = 0.0;
        while (true) {
            try {
                System.out.println("Mời nhập giá sản phẩm");
                priceProduct = Double.parseDouble(scanner.nextLine());

                System.out.println("Mời nhập mã sản phẩm");
                id = Integer.parseInt(scanner.nextLine());

                if (productMap.containsKey(id)) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.err.println("Mã sản phẩm đã tồn tại hoặc định dạnh giá không đúng");
            }
        }
        System.out.println("Mời nhập tên sản phẩm");
        String name = scanner.nextLine();
        System.out.println("Mời nhập hãng sản xuất");
        String manufacturer = scanner.nextLine();

        System.out.println("Mời nhập ghi chú cho sản phẩm");
        String note = scanner.nextLine();

        productMap.put(id, new Product(name, manufacturer, priceProduct, note));
        FileWriter.writeFile(productMap);
        System.out.println("Thêm thành công");
    }

    @Override
    public void show() {

        Map<Integer, Product> e = FileWriter.readFile(FileWriter.FILE_PRODUCT);
        for (Map.Entry<Integer, Product> entry : e.entrySet()) {
            System.out.println("Mã sản phẩm: " + entry.getKey() + entry.getValue());
        }
    }

    @Override
    public void delete() {
        System.out.println("Nhập mã sản phẩm cần xóa");
        int idDelete = Integer.parseInt(scanner.nextLine());
        if (productMap.containsKey(idDelete)) {
            productMap.remove(idDelete);
            FileWriter.writeFile(productMap);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void find() {
        System.out.println("Mời nhập mã sản phẩm cần tìm kiếm ");
        int idFind = Integer.parseInt(scanner.nextLine());

        if (productMap.containsKey(idFind)) {
            System.out.println("Mã sản phẩm: " + idFind + " " + productMap.get(idFind));
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}

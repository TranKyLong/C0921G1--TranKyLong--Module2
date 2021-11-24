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
    public void edit() {
        show();
        System.out.println("\n =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=");
        System.out.println("Nhập mã của sản phẩm cần chỉnh sửa ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        if (productMap.containsKey(idEdit)) {
            productMap.remove(idEdit);

            productMap.put(idEdit, new Product());
            System.out.println("Nhập tên hãng mới");
            productMap.get(idEdit).setManufacturer(scanner.nextLine());

            System.out.println("Nhập tên sản phẩm mới");
            productMap.get(idEdit).setName(scanner.nextLine());

            System.out.println("Nhập giá mới");
            productMap.get(idEdit).setPrice(Double.parseDouble(scanner.nextLine()));

            System.out.println("Nhập ghi chú mới");
            productMap.get(idEdit).setNote(scanner.nextLine());

            FileWriter.writeFile(productMap);
        } else {
            System.out.println("Không tìm thấy");

        }
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
            //cap nhat file nhi phan
            FileWriter.writeFile(productMap);
        } else {
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void find() {
        productMap = FileWriter.readFile(FileWriter.FILE_PRODUCT);

        System.out.println("Mời nhập mã sản phẩm cần tìm kiếm ");
        int idFind = Integer.parseInt(scanner.nextLine());

        if (productMap.containsKey(idFind)) {
            System.out.println("Mã sản phẩm: " + idFind + " " + productMap.get(idFind));
        } else {
            System.out.println("Không tìm thấy");
        }
    }
}

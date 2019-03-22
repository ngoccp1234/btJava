package entity;

import controller.FoodController;

import java.util.Scanner;

public  class MenuCretor   {
        public void createMenu(){
            FoodController foodController = new FoodController();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("--------Foodydi--------");
                System.out.println("1. Thêm món ăn.");
                System.out.println("2. Hiển thị danh sách món ăn.");
                System.out.println("3. Thoát chương trình.");
                System.out.println("----------------------------");
                System.out.println("Nhập lựa chọn của bạn: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("---Thêm món ăn---\n");
                        foodController.addFood();
                        break;
                    case 2:
                        System.out.println("---Hiển thị danh sách món ăn---");
                        foodController.printList();
                        break;
                    case 3:
                        System.out.println("Đã thoát");
                        break;
                    default:
                        System.out.println("Lựa chọn sai, vui lòng nhập từ 1 - 3 .");
                        break;
                }
                if (choice==3){
                    System.out.println("Hẹn gặp lại!");
                    break;
                }
            }



        }
}

package controller;

import entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public  class FoodController {
    private ArrayList<Food> foodArrayList = new ArrayList<>();
    public  void addFood(){
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Nhập mã món ăn: ");
        String foodId = scanner.nextLine();
        System.out.println("Nhập tên món ăn:  ");
        String foodName = scanner.nextLine();
        System.out.println("Nhập mô tả: ");
        String description = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày tạo: ");
        String createAt = scanner.nextLine();
       Food food = new Food(foodId,foodName,description,price,createAt);
       foodArrayList.add(food);



    }
     public void printList(){
         System.out.printf("%15s | %15s | %15s | %15s | %15s\n", "Mã mon an", "Tên mon an", "mo ta mon an", "gia mon an","ngay tao");
         for (int i = 0; i < foodArrayList.size(); i++) {
             Food food = foodArrayList.get(i);
             System.out.printf("%15s | %15s | %15s | %15s | %15s\n",
                     food.getFoodId(), food.getFoodName(), food.getDescription(), food.getPrice(),food.getCreateAt());
         }
     }
}

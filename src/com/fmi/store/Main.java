package com.fmi.store;

import com.fmi.store.model.Category;
import com.fmi.store.model.FoodProduct;
import com.fmi.store.model.Product;
import com.fmi.store.model.User;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User user1 = new User(24,"username","parola");
        User user2 = new User(24,"usernamesdata","parola");

        System.out.println("user1 == user2 : " + (user1 == user2));

        System.out.println("user1.equals( user2) :" + (user1.equals(user2)));

        Category category = new Category("categoria1","o descriere",null);

        Product product = new Product(null,null,"product name","description");

        Product foodproduct = new FoodProduct(null,null,"food product name",
                " food product description");
        System.out.println("product getName :" + product.getName());
        System.out.println("food product getName :" + foodproduct.getName() );

        try {
            Product productDuplicate = (Product)foodproduct.clone();
        }catch (CloneNotSupportedException exc){
            exc.printStackTrace();
        }

    }
}

public class Info_Customer {


    public static void main(String[] args) {
        
        //create 5 object of each class

        //class of Category
        Category category1 = new Category(01, "Sujan Magar");
        Category category2 = new Category(02, "Jit Rai");
        Category category3 = new Category(03, "Sukesh Moktan");
        Category category4 = new Category(04, "Annmol Kc");
        Category category5 = new Category(05, "Koila Dc");

        //class of order

        Order order1 = new Order(1, 100, "jun-4", 001);
        Order order2 = new Order(2, 500, "mar-10", 002);
        Order order3 = new Order(3, 700, "sep-4", 003);
        Order order4 = new Order(4, 800, "may-3", 004);
        Order order5 = new Order(5, 400, "jan-14", 005);


        //printing the detail of object (Category)
        System.out.println("Category Details");
       System.out.println("id       name \n" + category1.getId() + "\t"  +  "\t" +category1.getName());
       System.out.println(  category2.getId() + "\t"  +  "\t" +category2.getName());
       System.out.println(  category3.getId() + "\t"  +  "\t" +category3.getName());
       System.out.println( category4.getId() + "\t"  +  "\t" +category4.getName());
       System.out.println( category5.getId() + "\t"  +  "\t" +category5.getName());


       System.out.println("----------------------------------------------");


       //printing the detail of object (Order)
       System.out.println("Order Details");
       System.out.println("id       amount      date    customer id \n" + order1.getId() + "\t"  +  "\t" + order1.getAmount() + "\t" +  order1.getDate() + order1.getCustomerId());
       System.out.println(order2.getId() + "\t"  +  "\t" + order2.getAmount() + "\t" +  order2.getDate() + order2.getCustomerId());
       System.out.println(order3.getId() + "\t"  +  "\t" + order3.getAmount() + "\t" +  order3.getDate() + order3.getCustomerId());
       System.out.println(order4.getId() + "\t"  +  "\t" + order4.getAmount() + "\t" +  order4.getDate() + order4.getCustomerId());
       System.out.println(order5.getId() + "\t"  +  "\t" + order5.getAmount() + "\t" +  order5.getDate() + order5.getCustomerId());


System.out.println("---------------------------------------------------------------------");

      
      
      
    
    }
}

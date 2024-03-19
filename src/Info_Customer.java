public class Info_Customer {


    public static void main(String[] args) {
        
        //create 5 object of each class

        //class of Category
        Category category1 = new Category(01, "Sujan Magar");
        Category category2 = new Category(02, "Jit Rai");
        Category category3 = new Category(03, "Sukesh Moktan");
        Category category4 = new Category(04, "Annmol Kc");
        Category category5 = new Category(05, "Koila Dc");


        //in the array
        Category categories[] = new Category[5];

        categories[0] = category1;
        categories[1] = category2;
        categories[2] = category3;
        categories[3] = category4;
        categories[4] = category5;


        //class of order

        Order order1 = new Order(1, 100, "jun-4", 001);
        Order order2 = new Order(2, 500, "mar-10", 002);
        Order order3 = new Order(3, 700, "sep-4", 003);
        Order order4 = new Order(4, 800, "may-3", 004);
        Order order5 = new Order(5, 400, "jan-14", 005);


        //in the array
        Order orders[] = new Order[5];
        orders[0] = order1;
        orders[1] = order2;
        orders[2] = order3;
        orders[3] = order4;
        orders[4] = order5;



        //printing the array [category]
               //printing the array
               System.out.println("Info Customers  Category:\n");
               for(int i = 0; i < categories.length; i++)
               {
                   System.out.println("-------------------------------");
                   System.out.println("Id \t \t  |  Name            |");
                   System.out.println("-------------------------------");
                   System.out.println(categories[i].getId() +  "\t\t" + "\t\t"  + categories[i].getName());
               
                   System.out.println("--------------------------------");
               }
        //printing the array
        System.out.println("Info Customers Order:\n");


       //printing the array
        System.out.println("Info Customers Order:\n");
for(int i = 0; i < orders.length; i++)
{
    System.out.println("------------------------------------------------------------");
    System.out.println("Id \t \t  |  Amount\t\t | date\t\t  |  Customer ID");
    System.out.println("------------------------------------------------------------");
    System.out.println(orders[i].getId() +  "\t\t" + "\t\t"  + orders[i].getAmount() + "\t\t"  + orders[i].getDate() + "\t\t"  + "\t\t" +orders[i].getCustomerId() );

    System.out.println("------------------------------------------------------------");



System.out.println("---------------------------------------------------------------------");

      
}
      
}
}
    
    

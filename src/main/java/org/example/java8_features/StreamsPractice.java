package org.example.java8_features;

import java.net.Inet4Address;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1L,"p1","Books",100.0));
        products.add(new Product(2L,"p2","Baby",200.0));
        products.add(new Product(3L,"p3","Books",300.0));
        products.add(new Product(4L,"p4","Baby",400.0));

        List<Product> products2 = new ArrayList<>();
        products2.add(new Product(5L,"p5","Toys",100.0));
        products2.add(new Product(6L,"p6","Mobile",200.0));
        products2.add(new Product(7L,"p7","Books",300.0));
        products2.add(new Product(8L,"p8","Toys",400.0));

        Customer c1 = new Customer(90L, "Ram", 1);
        Customer c2 = new Customer(91L, "Shyam", 2);
        Customer c3 = new Customer(92L, "Sita", 3);

        List<Order> orders = new ArrayList<>();
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 2, 1);
        orders.add(new Order(12L, date1, date2, "active", c1, new HashSet<>(products)));
        orders.add(new Order(13L, date1, date2, "active", c2, new HashSet<>(products2)));
        orders.add(new Order(14L, date2, date2, "active", c3, new HashSet<>(products2)));

//        Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
//        This is obviously a filtering logic, the output should fulfill the two filtering requirements.
//        So, you can apply 2 filter() operations to obtain the result.

//        List<Product> productList = products.stream().filter(p -> p.category.equals("Books"))
//                .filter(p -> p.price > 100)
//                .collect(Collectors.toList());
//
//        for(Product p: productList)
//            System.out.println(p.name);


//        Exercise 2 — Obtain a list of order with products belong to category “Baby”
//        You need to start from the data flow from the order entities and then check if order’s products
//        belong to the category “Baby”. Hence, the filter logic looks into the products stream
//        of each order record and use anyMatch() to determine if any product fulfill the criteria.

        List<Order> orderList = orders.stream()
                .filter(o -> o.products.stream().anyMatch(p -> p.category.equals("Baby")))
                .collect(Collectors.toList());

//        Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount

        List<Double> productList3 = products.stream().filter(p -> p.category.equals("Toys"))
                .map(p -> p.price =  p.price * .9)
                .collect(Collectors.toList());


//    Exercise 4 — Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021

        List<Product> productList4 = orders.stream()
                .filter(o -> o.customer.tier == 2)
                .filter(o -> o.orderDate.isAfter(LocalDate.of(2021,2,1))
                        && o.orderDate.isBefore(LocalDate.of(2022,4,1)))

                .flatMap(o -> o.products.stream())
                .distinct()
                .collect(Collectors.toList());

//      Exercise 5 — Get the cheapest products of “Books” category

        Optional<Product> product = products.stream()
                .filter(p -> p.category.equals("Books"))
                .sorted(Comparator.comparing(p -> p.price))
                .findFirst();

        //Better approach
        Optional<Product> product2 = products.stream()
                .filter(p -> p.category.equals("Books"))
                .min(Comparator.comparing(p -> p.price));

//        Exercise 6 — Get the 3 most recent placed order
        List<Order> orderList6 = orders.stream()
                .sorted(Comparator.comparing(o -> o.orderDate, Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toList());

//      Exercise 7 — Get a list of orders which were ordered on 1-Feb-2022, log the order records
//      to the console and then return its product list
        List<Product> productList5 = orders.stream()
                .filter(o -> o.orderDate.compareTo(LocalDate.of(2022,2,1)) == 0)
                .peek(o -> System.out.println(o.toString()))
                .flatMap(o -> o.products.stream())
                .collect(Collectors.toList());

//        Exercise 8 — Calculate total lump sum of all orders placed in Feb 2022
        Double sum = orders.stream()
                .filter(o -> o.orderDate.isAfter(LocalDate.of(2022,1,31)))
                .filter(o -> o.orderDate.isBefore(LocalDate.of(2022,3,1)))
                .flatMap(o -> o.products.stream())
                .mapToDouble(p -> p.price)
                .sum();
        System.out.println(sum);


//        Exercise 9 — Calculate order average payment placed on 1-Feb-2022
        Double avg = orders.stream()
                .filter(o -> o.orderDate.isEqual(LocalDate.of(2022,2,1)))
                .flatMap(o -> o.products.stream())
                .mapToDouble(p -> p.price)
                .average().getAsDouble();
        System.out.println(avg);

        //
//        String s = "anilkumar";
////        char[] ch = s.toCharArray();
////        List<Character> chr = s.
//        int [] freq = new int[256];
////        Stream.of(ch).forEach(c -> System.out.println(c));
//
//        int i=0;
//        List<Integer> list = Stream.of(s).map(c -> {
//            freq[c.charAt(i) - 'a']++;
//            return freq;
//        }).collect(Collectors.toList());

    }
//    public static Map<Character, Long> getFrequency(String s) {
//        return s.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
//    }

}

class Product{
    Long id;

    String name;
    String category;
    Double price;
    Set<Order> orders;

    public Product(Long id, String name, String category, Double price) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

class Order{
    Long id;

    LocalDate orderDate;
    LocalDate deliveryDate;
    String status;

    Customer customer;
    Set<Product> products;

    public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, Customer customer, Set<Product> products) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.customer = customer;
        this.products = products;
    }
}

class Customer{
    Long id;

    String name;
    Integer tier;

    public Customer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }
}

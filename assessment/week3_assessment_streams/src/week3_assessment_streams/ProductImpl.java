package week3_assessment_streams;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class ProductImpl {
	public static void main(String[] args) {
        Supplier supplier1 = new Supplier(1, "Supplier A");
        Supplier supplier2 = new Supplier(2, "Supplier B");

        List<Product> productList = List.of(
                new Product(1, "Milk", "Dairy", 2.0, 50.0, LocalDate.of(2025, 3, 10), supplier1),
                new Product(2, "Rice", "Pulses", 5.0, 60.0, LocalDate.of(2025, 5, 5), supplier2),
                new Product(3, "Chili Powder", "Spices", 1.0, 150.0, LocalDate.of(2024, 3, 1), supplier1), // Expired
                new Product(4, "Cooking Oil", "Oils", 2.0, 300.0, LocalDate.of(2025, 2, 25), supplier2),
                new Product(5, "Chips", "Snacks", 1.0, 30.0, LocalDate.of(2025, 3, 8), supplier1),
                new Product(6, "Salt", "Spices", 1.0, 20.0, LocalDate.of(2024, 3, 15), supplier2) // Will expire soon
        );

        ProductService service = new ProductService();

        Optional<Product> highest = service.getHighestPricedProduct(productList);
        highest.ifPresent(p -> System.out.println("Highest Priced Product: " + p));

        Optional<Product> lowest = service.getLowestPricedProduct(productList);
        lowest.ifPresent(p -> System.out.println("Lowest Priced Product: " + p));

        List<Product> expiredProducts = service.getExpiredProducts(productList);
        System.out.println("Expired Products: " + expiredProducts);

        List<String> expiringSoon = service.getProductsExpiringSoon(productList);
        System.out.println("Products Expiring Soon: " + expiringSoon);

        System.out.println("Product Count by Type: " + service.getProductCountByType(productList));

        System.out.println("Product Count by Supplier: " + service.getProductCountBySupplier(productList));
    }

}

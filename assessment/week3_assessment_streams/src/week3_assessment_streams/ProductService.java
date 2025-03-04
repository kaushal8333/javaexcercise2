package week3_assessment_streams;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class ProductService {
	public Optional<Product> getHighestPricedProduct(List<Product> products) {
        return products.stream()
                .max(Comparator.comparingDouble(p -> p.price));
    }

    public Optional<Product> getLowestPricedProduct(List<Product> products) {
        return products.stream()
                .min(Comparator.comparingDouble(p -> p.price));
    }

    public List<Product> getExpiredProducts(List<Product> products) {
        return products.stream()
                .filter(p -> p.expiryDate.isBefore(LocalDate.now()))
                .collect(Collectors.toList());
    }

    public List<String> getProductsExpiringSoon(List<Product> products) {
        LocalDate today = LocalDate.now();
        LocalDate next10Days = today.plusDays(10);

        return products.stream()
                .filter(p -> !p.expiryDate.isBefore(today) && p.expiryDate.isBefore(next10Days))
                .map(p -> p.name)
                .collect(Collectors.toList());
    }

    public Map<String, Long> getProductCountByType(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(p -> p.type, Collectors.counting()));
    }

    public Map<String, Long> getProductCountBySupplier(List<Product> products) {
        return products.stream()
                .collect(Collectors.groupingBy(p -> p.supplier.sname, Collectors.counting()));
    }

}

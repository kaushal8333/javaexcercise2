package day4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
static List<Product> plist=new ArrayList<>();
	
	public String addProduct(Product p) {
		plist.add(p);
		return "success";
		
	}
	public int deleteProduct(Product p) { //to be  implement
		return 1;
	}
	public int updateProduct(Product p) {//to be  implement
		return 1;
	}
	public void  listProducts(){
		plist.forEach(x->System.out.println(x));
	}
	
	public static Product getProduct(List<Product> l,int id) {
		Iterator<Product> it=l.iterator();
		while(it.hasNext()){
			Product p=it.next();
			if(p.id.equals(id)) {
				return p;
			}
		}
		return null;
	}
	public static double getPrice(List<Product> l,int id) {
		Iterator<Product> it=l.iterator();
		while(it.hasNext()){
			Product p=it.next();
			if(p.id.equals(id)) {
				return p.getPrice();
			}
		}
		return 0;
		
	}
}

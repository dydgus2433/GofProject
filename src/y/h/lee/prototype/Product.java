package y.h.lee.prototype;

//문제풀이
public abstract class Product implements Cloneable{
	public abstract void use(String s);
	public Product createClone() {
		Product p = null;
		try {
			p = (Product) clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}
}

//예제
/*
public interface Product extends Cloneable{
	public abstract void use(String s);
	public abstract Product createClone();
}
*/







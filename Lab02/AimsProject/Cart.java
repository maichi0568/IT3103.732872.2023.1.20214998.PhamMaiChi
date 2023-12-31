package AimsProject;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrderes[]=
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			// In ra thông báo khi giỏ hàng đầy
			System.out.println("Pham Mai Chi 20214998The cart is almost full!");
		} else {
			itemsOrderes[qtyOrdered] = disc;
			qtyOrdered++;
			// In ra thông báo khi đĩa đã được thêm vào giỏ hàng
			System.out.println("Pham Mai Chi 20214998\nThe disc has been added");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			// In ra thông báo khi không có đĩa để xóa
			System.out.println("Pham Mai Chi 20214998\nNo DVD to remove");
			return;
		}
		for (int i = 0; i < qtyOrdered; i++) {
			if (!itemsOrderes[i].equals(disc)) {
				// In ra thông báo khi không tìm thấy đĩa cần xóa
				System.out.println("Pham Mai Chi 20214998\nDVD not found!");
			}
			if (itemsOrderes[i].equals(disc)) {
				for (int j = i; j < qtyOrdered - 1; j++) {
					itemsOrderes[j] = itemsOrderes[j+1];
				}
				qtyOrdered--;
				// In ra thông báo khi xóa đĩa thành công
				System.out.println("Pham Mai Chi 20214998\nRemove successfullly!");
			}
		}
	}
	
	public float totalCost() {
		float totalcost = 0;
		for (int i = 0; i < qtyOrdered; i++) {
			totalcost += itemsOrderes[i].getCost();
		}
		return totalcost;
	}
}

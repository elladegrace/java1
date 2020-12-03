package verify.stock;

public class Item {
	private String itemCode;//��ǰ�ڵ�
	private String name;//��ǰ��
	private int qty;//������
	public Item(String name, int qty) {
		this.name = name;
		this.qty = qty;
	}
	
	public Item(String itemCode, String name, int qty) {
		this.itemCode = itemCode;
		this.name = name;
		this.qty = qty;
	}


	public String getItemCode() {	return itemCode;	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() {	return name;	}
	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {	return qty;	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	//toString
	@Override
	public String toString() {
		return "Item [itemCode=" + itemCode + ", name=" + name + ", qty=" + qty + "]";
	}

}

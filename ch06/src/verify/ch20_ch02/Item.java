package verify.ch20_ch02;

public class Item {
	private String itemCode;//��ǰ�ڵ�
	private String name;//��ǰ��
	private int qty;//������
	
	public Item(String itemCode, String name, int qty) {
		this.itemCode = itemCode;
		this.name = name;
		this.qty = qty;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	
	
	
	
	
	

	
}

package orm.ex.model;

import java.sql.Timestamp;

public class Category {

	private int categoryId;
	private String categoryName;
	private Timestamp categryLastUpdate;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public Timestamp getCategryLastUpdate() {
		return categryLastUpdate;
	}

	public void setCategryLastUpdate(Timestamp categryLastUpdate) {
		this.categryLastUpdate = categryLastUpdate;
	}

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", categryLastUpdate="
				+ categryLastUpdate + "]";
	}

}

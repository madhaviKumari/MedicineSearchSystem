package co.ass.medical.Med.model;

import com.poiji.annotation.ExcelCell;

public class MedicinRow {
	@ExcelCell(0) 
	private String c_name;
	@ExcelCell(1) 
	private String c_batch_no;
	@ExcelCell(2) 
	private String d_expiry_date;
	@ExcelCell(3) 
	private double n_balance_qty;
	@ExcelCell(4) 
	private String c_packaging;
	@ExcelCell(5) 
	private String c_unique_code;
	@ExcelCell(6) 
	private double c_schemes;
	@ExcelCell(7) 
	private double n_mrp;
	@ExcelCell(8) 
	private String c_manufacturer;
	@ExcelCell(9) 
	private double hsn_code;
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_batch_no() {
		return c_batch_no;
	}
	public void setC_batch_no(String c_batch_no) {
		this.c_batch_no = c_batch_no;
	}
	public String getD_expiry_date() {
		return d_expiry_date;
	}
	public void setD_expiry_date(String d_expiry_date) {
		this.d_expiry_date = d_expiry_date;
	}
	public double getN_balance_qty() {
		return n_balance_qty;
	}
	public void setN_balance_qty(double n_balance_qty) {
		this.n_balance_qty = n_balance_qty;
	}
	public String getC_packaging() {
		return c_packaging;
	}
	public void setC_packaging(String c_packaging) {
		this.c_packaging = c_packaging;
	}
	public String getC_unique_code() {
		return c_unique_code;
	}
	public void setC_unique_code(String c_unique_code) {
		this.c_unique_code = c_unique_code;
	}
	public double getC_schemes() {
		return c_schemes;
	}
	public void setC_schemes(double c_schemes) {
		this.c_schemes = c_schemes;
	}
	public double getN_mrp() {
		return n_mrp;
	}
	public void setN_mrp(double n_mrp) {
		this.n_mrp = n_mrp;
	}
	public String getC_manufacturer() {
		return c_manufacturer;
	}
	public void setC_manufacturer(String c_manufacturer) {
		this.c_manufacturer = c_manufacturer;
	}
	public double getHsn_code() {
		return hsn_code;
	}
	public void setHsn_code(double hsn_code) {
		this.hsn_code = hsn_code;
	}
	
	public Medicine toMedicin() {
		Medicine m = new Medicine();
		m.setC_batch_no(c_batch_no);
		m.setC_manufacturer(c_manufacturer);
		m.setC_packaging(c_packaging);
		m.setC_schemes(c_schemes);
		m.setCname(c_name);
		m.setcUniqueCode(c_unique_code);
		m.setD_expiry_date(d_expiry_date);
		m.setHsn_code(hsn_code);
		m.setN_balance_qty(n_balance_qty);
		m.setN_mrp(n_mrp);
		return m;
	}
	

}

package co.ass.medical.Med.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Medicine {
	
	@Id
	private String cUniqueCode;
	private String cname;
	private String c_batch_no;
	private String d_expiry_date;
	private double n_balance_qty;
	private String c_packaging;
	private double c_schemes;
	private double n_mrp;
	private String c_manufacturer;
	private double hsn_code;
	public String getcUniqueCode() {
		return cUniqueCode;
	}
	public void setcUniqueCode(String cUniqueCode) {
		this.cUniqueCode = cUniqueCode;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
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
	
	

}

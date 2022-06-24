package ThuVienX;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Sach {
	protected String MaSach;
	protected GregorianCalendar NgayNhap;
	protected double DonGia;
	protected int SoLuong;
	protected String NhaSX;
	public String getMaSach() {
		return MaSach;
	}
	public void setMaSach(String maSach) {
		MaSach = maSach;
	}
	public GregorianCalendar getNgayNhap() {
		return NgayNhap;
	}
	public void setNgayNhap(GregorianCalendar ngayNhap) {
		NgayNhap = ngayNhap;
	}
	public double getDonGia() {
		return DonGia;
	}
	public void setDonGia(double donGia) {
		DonGia = donGia;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public String getNhaSX() {
		return NhaSX;
	}
	public void setNhaSX(String nhaSX) {
		NhaSX = nhaSX;
	}
	public Sach(String maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nhaSX) {
		super();
		MaSach = maSach;
		NgayNhap = ngayNhap;
		DonGia = donGia;
		SoLuong = soLuong;
		NhaSX = nhaSX;
	}
	public Sach() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String toString(){
		 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		 DecimalFormat de = new DecimalFormat("###,000");
		return String.format("%10s %10s %20f %3d %20s",getMaSach(),df.format(getNgayNhap().getTime()),getDonGia(),getSoLuong(),getNhaSX());
	}

	

}

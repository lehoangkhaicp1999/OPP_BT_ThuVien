package ThuVienX;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;

public class ThamKhao extends Sach {
	private int Thue;

	public int getThue() {
		return Thue;
	}

	public void setThue(int thue) {
		Thue = thue;
	}

	public ThamKhao(String maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nhaSX, int thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaSX);
		Thue = thue;
	}

	public ThamKhao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThamKhao(String maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nhaSX) {
		super(maSach, ngayNhap, donGia, soLuong, nhaSX);
		// TODO Auto-generated constructor stub
	}
	 public double TTien() 
		{  double ThanhTien=0;
			
			return ThanhTien=this.SoLuong * this.DonGia*((this.Thue*1.0)/100);
		}
	 public String toString() {
			// TODO Auto-generated method stub
		 DecimalFormat df = new DecimalFormat("###,000");
			String strsgk= String.format("%15d %15s", this.Thue,df.format(TTien()));
			return super.toString()+ strsgk;
		}
	 
}

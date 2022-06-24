package ThuVienX;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;

public class GiaoKhoa extends Sach {
		private int number;
		private String TinhTrang;
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public String getTinhTrang() {
			return TinhTrang;
		}
		public GiaoKhoa(String maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nhaSX,
				int number) {
			super(maSach, ngayNhap, donGia, soLuong, nhaSX);
			this.number = number;
		}
		public GiaoKhoa() {
			super();
			// TODO Auto-generated constructor stub
		}
		public GiaoKhoa(String maSach, GregorianCalendar ngayNhap, double donGia, int soLuong, String nhaSX) {
			super(maSach, ngayNhap, donGia, soLuong, nhaSX);
			// TODO Auto-generated constructor stub
		}
		 public String tinhTrangSach(int x) {
		        switch (number) {
		            case 0:
		                TinhTrang = "cũ";
		                break;
		            case 1:
		                TinhTrang = "mới";
		                break;
		            default:
		                break;
		        }
		        return TinhTrang;
		    }
		 public double TTien() 
			{	double ThanhTien =0;
				if(this.number ==1)
			{
				 ThanhTien = this.DonGia * this.SoLuong;
			}
			else if(number == 0)
			{
				 ThanhTien = this.DonGia * this.SoLuong *((50*1.0)/100);
			}
				return ThanhTien;
			}
		 public String toString() {
				// TODO Auto-generated method stub
			 DecimalFormat df = new DecimalFormat("###,000");
				String strsgk= String.format("%15s %15s", this.tinhTrangSach(number),df.format(TTien()));
				return super.toString()+ strsgk;
			}
		
}

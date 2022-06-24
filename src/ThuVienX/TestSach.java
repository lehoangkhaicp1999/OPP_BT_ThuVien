package ThuVienX;

import java.text.DecimalFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;




public class TestSach {
	static DanhSachSach abc = new  DanhSachSach(); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 DecimalFormat df = new DecimalFormat("###,000");
			 Scanner sc = new Scanner(System.in);
				Menu();
				int chon =-1;
				chon= sc.nextInt();
			 while(chon!=0) {
					switch(chon)
					{
					case 1:
						xuatSGK();
						xuatSTK();
						break;
					case 2:try {
						nhapcung();
					}catch (Exception e) {
						// TODO: handle exception
						System.out.println("trung a sach");
					}
						break;
					case 3:
						xuatSTK();
						break;
					case 4:
						xuatSGK();
						break;
					case 5:
						xuatSTK();
						System.out.println("Trung Bình Cộng Đơn Giá Sách Tham Khảo \t"+df.format((abc.Tongdongiastk()*1.0)/abc.soluongstk()));
						break;
					case 6:
						xuatSGK();
						System.out.println("Tổng thành tiền tất các Sách Giáo Khoa \t"+ df.format(abc.TongThanhTiensgk()));
						break;
					case 7:
						xuatSTK();
						System.out.println("Tổng Thành Tiền tất cả Sách Tham Khảo \t"+ df.format(abc.TongThanhTienstk()));
						break;
					case 8:
						String NhaXuatBan;
						sc.nextLine();
						NhaXuatBan = sc.nextLine();
						tieudecotsgk();
						System.out.println(abc.timNXB(NhaXuatBan));
						System.out.println("so luong sach co nha xuat ban "+abc.countNXB(NhaXuatBan));
						
						break;
					case 9:
						try {
				
						System.out.println("Nhập Mã Sách Muốn Thêm:");
						Scanner input = new Scanner(System.in);
						String MaSach = input.nextLine();
						Sach accTim = abc.timSachKhuyetTat(MaSach);
					if(accTim==null) {
						Sach mem= NhapMem();
						abc.themSach(mem);
					}else
					{System.out.println("sách đã tồn tại");}}catch (Exception e) {
						System.out.println("lỗi ");
					}
						break;
					default:
						System.out.println("Lua chon sai");
						break;
					}
					Menu();
					chon = sc.nextInt();
					if(chon==0)
					{
						System.out.println("Xin cam on!!!");
						break;
					}		
//			nhapcung();
//			xuatSGK();
//			System.out.println("Tong Thanh Tien sach giao khoa \t"+ df.format(abc.TongThanhTiensgk()));
//			xuatSTK();
//			System.out.println("Tong Thanh Tien sach tham khoa \t"+ df.format(abc.TongThanhTienstk()));
//			System.out.println("Trung Binh Don Gia \t"+df.format((abc.Tongdongiastk()*1.0)/abc.soluongstk()));
		} }catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	static void nhapcung() throws Exception
	{
		GregorianCalendar ngay1 = new GregorianCalendar(2017,2,1);
		Sach s1 = new GiaoKhoa("11", ngay1, 20000, 10, "X", 1);
		abc.themSach(s1);
		Sach s6 = new GiaoKhoa("11", ngay1, 20000, 10, "X", 1);
		abc.themSach(s6);
		GregorianCalendar ngay2 = new GregorianCalendar(2017,2,1);
		Sach s2 = new GiaoKhoa("11C", ngay1, 20000, 10, "Y", 0);
		abc.themSach(s2);
		Sach s5 = new GiaoKhoa("11H", ngay1, 20000, 10, "Y", 0);
		abc.themSach(s5);
		Sach s3 = new ThamKhao("11E", ngay1, 21000, 10, "zcx", 10);
		abc.themSach(s3);
		Sach s4 = new ThamKhao("11F", ngay1, 20000, 10, "zcx", 50);
		abc.themSach(s4);
	}
	static void tieudecotsgk()
	{	System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		//%10s %10s %10f %3d %15s %15s
		System.out.println("\t\t  ******  Danh Sách Các Sách Giáo Khoa Có Trong Thư Viện ******");
		System.out.println("===============================================================================================================================");
		String s = "";
		s+=s.format("%10s %10s %20s %3s %20s %15s %15s","Ma Sach","NgayNhap","Don gia","So Luong","Nha Xuat Ban","Tinh Trang","Thanh Tien");
		System.out.println(s);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	}
	static void tieudecotstk()
	{   System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("\t\t  *****  Danh Sách Các Sách Tham Khảo Có Trong Thư Viện ******");
		System.out.println("===============================================================================================================================");
		//%10s %10s %10f %3d %15s %15s
		String s = "";
		s+=s.format("%10s %10s %20s %3s %20s %15s %15s","Ma Sach","NgayNhap","Don gia","So Luong","Nha Xuat Ban","Thue","Thanh Tien");
		System.out.println(s);
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
	}
	static void xuatSGK()
	{ 	tieudecotsgk();
		
		for (Sach  t : abc.getHetDSSach()) 
		{
			if(t instanceof GiaoKhoa)
				System.out.println(t);
		}
	}
	static void xuatSTK()
	{
		tieudecotstk();
		for (Sach  t : abc.getHetDSSach()) 
		{
			if(t instanceof ThamKhao)
				System.out.println(t);
		}
	}
	static Sach NhapMem() {
		 int number;
		 String MaSach;
		 double DonGia;
		 int SoLuong;
		 String NhaSX;
		 int Thue;
		 
		 Sach sach = null;
		 int loaisach;
		 System.out.println("Bạn chọn nhập cho sgk nhấn 1 phím bất kỳ là stk ");
		 System.out.println("Mời bạn chọn");
		 Scanner sc = new Scanner(System.in);
		 loaisach = sc.nextInt();
		 sc.nextLine();
		 System.out.println("Mời Bạn Nhập Lại Mã Sách");
		 MaSach = sc.nextLine();
		 System.out.println("Nhập Ngày Nhập Sách Theo Thứ Tự, Năm , Tháng , Ngày");
		 GregorianCalendar NgayNhap = new GregorianCalendar(sc.nextInt(),sc.nextInt()-1,sc.nextInt());
		 System.out.println("Nhập Ngày Đơn Giá  ");
		 DonGia = sc.nextDouble();
		 System.out.println("Nhập Sô Lượng");
		 SoLuong = sc.nextInt();
		 System.out.println("Nhập Nhà Sản Xuất");
		 sc.nextLine();
		 NhaSX= sc.nextLine();
		 if(loaisach==1)
		 {
			 System.out.println("nhập Tinh Trạng Sách");
			 System.out.println("Sách cũ là 0, Sách Mới Là 1");
			 number = sc.nextInt();
			 sach = new GiaoKhoa(MaSach, NgayNhap, DonGia, SoLuong, NhaSX, number);
		 }
		 else if(loaisach == 0)
		 {
			 System.out.println("Nhập Thuế");
			 Thue = sc.nextInt();
			 sach = new ThamKhao(MaSach, NgayNhap, DonGia, SoLuong, NhaSX, Thue);
			 
		 }
		 return sach;
		 
		 
	}
	static void Menu()
	{
		System.out.println("Chương Trình Quản Lý Thư Viện X ");
		System.out.println("1. Xuất Tất Cả Sách Trong Thư Viện ");
		System.out.println("2. Nhập Cứng Sách");
		System.out.println("3. Xuất Sách Tham Khảo");
		System.out.println("4. Xuất Sách Giáo Khoa");
		System.out.println("5. Trung Bình Cộng Đơn Giá Sách Tham Khảo");
		System.out.println("6. Tổng Thành Tiền Sách Giáo Khoa ");
		System.out.println("7. Tổng Thành Tiền Sách Tham Khảo");
		System.out.println("8. Tìm Nhà Xuất Bản Theo Tên Trong Thư Viện Sách Giáo Khoa");
		System.out.println("9. Nhập Thêm Mềm");
		System.out.println("0. Thoát chương trình");
		System.out.println("Lựa chọn của bạn:");
	}	
}

package ThuVienX;

import java.util.ArrayList;

import java.util.List;




public class DanhSachSach {
	List<Sach> DSSach = new ArrayList<Sach>();
	public Sach timSachKhuyetTat(String masach)
	{
		int viTri;
		for(Sach ms: DSSach)
		{
			if(ms.getMaSach().equalsIgnoreCase(masach))
			{
				 viTri=DSSach.indexOf(ms);
				 return  DSSach.get(viTri);
			}
		}
		return null;

	}
	public Sach timNXB(String masach)
	{ 
		for(Sach ms: DSSach)
		{
			if(ms instanceof GiaoKhoa)
			{
			if(ms.getNhaSX().equalsIgnoreCase(masach))
			return DSSach.get(DSSach.indexOf(ms));
			}
		}
		return null;

	}
	public int countNXB(String masach)
	{ int count =0;
		for(Sach ms: DSSach)
		{
			if(ms instanceof GiaoKhoa)
			{
			if(ms.getNhaSX().equalsIgnoreCase(masach))
		count++;
			}
		}
		return count;

	}
	public Sach timsach(Sach ms)
	{
		
		int viTri= DSSach.indexOf(ms);
		if(viTri>=0)//Thấy
			return DSSach.get(viTri);
		else
			return null;
	}
	public long Tongdongiastk()
	{
		long sum=0;
		for(Sach cx: DSSach)
		{
			if(cx instanceof ThamKhao)
				sum+= cx.getDonGia();
		}
		return sum;
	}
	public long soluongstk()
	{
		long count =0;
		for(Sach s: DSSach)
		{
			if(s instanceof ThamKhao)
				count++;
		}
		return count;
	}
	public long TongThanhTiensgk()
	{
		long sum=0;
		for(Sach cx: DSSach)
		{
			if(cx instanceof GiaoKhoa)
				sum+= ((GiaoKhoa) cx).TTien();
		}
		return sum;
	}
	public long TongThanhTienstk()
	{
		long sum=0;
		for(Sach cx: DSSach)
		{
			if(cx instanceof ThamKhao)
				sum+= ((ThamKhao) cx).TTien();
		}
		return sum;
	}
	
	public List<Sach> getHetDSSach()
	{
		return DSSach;
	}
	public boolean themSach(Sach s) throws Exception
	{
		if(DSSach.contains(s))
		{
			throw new Exception("Trung ma sach");
			
		}
		else
		{
		DSSach.add(s);
		}
		
		return true;
		
	}
}

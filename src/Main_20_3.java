class SinhVien{
    String ten;
    String msv;
    private Object dtb;

    SinhVien(String ten, String msv, Object dtb){
        this.ten = ten;
        this.msv = msv;
        this.dtb = dtb;
    }

    public Object getDtb() {
        return dtb;
    }

    public void setDtb(Object dtb) {
        this.dtb = dtb;
    }

    public void hienThiThongTin(){
        System.out.println("------------------------------");
        System.out.println("Ten: "+ ten);
        System.out.println("Ma sinh vien: "+ msv);
        System.out.println("DTB: "+ dtb);
    }
}

public class Main_20_3 {
    public static void main(String[] args) {
        SinhVien s1 = new SinhVien("Nguyen Hai Anh", 11243749, 10);
        SinhVien s2 = new SinhVien("Nguyen Tuan Hiep", 11243769, 1);
        SinhVien sqt1 = new SinhVien("Peter","P09123", "B+");
        SinhVien s3 = new SinhVien("Thanh", "23232", 9);
        System.out.println(s1.getDtb()+s2.getDtb()+s3);
        s1.hienThiThongTin();;
        s2.hienThiThongTin();
    }
}

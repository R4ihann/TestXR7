//object class
public class Karyawan {
    int id;
    String nama, unit, alamat;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama(){
        return this.nama;
    }
	public void setNama (String nama) {
        this.nama = nama;
	}

    public String getUnit(){
        return this.unit;
    }
    public void setUnit(String unit){
        this.unit = unit;
    }
    
    public String getAlamat(){
        return this.alamat;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    //Constructor Parameter
    public Karyawan(int id, String nama, String unit, String alamat) {
        //variabel = parameter
        this.id = id;
        this.nama = nama;
        this.unit = unit;
        this.alamat = alamat;
    }

    //method print
    public void print() {
        System.out.println("ID : "+ id);
        System.out.println("Nama : "+ nama);
        System.out.println("Unit : "+ unit);
        System.out.println("Alamat : "+ alamat);
    }
}
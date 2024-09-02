package KelasGuru;

public class KelasGuruObject {
    //Variable
    private String name;
    private int nip;
    private String mapel;
    private String status;



    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMapel() {
        return this.mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //Constructor default
    public KelasGuruObject() {
        name = "Kosong";
        nip = 0;
        mapel = "Kosong";
        status = "Kosong";
    }

    //Constructor parameter
    public KelasGuruObject(String name, int nip, String mapel, String status) {
        this.name = name;
        this.nip = nip;
        this.mapel = mapel;
        this.status = status;
    }

    //Getter --> untuk mengambil var
    public int getNip() {
        return nip;
    }

    //Setter
    public void setNip(int nip) {
        //variable = parameter
        this.nip = nip;
    }
    //method
    public void setId() {
        System.out.println("Name = " + name);
        System.out.println("NIP = " + nip);
        System.out.println("Mapel = " + mapel);
        System.out.println("Status = " + status);
    }
}

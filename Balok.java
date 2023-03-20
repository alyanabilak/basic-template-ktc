class Balok implements MenghitungBidang, MenghitungRuang{
    private int panjang;
    private int lebar;
    private int tinggi;

    public void Balok(){
        //default
    }
    
    public void Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public double getBidang(){
        return 2 * ((panjang * lebar) + (lebar * tinggi) + (panjang * tinggi));
    }
    
    public double getRuang(){
        return panjang * lebar * tinggi;
    }
}
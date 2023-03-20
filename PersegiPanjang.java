class PersegiPanjang implements MenghitungBidang, MenghitungRuang{
    private int panjang;
    private int lebar;

    public void PersegiPanjang(){
        //default
    }
    
    public void PersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
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
    
    public double getBidang(){
        return (2 * panjang) + (2 * lebar);
    }
    
    public double getRuang(){
        return panjang * lebar;
    }
}
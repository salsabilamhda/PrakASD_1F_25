package P3.ArrayBalok;

public class Balok25 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok25(int p, int l, int t)
    {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public Balok25(int p)
    {
        panjang = p;
    }

    public int hitungVolume()
    {
        return panjang * lebar * tinggi;
    }
}

package mvc.model;

public class Kucing extends  Hewan{
  public  Kucing (String nama, int umur) {
    super(nama, umur);
  }

  @Override 
  public  void bersuara () {
    System.out.println(nama + " bilang : Meong!");
  }

  public  void meong () {
    System.out.println(nama + " bilang: Meong !");
  }
}

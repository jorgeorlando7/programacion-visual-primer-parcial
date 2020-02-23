package book;

public class Fiction extends Book{

    public Fiction(String title) {
        super(title);
        setPrice();
    }
    
    public void setPrice(){
        super.mPrice=24.99;
    }
}
    
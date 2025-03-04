package Inheritance;

public class DVD extends Product{
    private int length;
    private String rating;
    private String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD(){
        number=1;
        name="For Revenge";
        quantity=2;
        price=14.3;
        length=4;
        rating="NC-13";
        studio="Sony Entertainment";
    }

    public DVD(String rating, String studio, int length){
        this.rating=rating;
        this.studio=studio;
        this.length=length;      
    }
    
    @Override  
    public void print(){
        super.print();
        System.out.println("Name: "+name);
        System.out.println("Studio: "+studio);
        System.out.println("Rating: "+rating);
        System.out.println("Price: "+price);
        System.out.println("length: "+length);
        System.out.println("Quantity: "+quantity);
        System.out.println("Number: "+number);
    }

}

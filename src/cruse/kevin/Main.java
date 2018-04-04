package cruse.kevin;

public class Main
{

    public static void main(String[] args)
    {
        Goose MyGoose;
        Goose MyGoose2;
        MyGoose = new Goose();
        MyGoose2 = new Goose();
        MyGoose.setGooseWeight(10.5);
        MyGoose.setGooseBreed("Toulouse");
        MyGoose.setGooseAge(2.5);
        MyGoose.setGooseSex("Male");
        MyGoose.setGooseOrigin("America");
        MyGoose2.setGooseWeight(9.5);
        MyGoose2.setGooseBreed("Tufted Roman");
        MyGoose2.setGooseAge(1.0);
        MyGoose2.setGooseSex("Female");
        MyGoose2.setGooseOrigin("Rome");
        System.out.println("Breed: " + MyGoose.getGooseBreed());
        System.out.println("Weight: " + MyGoose.getGooseWeight());
        System.out.println("Age: " + MyGoose.getGooseAge());
        System.out.println("Sex: " + MyGoose.getGooseSex());
        System.out.println("Country of origin: " + MyGoose.getGooseOrigin());
        System.out.println();
        System.out.println("Breed: " + MyGoose2.getGooseBreed());
        System.out.println("Weight: " + MyGoose2.getGooseWeight());
        System.out.println("Age: " + MyGoose2.getGooseAge());
        System.out.println("Sex: " + MyGoose2.getGooseSex());
        System.out.println("Country of origin: " + MyGoose2.getGooseOrigin());
    }

}
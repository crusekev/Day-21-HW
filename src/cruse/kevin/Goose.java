package cruse.kevin;

public class Goose
{
    private double GooseWeight;
    private String GooseBreed;
    private double GooseAge;
    private String GooseSex;
    public String GooseOrigin;
    public Goose(double Weight, String Breed, double Age, String Sex, String Origin)
    {
        GooseWeight = Weight;
        GooseBreed = Breed;
        GooseAge = Age;
        GooseSex = Sex;
        GooseOrigin = Origin;
    }
    public Goose()
    {
    }
    public void setGooseWeight(double Weight)
    {
        GooseWeight = Weight;
    }
    public void setGooseBreed(String Breed)
    {
        GooseBreed = Breed;
    }
    public void setGooseAge(double Age)
    {
        GooseAge = Age;
    }
    public void setGooseSex(String Sex)
    {
        GooseSex = Sex;
    }
    public void setGooseOrigin(String Origin)
    {
        GooseOrigin = Origin;
    }
    public double getGooseWeight()
    {
        return GooseWeight;
    }
    public String getGooseBreed()
    {
        return GooseBreed;
    }
    public double getGooseAge()
    {
        return GooseAge;
    }
    public String getGooseSex()
    {
        return GooseSex;
    }
    public String getGooseOrigin()
    {
        return GooseOrigin;
    }
}

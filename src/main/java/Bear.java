public class Bear
{
  private static String name;
  private static int age;
  private static double weight;
  private static char gender;

  public Bear(String name, int age, double weight, char gender) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.gender = gender;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String rName) {
    this.name = rName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int rAge) {
    this.age = rAge;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double rWeight) {
    this.weight = rWeight;
  }

  public char getGender() {
    return this.gender;
  }

  public boolean readyToHibernate() {
    if (this.weight >= 80)
    {
      return true;
    }

    return false;

  }

}

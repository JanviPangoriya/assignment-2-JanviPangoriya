package problem3;
public class Student{
  private String name;
  private int rollNo;
  public Student (String name,int rollNo)
  {
    this.name=name;
    this.rollNo=rollNo;
  }
  public int getRollNo()
  {
    return rollNo;
  }
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public void setRollNo(int rollNo)
  {
    this.rollNo=rollNo;
  }
  @Override
  public String toString()
  {
    return "Student Name : "+getName()+" RollNo : "+getRollNo();
  }
}


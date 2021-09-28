package StaticAndFinal;

public class Student {
    private static int rollNoCount = 0;
    private static String clgName;
    private String name;
    private int rollNo;

    public Student(String name) {
        this.name = name;
        this.rollNoCount++;
        this.rollNo = this.rollNoCount;
    }

    public static String getClgName() {
        return clgName;
    }

    public static void setClgName(String clgName) {
        Student.clgName = clgName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String toString(){
        return "Name: "+this.name+
        " | Roll No. "+this.rollNo+
        " | College: "+clgName;
    }
    
}

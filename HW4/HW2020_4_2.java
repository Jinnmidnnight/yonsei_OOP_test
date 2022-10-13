package HW4;

public class HW2020_4_2 {
    public static void main(String args[]) {
		
		Student42 s1 = new Student42("Tom", 2, 243, 89, 95, 65); 
		Student42 s2 = new Student42("Jenny", 3, 24, 79, 76, 85); 
		Student42 s3 = new Student42(); 
		Student42 s4 = s2; 
		
		System.out.println("s1 has name:" + s1.getName() + 
				           " group:" + s1.getGroup() + 
				           " id:" + s1.getId() + 
				           " grade:" + s1.getKor() + " " + 
				           s1.getEng() + " " + s1.getMath() + "\n");
		
		System.out.println(s1.toString() + " average(" + s1.average() + ")"); 
		System.out.println(s2.toString() + " average(" + s2.average() + ")");
		System.out.println(s3);
		System.out.println(s4); 
		System.out.println(); 
		
		s3.setName(s1.getName());
		s3.setGroup(s1.getGroup());
		s3.setId(s1.getId());
		s3.setGrade(s1.getKor(), s1.getEng(), s1.getMath());
		s4.setGrade(25, 50, 30);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4); 
		System.out.println(); 
		
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s4)); 
		System.out.println(s2 == s4); 
	}
}

class Student42 {
    private String name;
    private int group;
    private int id;
    private int kor;
    private int eng;
    private int math;

    public String toString() {
        return "[Student] name("+name+") group("+group+") id("+id+
                ") kor("+kor+") eng("+eng+") math("+math+")";
    }
    public boolean equals(Student42 other) {
        if (name.equals(other.name)&&group==other.group&&id==other.id
            &&kor==other.kor&&eng==other.eng&&math==other.math) {
                return true;
            }
        else {
            return false;
        }
    }
    public double average() {
        double avg = (kor + eng + math) / 3;
        return avg;
    }
    public void setGrade(int kor, int eng, int math) {
        this.kor = kor; this.eng = eng; this.math = math;
    }
    public void setId(int id) {this.id = id;};
    public void setGroup(int group) {this.group = group;};
    public void setName(String name) {this.name = name;};
    public int getEng() {return eng;};
    public int getMath() {return math;};
    public int getId() {return id;};
    public int getKor() {return kor;}; 
    public int getGroup() {return group;};
    public String getName() {return name;};
    public Student42(String name, int group, int id, int kor, int eng, int math) {
        this.name = name;
        this.group = group;
        this.id = id;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    public Student42() {
        name = "noname";
    }

}
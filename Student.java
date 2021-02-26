class Student {
  String name;
  double gpa;
  String major;

  String getName() {
    return name;
  }

  double getGPA() {
    return gpa;
  }

  String getMajor() {
    return major;
  }

  void setName(String theName) {
    name = theName;
  }

  void setGPA(double theGPA) {
    gpa = theGPA;
  }

  void setMajor(String theMajor) {
    major = theMajor;
  }

  void printName(){
    System.out.println("The student's name is " + name);
  }

    void printGPA(){
    System.out.println("The student's GPA is " + gpa );
  }

    void printMajor(){
    System.out.println("The student's major is " + major);
  }

}
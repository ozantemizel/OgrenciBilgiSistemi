public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo=stuNo;
        this.classes= classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.average=0.0;
        this.isPass=false;
    }
    void addBulkExamNotes(int note1,int sozluNote1,int note2, int sozluNote2, int note3,int sozluNote3){
        if(note1>=0 && note1<=110) {
            this.c1.note = note1;
        }
        if(note2>=0 && note2<=100) {
            this.c2.note = note2;
        }

        if(note3>=0 && note3<=100) {
            this.c3.note = note3;
        }
        if(sozluNote1>=0 && sozluNote1<=100){
            this.c1.sozluNote=sozluNote1;
        }
        if(sozluNote2>=0 && sozluNote2<=100) {
            this.c2.sozluNote=sozluNote2;
        }
        if(sozluNote3>=0 && sozluNote3<=100){
            this.c3.sozluNote=sozluNote3;
        }
    }

    void printNote(){
        System.out.println(this.c1.name+ " Notu\t:"+this.c1.note);
        System.out.println(this.c2.name+ " Notu\t:"+this.c2.note);
        System.out.println(this.c3.name+ " Notu\t:"+this.c3.note);
        System.out.println("Ortalamanız: "+this.average);
    }

    void isPass(){
        double ortTrh = this.c1.note*0.8 + this.c1.sozluNote*0.2;
        double ortFiz = this.c2.note*0.8 + this.c2.sozluNote*0.2;
        double ortBiyo = this.c3.note*0.8 + this.c3.sozluNote*0.2;

        this.average= (ortFiz+ortBiyo+ortTrh)/3;
        if(this.average>55){
            System.out.println("Hababam sınıfı uyanıyor");
            this.isPass=true;
        }else {
            System.out.println("Hababam sınıfı sınıfta kaldı!");
            this.isPass=false;
        }

        printNote();
    }

}

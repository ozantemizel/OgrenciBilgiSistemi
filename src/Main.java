public class Main {
    public static void main(String[] args) {
    Teacher t1 = new Teacher("Mahmut Hoca", "+90555", "TRH");
    Teacher t2= new Teacher("Graham Bell", "23464654", "FZK");
    Teacher t3 = new Teacher("Külyutmaz", "11111", "BIO");

    Course tarih = new Course("Tarih", "101", "TRH");
    tarih.addTeacher(t1);

    Course fizik= new Course("Fizik","102","FZK");
    fizik.addTeacher(t2);

    Course biyo = new Course("Biyoloji", "101", "BIO");
    biyo.addTeacher(t3);

    Student s1= new Student("İnek Şaban","123","4",tarih,fizik,biyo);
    s1.addBulkExamNotes(100,80,50,40,55,70);
    s1.isPass();

    Student s2 = new Student("Düdük Necmi","3453","4",tarih,fizik,biyo);
    s2.addBulkExamNotes(60,75,30,80,56,24);
    s2.isPass();
    }
}

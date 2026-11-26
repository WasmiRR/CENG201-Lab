package project;

public class Course {

    private String courseCode;
    private String courseName;
    private int credit;
    private int capacity;
    private int enrolledCount; // Şu an derse kayıtlı kişi sayısı.



    public Course(String courseCode, String courseName, int credit, int capacity){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credit=credit;
        this.capacity = capacity;
        this.enrolledCount = 0; // Şu an kayıtlı kişi sayısı "0" başlangıçta

    }


    //önce kontenjan dolu mu onun kontrolünü yapalım, önceliğimiz o olacak.
    public boolean isFull(){
        return enrolledCount>=capacity;
        //eğer kayıtlı kişi sayısı kapasiteye büyük veya eşitse full diyeceğiz.

    }

    //Eğer halen yer varsa 1 arttır;
    public boolean enrollStudent(){
        if (isFull()) {
            return false;
        }
        enrolledCount++;
        return true;

        }
    //İptal veya dersi bırakma durumunda kayıt sayısını 1 azaltmak için;

    public boolean dropStudent(){
        if (enrolledCount <=0){ // // Derse kayıtlı öğrenci yoksa sayıyı 0'ın altına düşürmemek için if statementi.
            return false;
        }
        enrolledCount--;
        return true;
    }
    //Getter metodları;
    public String getCourseCode(){
        return courseCode;
    }

    public String getCourseName(){
        return courseName;
    }

    public int getCredit(){
        return credit;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getEnrolledCount(){
        return  enrolledCount;
    }

    @Override //Anlamsız bellek adresi döndürmemek için, dersi ekrana yazdırırken kod,ad, kredi ve doluluk bilgisini okunur metin olarak sunmak için;
    public String toString(){
        return courseCode + " - " + courseName + " (" + credit + "Credit) [" + enrolledCount + "/" + capacity + "]" ;
    }

}

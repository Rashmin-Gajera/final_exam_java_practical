/**
 * Time
 */
class Time {

    int hour;
    int min;

    Time(int hr, int min) {
        this.hour = hr;
        this.min = min;

    }
    Time() {
        this.hour =0;
        this.min = 0;

    }


    

    Time total(Time obj1 , Time obj2) {


        Time temp =new Time();

        if (obj1.min + obj2.min > 60) {

            temp.hour = obj1.hour + obj2.hour + 1;
            temp.min = obj1.min + obj2.min - 60;

        } else {

            temp.hour = obj1.hour + obj2.hour ;
            temp.min = obj1.min + obj2.min ;
        }

        return temp;
    }

}

public class exam {

    public static void main(String[] args) {


        Time t1=new Time(5,45);
        Time t2=new Time(2,34);
        Time concate = new Time();


        System.out.println("Time t1 "+ t1.hour+":" +t1.min);
        System.out.println("Time t2 "+ t2.hour+":" +t2.min);
        concate=concate.total(t1, t2);
        System.out.println("After Concating");
        System.out.println("Time t1 "+ t1.hour+":" +t1.min);
        System.out.println("Time t2 "+ t2.hour+":" +t2.min);
        System.out.println("Time total "+ concate.hour+":" +concate.min);



    }
}



// q-left pinkey w e rt yu i o p
// asdf  gh    jkl;
// zxcvb       lnm

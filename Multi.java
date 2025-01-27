interface Studentone {
        void getdetails();
        void showdetails();
    }

    interface Studenttwo {
        void getdetails2();
        void showdetails2();
    }


    public class Multi implements Studentone, Studenttwo {
        int roll;
        String name, div;
        String enrollno;

        int roll2;
        String name2, div2;
        String enrollno2;



        public void getdetails() {
            roll = 21;
            name = "Tanisha Bhujbal";
            div = "K";
            enrollno = "SOE2420104001" ;
        }


        public void getdetails2() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + roll);
            System.out.println("Division: " + div);
            System.out.println("Enrollment number:\n" + enrollno);
            System.out.println("" +
                    "");
        }



        public void showdetails() {
            roll2 = 27;
            name2 = "Arya Thorat";
            div2 = "K";
            enrollno2 = "SOE2420104007" ;
        }


        public void showdetails2() {
            System.out.println("Name: " + name2);
            System.out.println("Roll No: " + roll2);
            System.out.println("Division: " + div2);
            System.out.println("Enrollment number: " + enrollno2);
        }


        public static void main(String[] args) {
            Multi mt = new Multi();


            mt.getdetails();
            mt.getdetails2();
            mt.showdetails();
            mt.showdetails2();
        }
    }


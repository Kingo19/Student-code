public class New {
    public static void main(String[] args) {
        boolean x = gradeTestPassFail(69.0);
        System.out.println(x);

        int z = gradeTestNumeric(66);
        System.out.println(z);

        String y = gradeTestLetter(32);
        System.out.println(y);

        boolean k = canDrive(true, true);
        System.out.println(k);

        boolean l = canDrive(true, true, 19);
        System.out.println(l);

        boolean m = canDrive(true, true, 34);
        System.out.println(m);

        boolean j = isStoreOpen(11);
        System.out.println(j);

        boolean v = isStoreOpen(2, 'W');
        System.out.println(v);

        boolean b = isStoreOpen(9, 'S', true);
        System.out.println(b);
    }
    public static boolean gradeTestPassFail(double score) {
        boolean grade = score >= 70;
        return grade;
    }

    public static int gradeTestNumeric(int score) {
        if (score >= 90) {
            return 3;
        } else if (score >=50) {
            return 2;
        } else if (score >=25) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String gradeTestLetter(int grd) {
        if (grd >= 90){
            return "A";
        } else if (grd >= 80) {
            return "B";
        } else if (grd >= 70) {
            return "C";
        } else if (grd >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static boolean canDrive(boolean hasPermit, boolean withLicencedPassenger) {
        return hasPermit && withLicencedPassenger;

        }
    public static boolean canDrive(boolean hasPermite, boolean withLicencedPass, int passengerAge) {
        return hasPermite && withLicencedPass && passengerAge >= 21;
    }
    public static boolean canDrive(boolean hasPer, boolean withLicen, boolean isGuardian, int passAgge) {
        return hasPer && withLicen && isGuardian && passAgge >= 21;
    }
    public static boolean isStoreOpen(int currentHour) {
        return currentHour >= 5 && currentHour <= 17;
    }
    public static boolean isStoreOpen(int cuurentHr, char currentDay) {
        return cuurentHr >= 5 && cuurentHr <= 17 && currentDay == 'M' || currentDay == 'W' || currentDay == 'F';
    }
    public static boolean isStoreOpen(int currHr, char cueeDay, boolean IsSummer) {
        if (IsSummer && cueeDay == 'W') {
            return currHr >= 8 &&  currHr >=20;
        } else if (IsSummer && cueeDay == 'S') {
            return currHr >= 9 && currHr >= 15;
        } else {
           return currHr >= 5 && currHr <= 17 && cueeDay == 'M' || cueeDay == 'W' || cueeDay == 'F';
        }
        }
    }



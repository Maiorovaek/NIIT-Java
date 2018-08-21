package triangle;

public class Triangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    private double minLength, midLength, hepLength;
    public Triangle() {
    }
    public Triangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        getMinMax();
    }



    public double getPerimetr(){
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }
    private static double min(double a, double b) {
        if (a < b)
            return a;
        else
            return b;

    }

    private static double max(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public void getMinMax(){
        minLength = min(min(v1.distance(v2),v2.distance(v3)),v3.distance(v1));

        midLength = min(max(v1.distance(v2),v2.distance(v3)),v3.distance(v1));

        hepLength = max(max(v1.distance(v2),v2.distance(v3)),v3.distance(v1));
    }

    public TriangleTypes getTrianleType(){

        //todo
        //try to use switch case statement
        int choise = 0;
        getMinMax();


        if (Math.pow(hepLength,2) == Math.pow(midLength,2)+ Math.pow(minLength,2))
            choise = 1;
        else if(Math.pow(hepLength,2) < Math.pow(midLength,2)+ Math.pow(minLength,2)){
            choise = 2;
        } else if(Math.pow(hepLength,2) > Math.pow(midLength,2)+ Math.pow(minLength,2)) {
            choise = 3;

        }

        if (hepLength == 0 | midLength == 0 | minLength == 0 ) {
            return TriangleTypes.DOESNOTEXIST;
        }
        switch (choise){
            case 1 : return TriangleTypes.ISOSCALES;
            case 2 : return TriangleTypes.EQUILATERAL;
            case 3 : return TriangleTypes.SCALEE;
            default: return TriangleTypes.DOESNOTEXIST;

        }
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "v1=" + v1 +
                ", v2=" + v2 +
                ", v3=" + v3 + "\n" +
                "minLength=" + minLength +
                ", midLength=" + midLength +
                ", maxLength=" + hepLength +
                '}';
    }
}


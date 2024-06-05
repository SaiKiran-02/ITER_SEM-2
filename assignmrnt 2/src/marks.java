import javax.crypto.spec.PSource;

abstract class marks {
    int icpMarks , dsaMarks ;
    double percentage;
    abstract double getPercentage();


}

class CSE extends marks{
    int algoDesign;

    public CSE(int icp, int dsa , int algo){
        this.icpMarks = icp;
        this.dsaMarks = dsa;
        this.algoDesign = algo;
    }

    public double getPercentage(){
        return 1;
    }
}

class NONCSE extends marks{
    int engMech;
    public NONCSE(int icp, int dsa , int mech){
        this.icpMarks = icp;
        this.dsaMarks = dsa;
        this.engMech = mech;
    }
    public double getPercentage(){
        return 2;
    }
}

class college{
    public static void main(String[] args) {
        CSE s1 = new CSE(53,62,90);
        NONCSE s2 = new NONCSE(62,52,53);

        s1.getPercentage();
        s2.getPercentage();
    }


}
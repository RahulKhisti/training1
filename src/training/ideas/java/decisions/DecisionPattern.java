package training.ideas.java.decisions;

/**
 * Created by idnrkh on 9/9/2014.
 */
public class DecisionPattern {
    private String fpLos;
    private int minLos;

    public DecisionPattern(String fpLos, int minLos) {
        this.fpLos = fpLos;
        this.minLos = minLos;
    }

    public String getFpLos() {
        return fpLos;
    }

    public int getMinLos() {
        return minLos;
    }

    public void setFpLos(String fpLos) {
        this.fpLos = fpLos;
    }

    public void setMinLos(int minLos) {
        this.minLos = minLos;
    }

    public boolean equals(Object o){
        if(this==o)return true;
        if(o instanceof DecisionPattern){
            return (
                    (
                    (((DecisionPattern) o).getFpLos()==null && this.fpLos==null)
                    ||
                    ((DecisionPattern) o).getFpLos().equals(this.fpLos)
                )
                    &&
                    ((DecisionPattern) o).getMinLos()==this.minLos)?
                    true:false;
        }
        else return false;


    }
}

package sk.uniza.fri;

/**
 * 23. 11. 2021 - 14:37
 *
 * @author Adam
 */
public class Stavy {
    private final int[][] stavy;
    private String farbaSemaforu = "zelená";
    private int stav = 0;


    public Stavy() {
        this.stavy = new int[][]{{0, 0, 0, 1}, {1, 2, 0, 1}, {1, 2, 2, 3}, {3, 3, 2, 3}};
    }

    public boolean zmenaStavuASemaforu(String ab) {
        switch (ab) {
            case "0,0":
                this.stav = this.stavy[this.stav][0];
                return true;
            case "1,0":
                this.stav = this.stavy[this.stav][1];
                return true;
            case "1,1":
                this.stav = this.stavy[this.stav][2];
                return true;
            case "0,1":
                this.stav = this.stavy[this.stav][3];
                return true;
            default:
                return false;
        }
    }

    public void zmenFarbuSemaforu() {
        if (this.stav < 2) {
            this.farbaSemaforu = "zelená";
        } else {
            this.farbaSemaforu = "červená";
        }
    }

    public String getFarbaSemaforu() {
        return this.farbaSemaforu;
    }

    public int getStav() {
        return this.stav;
    }
}

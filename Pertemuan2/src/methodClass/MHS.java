/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package methodClass;

/**
 *
 * @author fadil
 */
public class MHS {
    private String nim, nama;
    private float nilakhir;
    private String grade;
    private float uts, uas;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(float uas) {
        this.uas = uas;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(float uts) {
        this.uts = uts;
    }

    void setUts(double nuts) {
    }

    void setUas(double nuas) {
    }

    public double getNilAkhir() {
        nilakhir = (uts + uas) / 2;
        return nilakhir;
    }

    public String getGrade() {
        if (nilakhir < 50) {
            grade = "E";
        } else if (nilakhir < 60) {
            grade = "D";
        } else if (nilakhir < 70) {
            grade = "C";
        } else if (nilakhir < 80) {
            grade = "B";
        } else {
            grade = "A";
        }

        return grade;
    }
}


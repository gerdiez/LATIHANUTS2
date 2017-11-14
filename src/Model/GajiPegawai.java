/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class GajiPegawai {
    private String nama, alamat;
    private int uangtransport, uangtunjangan, gajipokok, totalgaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangtransport() {
        return uangtransport;
    }

    public void setUangtransport(int uangtransport) {
        this.uangtransport = uangtransport;
    }

    public int getUangtunjangan() {
        return uangtunjangan;
    }

    public void setUangtunjangan(int uangtunjangan) {
        this.uangtunjangan = uangtunjangan;
    }

    public int getGajipokok() {
        return gajipokok;
    }

    public void setGajipokok(int gajipokok) {
        this.gajipokok = gajipokok;
    }
    
    public int totalgaji(int uangtunjangan, int gajipokok,int uangtransport){
       totalgaji=uangtunjangan+gajipokok+uangtransport;
        return totalgaji;
    }
    
    
}

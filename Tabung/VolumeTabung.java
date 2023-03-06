/*
 Nama : Aditya Eka Pradana
 NIM : A11.2021.13694
 Kelas : A11.4405
 Project : Menghitung Volume Tabung Yang berdiameter 5cm dan tinggi 10cm
 */
package Tabung;

public class VolumeTabung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double v,r,d = 5,t = 10,phi= 3.14;
		r= d / 2;
		v = (phi * r * r)*t;
		System.out.print("Volume dari Taung yanag mempunyai diameter 5cm dan tinggi 10cm yaitu : "
				+v+"cm");
		

	}

}

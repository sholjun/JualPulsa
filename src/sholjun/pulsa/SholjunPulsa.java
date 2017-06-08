/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sholjun.pulsa;

import java.util.Scanner;

/**
 *
 * @author sholjun
 */
public class SholjunPulsa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner input = new Scanner(System.in);
        jualpulsa objek = new jualpulsa();
        queryQu query = new queryQu();
        
        int pilihan;
        long id;
        String next,saldo,namane,nohp;
        
        
        
        
        next="ya";
        do{
        System.out.println("Selamat datang di SHOLJUN PULSA");
        System.out.println("===============================");
        System.out.print("Pilihan : \n 1. Isi Ulang "
                + "\n 2. History Transaksi "
                + "\n 3. Info Akun "
                + "\n 4. Daftar Agen"
                + "\n 5. Rubah data"
                + "\n 6. Hapus data"
                + "\n 7. Balik"
                + "\n\n Masukan pilihan :");
        
        pilihan = input.nextInt();
        switch (pilihan){
            case 1:
                break;
            case 2:
                break;
            case 3:
                query.Show();
                break;
            case 4:
                input.nextLine();
                System.out.print("Nama :"); 
                namane = input.nextLine();
                objek.setNama(namane);
                System.out.print("No HP :");
                nohp = input.nextLine();
                objek.setNo_hp(nohp);
                System.out.print("Masukan Jumlah Saldo :");
                saldo = input.nextLine();
                objek.setSaldo(saldo);
                query.Add(objek);
                break;
            case 5:
                input.nextLine();
                System.out.print("Nama :");namane = input.nextLine();
                System.out.print("No HP :");nohp = input.nextLine();
                System.out.print("ID :");id=input.nextLong();
                query.update(id,namane,nohp);
                query.Show();
                break;
            case 6:
                System.out.print("ID :");id=input.nextLong();
                query.hapus(id);
                query.Show();
                break;
            case 7:
                default:System.exit(0);
      
                break;
            
                
               
        }
         }while(next.equals("ya"));
    }
         
    
}

package w13_guiATM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author arrenbryan
 */
public interface ICsvParse extends IConfig {
    
    public static final String NEW_LINE_SEPARATOR = "\n";
    
    public static void serializeTransaction(Account accountPengirim,
            Account accountPenerima, String jumlahNominal) {
        try {
            // Constructor yang dipanggil memiliki 2 parameter yaitu nama path
            // file yang mengarah ke file yang ingin dibaca (bertipe String)
            // dan boolean true jika ingin melakukan append BUKAN write ulang.
            FileOutputStream fos = new FileOutputStream(FILEPATHCSV, true);
            
            // Method write digunakan untuk menambahkan bytes ke file yang
            // sudah ditentukan. Dikarenakan pada constructor menambahkan
            // parameter true maka cursor di file akan langsung
            // mulai dari "end file" bukan dari baris pertama / awal kalimat
            // seperti "append".
            fos.write(accountPengirim.getAccountNumber().getBytes());
            fos.write(COMMA_DELIMITER.getBytes());
            fos.write(accountPengirim.getAccountName().getBytes());
            fos.write(COMMA_DELIMITER.getBytes());
            fos.write(accountPenerima.getAccountNumber().getBytes());
            fos.write(COMMA_DELIMITER.getBytes());
            fos.write(accountPenerima.getAccountName().getBytes());
            fos.write(COMMA_DELIMITER.getBytes());
            fos.write(jumlahNominal.getBytes());
            fos.write(NEW_LINE_SEPARATOR.getBytes());
            
            // Method close digunakan untuk menutup streams/aliran dari program
            // ke file. Untuk InputStreams, sebenarnya tidak apa-apa jika tidak
            // ditutup, tapi tidak untuk OutputStreams.
            fos.close();
            
        } catch (IOException ex) {
            ex.getMessage();
        }
    }

    public static ArrayList<String> deserializeTransaction() {
        try {
            // Constructor yang dipanggil memiliki parameter yaitu nama path
            // file yang mengarah ke file yang ingin dibaca (bertipe String).
            FileInputStream fis = new FileInputStream(FILEPATHCSV);
            
            // Constructor yang dipanggil memiliki parameter yaitu file yang
            // sudah disimpan di variabel sebelumnya. Parameter ini bertipe
            // FILE/INPUTSTREAM. Oleh karena itu, sebelumnya dapat menggunakan
            // FileInputStream untuk membaca file karena sudah mengextends
            // INPUTSTREAM class
            Scanner in = new Scanner(fis);
            String[] values = null;
            ArrayList<String> historyTransaction = new ArrayList<>();
            
            // First line dari file tidak akan dibaca karena berupa judul kolom.
            // Method readLine digunakan untuk membaca 1 line dari text sampai
            // delimiter ditemukan. Karena saya menggunakan CSV maka akan ada
            // delimiter untuk memisahkan data demi data.
            String line = in.nextLine();
            System.out.println(line);
            
            while (in.hasNext()) {
                line = in.nextLine();
                
                // Karena akan dipisah data demi data yang sudah dibatas oleh
                // delimiter sebelumnya maka nilai dari 1 line akan menjadi
                // lebih dari 1 nilai. Oleh karena itu, saya menyimpannya di
                // array bertipe string.
                values = line.split(COMMA_DELIMITER);
                
                String res = "  ==================================\n";
                res += "  No. Rekening Pengirim = " + values[0] + "\n";
                res += "  Nama Pengirim = " + values[1] + "\n";
                res += "  No. Rekening Penerima = " + values[2] + "\n";
                res += "  Nama Penerima = " + values[3] + "\n";
                res += "  Nominal Transaksi = " + values[4] + "\n";
                
                historyTransaction.add(res);
            }
            
            // Method close pada FileInputStream digunakan untuk menutup
            // streams/aliran dari program ke file. Untuk OutputStreams, jika 
            // tidak ditutup maka ada kemungkinan bahwa dapat kehilangan data 
            // yang di-buffer. Oleh karena itu, OutputStreams harus ditutup 
            // sebelum keluar dari program.
            fis.close();
            
            // Method close pada Scanner digunakan untuk mencegah kebocoran
            // sumber daya.
            in.close();
            
            return historyTransaction;
            
        } catch (IOException ex) {
            ex.getMessage();
        }
        
        return null;
    }
}

package w13_guiATM;

/**
 *
 * @author arrenbryan
 */
public interface IConfig {

    public static final String FILEPATHJSON = "/home/arrenbryan/Documents/Project/Programming/Java/Tugas/src/w13_guiATM/account.json";
    public static final String FILEPATHCSV = "/home/arrenbryan/Documents/Project/Programming/Java/Tugas/src/w13_guiATM/transactions.csv";
    public static final String COMMA_DELIMITER = ",";
    public static final int LIMITNOMORREKENING = 10;
    public static final int LIMITNOMORREKENINGBANKLAIN = 13;
    public static final int LIMITPIN = 6;
    public static final int SALDOMINIMALATM = 50_000;
    public static final int LIMITJUMLAHPENARIKAN = 1_250_000;
    public static final int LIMITJUMLAHTRANSFER = 250_000_000;
}

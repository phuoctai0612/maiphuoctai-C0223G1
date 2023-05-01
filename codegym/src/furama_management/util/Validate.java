package furama_management.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;

public class Validate {
    private final String PATTERNIDEMPLOYEE = "^(NV-)\\d{4}$";
    private final String PATTERNIDCUSTOMER = "^(KH-)\\d{4}$";
    private final String PATTERNNAME = "^([A-Z]{1}[a-z]{1,}\\s)+([A-Z]{1}[a-z]{1,}){1}$";
    private final String PATTERNDAYOFBIRTH = "^([2]{1}[0]{1}[0-1]\\d-||[2]{1}[0]{1}[2]{1}[0-3]{1}-)([0]{1}\\d-|[1]\\d-|[2]\\d-)([0-2]{1}\\d{1}|[3]{1}[0-1]{1})$";
    private final String PATTERNCMND = "^(\\d{9}|\\d{12})$";
    private final String PATTERNNUMBERPHONE = "^0\\d{9}$";
    private final String PATTERNHOUSE = "^(HO-)\\d{4}$";
    private final String PATTERNROOM = "^(RO-)\\d{4}$";
    private final String PATTERNVILLA = "^(VL-)\\d{4}$";
    private final String PATTERNTENDICHVU="^([A-Z][a-z]{1,})$";
    public boolean regexIdEmployee(String id) {
        return Pattern.matches(PATTERNIDEMPLOYEE, id);
    }

    public boolean regexName(String name) {
        return Pattern.matches(PATTERNNAME, name);
    }

    public boolean regexDayOfBirth(String dayOfbirth) {
        return Pattern.matches(PATTERNDAYOFBIRTH, dayOfbirth);
    }

    public boolean regexCMND(String CMND) {
        return Pattern.matches(PATTERNCMND, CMND);
    }

    public boolean regexNumberPhone(String number) {
        return Pattern.matches(PATTERNNUMBERPHONE, number);
    }

    public boolean regexIdCustomer(String id) {
        return Pattern.matches(PATTERNIDCUSTOMER, id);
    }
   public boolean regexTenDichVu(String id) {
        return Pattern.matches(PATTERNTENDICHVU, id);
    }

    public boolean regexIdHouse(String id) {
        return Pattern.matches(PATTERNHOUSE, id);
    }

    public boolean regexIdRoom(String id) {
        return Pattern.matches(PATTERNROOM, id);
    }

    public boolean regexIdVilla(String id) {
        return Pattern.matches(PATTERNVILLA, id);
    }

    public int checkAge(LocalDate dayOfBirth) {
        LocalDate localDate = LocalDate.now();
        if (dayOfBirth != null) {
            return Period.between(dayOfBirth, localDate).getYears();
        }
        return -1;
    }
}

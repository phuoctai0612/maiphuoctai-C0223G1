package furama_management.util;

import java.util.regex.Pattern;

public class Validate {
    private final String PATTERNIDEMPLOYEE = "^(NV-)\\d{4}$";
    private final String PATTERNIDCUSTOMER = "^(KH-)\\d{4}$";
    private final String PATTERNNAME = "^([A-Z]{1}[a-z]{1,}\\s)+([A-Z]{1}[a-z]{1,}){1}$";
    private final String PATTERNDAYOFBIRTH = "^([0-2]{1}\\d{1}-|[3]{1}[0-1]{1}-)([0]{1}\\d-|[1]\\d-|[2]\\d-)([2]{1}[0]{1}[0-1]\\d||[2]{1}[0]{1}[2]{1}[0-3]{1})$";
    private final String PATERNCMND = "^(\\d{9}|\\d{12})$";
    private final String PATERNNUMBERPHONE = "^([0]{1}\\d{9})$";

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
        return Pattern.matches(PATERNCMND, CMND);
    }

    public boolean regexNumberPhone(String number) {
        return Pattern.matches(PATERNNUMBERPHONE, number);
    }

    public boolean regexIdCustomer(String id) {
        return Pattern.matches(PATTERNIDCUSTOMER, id);
    }
}

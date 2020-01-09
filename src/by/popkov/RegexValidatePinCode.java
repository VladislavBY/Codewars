package by.popkov;

//ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
//
//        If the function is passed a valid PIN string, return true, else return false.
//
//        eg:
//
//        Solution.validatePin("1234") === true
//        Solution.validatePin("12345") === false
//        Solution.validatePin("a234") === false

public class RegexValidatePinCode {
    public static boolean validatePin(String pin) {
        if (!(pin.length() == 4 || pin.length() == 6)) {
            return false;
        } else {
            char[] chPin = pin.toCharArray();
            for (char c : chPin) {
                switch (c) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        break;
                    default:
                        return false;
                }
            }
        }

        return true;
    }
}

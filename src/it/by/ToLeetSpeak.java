package it.by;

public class ToLeetSpeak {
    static String toLeetSpeak(final String speak) {
        byte[] str = speak.getBytes();
        StringBuilder outPut = new StringBuilder();
        for (byte b : str) {
            switch (b) {

                case 65:
                    outPut.append('@');
                    break;
                case 66:
                    outPut.append('8');
                    break;
                case 67:
                    outPut.append('(');
                    break;
                case 68:
                    outPut.append('D');
                    break;
                case 69:
                    outPut.append('3');
                    break;
                case 70:
                    outPut.append('F');
                    break;
                case 71:
                    outPut.append('6');
                    break;
                case 72:
                    outPut.append('#');
                    break;
                case 73:
                    outPut.append('!');
                    break;
                case 74:
                    outPut.append('J');
                    break;
                case 75:
                    outPut.append('K');
                    break;
                case 76:
                    outPut.append('1');
                    break;
                case 77:
                    outPut.append('M');
                    break;
                case 78:
                    outPut.append('N');
                    break;
                case 79:
                    outPut.append('0');
                    break;
                case 80:
                    outPut.append('P');
                    break;
                case 81:
                    outPut.append('Q');
                    break;
                case 82:
                    outPut.append('R');
                    break;
                case 83:
                    outPut.append('$');
                    break;
                case 84:
                    outPut.append('7');
                    break;
                case 85:
                    outPut.append('U');
                    break;
                case 86:
                    outPut.append('V');
                    break;
                case 87:
                    outPut.append('W');
                    break;
                case 88:
                    outPut.append('X');
                    break;
                case 89:
                    outPut.append('Y');
                    break;
                case 90:
                    outPut.append('2');
                    break;
                case 32:
                    outPut.append(" ");
                    break;
                default:
                    continue;

            }

        }
        return outPut.toString();
    }

}

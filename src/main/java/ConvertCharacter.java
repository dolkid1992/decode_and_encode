public class ConvertCharacter {

    public static void main(String[] args) {
        ConvertCharacter convertCharacter = new ConvertCharacter();
        String converted = convertCharacter.decodeContent("ABCDEF", 13);
        System.out.println();
    }

    public String decodeContent(String s, int key) {

        int keyLeng = s.length();
        String newString = "";
        Character[] listS = new Character[keyLeng];

        Character[] newList = new Character[keyLeng];

        for (int i = 0; i < keyLeng; i++) {
            listS[i] = s.charAt(i);
        }

        for (int i = 0; i < keyLeng; i++) {

            if (i + key < keyLeng) {
                newList[(i + key)] = listS[i];

            } else {
                newList[(i + key)%keyLeng] = listS[i];
            }
        }
        for (int i = 0; i < keyLeng; i++) {
            newString = newString.concat(String.valueOf(newList[i]));
        }
        return newString;
    }
}

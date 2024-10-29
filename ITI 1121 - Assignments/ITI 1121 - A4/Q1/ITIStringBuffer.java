public class ITIStringBuffer {

    private SinglyLinkedList<String> stringList;

    public ITIStringBuffer() {
        stringList = new SinglyLinkedList<String>();
    }

    public ITIStringBuffer(String  firstString){
        stringList = new SinglyLinkedList<String>();
        append(firstString);
    }

    public void append(String nextString){
        stringList.add(nextString);
    }

    public String toString(){
        if (stringList.size() > 1) {
            char[] returnString = new char[stringList.size() * 10000];
            int i = 0;
            for (String string : stringList) {
                for (int j = 0; j < string.length(); j++) {
                    returnString[i] = string.charAt(j);
                    i++;
                }
                i++;
            }
            char[] return2 = new char[i - 1];
            int w = 0;
            for (int j = 0; j < return2.length; j++) {
                if (!(returnString[j] == '\0')) {
                    return2[w] = returnString[j];
                    w++;
                }
            }
            String newString = new String(return2);
            stringList = new SinglyLinkedList<String>();
            stringList.add(new String(newString));
        }
        return stringList.get(0);
    }
}

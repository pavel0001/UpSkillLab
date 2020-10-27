class Task2 {
    public static void main(String[] args) {
        String inputString = "acacacacanadat";
        System.out.println(inputString);
        String inputStringAfterChanges = addAfterEachAB(inputString);
        System.out.println("After changes");
        System.out.println(inputStringAfterChanges);

    }

    private static String addAfterEachAB(String inputString) {
        StringBuilder builder = new StringBuilder();
        char[] tmpString = inputString.toCharArray();
        for(int i = 0; i < tmpString.length; i++){
            builder.append(tmpString[i]);
            if(tmpString[i] == 'a'){
                builder.append('b');
            }
        }
        return  builder.toString();
    }
}
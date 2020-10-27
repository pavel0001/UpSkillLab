class Task5 {
    public static void main(String[] args) {
        String inputString = "bananaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        System.out.println(inputString);
        int result = findHowMuchA(inputString);
        System.out.println("How much 'a' has this string ? -> " + result);
    }

    private static int findHowMuchA(String input) {
        StringBuilder builder = new StringBuilder(input);
        int counter=0;
        for(int i = 0; i< builder.length(); i++){
            if(builder.charAt(i) == 'a') counter++;
        }
        return counter;
    }

}
class Solution {
    public String convertToTitle(int columnNumber) {
        char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String result = "";
        while(columnNumber > 26){
            columnNumber--;
            int lastLetter = columnNumber % 26;
            result = alphabets[lastLetter] + result;
            columnNumber = columnNumber / 26;
        }
        result = alphabets[columnNumber-1] + result;
        return result;
    }
}
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, (a, b) -> a.length() - b.length());
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < dictionary.size(); j++) {

                if (words[i].startsWith(dictionary.get(j))) {
                    words[i] = dictionary.get(j);
                    break;
                }

            }
        }
        return String.join(" ", words);
    }
}
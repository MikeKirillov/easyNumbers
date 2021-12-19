package HeadFirstJava.Chapter01;

public class PhraseOMatic {
    public static void main(String[] args) {
        // make three sets of words to choose from. Add your own!
        String[] firstWordsArr = {"24/7", "multi-tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
        String[] secondWordsArr = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "randed", "outside-the-box", "positioned", "networked", "focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] thirdWordsArr = {"process", "tipping-point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

        // find out how many words are in each list
        int firstLength = firstWordsArr.length;
        int secondLength = secondWordsArr.length;
        int thirdLength = thirdWordsArr.length;

        System.out.println(firstLength + " " + secondLength + " " + thirdLength);

        // generate three random numbers (take 3 random arrays indexes) within array range (length)
        int firstX = (int) (Math.random() * firstLength);
        int secondX = (int) (Math.random() * secondLength);
        int thirdX = (int) (Math.random() * thirdLength);

        System.out.println(firstX + " " + secondX + " " + thirdX);

        // alternative case of previous two
//        int firstX = (int) (Math.random() * firstWordsArr.length);
//        int secondX = (int) (Math.random() * firstWordsArr.length);
//        int thirdX = (int) (Math.random() * firstWordsArr.length);

        // now build (smoosh or concatenate) a phrase
        String phrase = firstWordsArr[firstX] + " " + secondWordsArr[secondX] + " " + thirdWordsArr[thirdX];

        // print out the phrase
        System.out.println("What we need is a " + phrase);
//        System.out.printf("What we need is a %s %s %s", firstWordsArr[firstX], secondWordsArr[secondX], thirdWordsArr[thirdX]);
    }
}

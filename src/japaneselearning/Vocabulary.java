package japaneselearning;

public abstract class Vocabulary {
    /**.*/
    private String romaji;
    /**.*/
    private String hiragana;
    /**.*/
    private String kanji;
    /**.*/
    private String english;
    /**.*/
    private String comments;
    /**.*/
    private int lesson;
    /**.*/
    private int key;
    /**.*/
    private static int keyGenerator = 0;

    /**
     * Superclass of all Japanese words.
     */
    public Vocabulary() {
        this.key = keyGenerator++;
    }

    // SETTERS AND GETTERS
    /** Getter for romaji.
     * @return the romaji
     */
    public String getRomaji() {
        return romaji;
    }
    /** Setter for romaji.
     * @param romajiArg the romaji to set
     */
    public void setRomaji(final String romajiArg) {
        this.romaji = romajiArg;
    }
    /** Getter for hiragana.
     * @return the hiragana
     */
    public String getHiragana() {
        return hiragana;
    }
    /** Setter for hiragana.
     * @param hiraganaArg the hiragana to set
     */
    public void setHiragana(final String hiraganaArg) {
        this.hiragana = hiraganaArg;
    }
    /** Getter for kanji.
     * @return the kanji
     */
    public String getKanji() {
        return kanji;
    }
    /** Setter for kanji.
     * @param kanjiArg the kanji to set
     */
    public void setKanji(final String kanjiArg) {
        this.kanji = kanjiArg;
    }
    /** Getter for english.
     * @return the english
     */
    public String getEnglish() {
        return english;
    }
    /** Setter for english.
     * @param englishArg the english to set
     */
    public void setEnglish(final String englishArg) {
        this.english = englishArg;
    }
    /** Getter for comments.
     * @return the comments
     */
    public String getComments() {
        return comments;
    }
    /** Setter for comments.
     * @param commentsArg the comments to set
     */
    public void setComments(final String commentsArg) {
        this.comments = commentsArg;
    }
    /** Getter for lesson number.
     * @return the lesson
     */
    public int getLesson() {
        return lesson;
    }
    /** Setter for lesson number.
     * @param lessonArg the lesson to set
     */
    public void setLesson(final int lessonArg) {
        this.lesson = lessonArg;
    }
    /** Getter for the key.
     * @return the key
     */
    public int getKey() {
        return key;
    }
    /** Setter for the key.
     * @param keyArg the key to set
     */
    public void setKey(final int keyArg) {
        this.key = keyArg;
    }


    /**
     * Test zone.
     * @param args
     */
    public static void main(final String[] args) {
        // TODO Auto-generated method stub

    }

}

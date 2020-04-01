
package pmfinal;

/**
 *
 * @author JohnV
 */
public class Cards {
    private int id;
    private String word;
    private String def;

    public Cards() {
    }

    public Cards(int id, String word, String def) {
        this.id = id;
        this.word = word;
        this.def = def;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getDef() {
        return def;
    }

    public void setDef(String def) {
        this.def = def;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

package reader;

public class Author {
    String name;
    int birthYear;

    public Author (String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    /**
     * If unknown year of birth
     * @param name
     */
    public Author (String name){
        this.name = name;
        this.birthYear = -1;
    }

    @Override
    public String toString(){
        return name;
    }
}

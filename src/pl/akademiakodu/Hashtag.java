package pl.akademiakodu;

// extends Object
public class Hashtag {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hashtag(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Hashtag(String name) {
        this.name = name;
    }

    // @Override informacja dla kompilatora
    // i innego programisty, że nadpisujemy metodę toString
    // z klasy po której dziedziczymy czyli Object
    @Override
    public String toString(){
        return "#"+getName();
    }

    public static void main(String[] args) {
        Hashtag hashtag = new Hashtag(1,"polishboy");
        System.out.println(hashtag);
        String name = "Michał";
        String name2 = "Anna";
        System.out.println(name.equals(name2));
        Hashtag hashtag1 = new Hashtag(2,"programowanie");
        // hashtag.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hashtag)) return false;

        Hashtag hashtag = (Hashtag) o;

        if (getId() != hashtag.getId()) return false;
        return getName() != null ? getName().equals(hashtag.getName()) : hashtag.getName() == null;
    }

    // hashCode standardowo i equals występuje w Object
    // my nadpisujemy te metody

    // funkcja matematyczna
    // hashCode działa szybciej niż equals

    // jeśli 2 obiekty mają różny hashCode to wiemy na 100 %, że obiekty są różne
    // nie jest wywoływane do porównania equals
    // standrodowo hashCode i equals używają kolekcje
    // generować w intellJ te metody
    // jeśli 2 obiekty mają ten sam hashCode to na 100 % nie wiemy czy są równe
    // i dopiero wywołanie equals mówi nam na 100 % czy obiekty są równe

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }
}

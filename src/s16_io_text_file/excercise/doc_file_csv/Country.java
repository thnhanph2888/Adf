package excercise.doc_file_csv;

public class Country {
    private String id;
    private String code;
    private String name;

    public Country() {
    }

    public Country(String id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData(){
        return this.getId() + "," + this.getName() + "," + this.getCode() + "\n";
    }
}

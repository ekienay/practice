package model;

public class Member extends User {

    private String spec;


    public Member(){

    }

    public Member(String name, String spec){
        super.setName(name);
        this.spec = spec;
    }

    public void setSpec(String spec){
        this.spec = spec;
    }

    public String getSpec(){
        return spec;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        return "Member: " + "\n" +
                "spec - " + spec + "\n" +
                "name - " + super.getName() + "\n";
    }
}

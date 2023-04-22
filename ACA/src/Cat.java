public class Cat {
    String color;
    String name;
    boolean bool;

    Cat(){
        name = "Cat";
        color = "black";
    }

    private String catName;

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getCatName() {
        return catName;
    }

    public static void getCatName2() {
        System.out.println("cat name is asdasd");
    }
}



class demo
{
    int a = 10;
    int b = 20;
//    demo()
//    {
//        a = 10;
//        b = 20;
//    }
    public void print()
    {
        System.out.println ("a = " + a + " b = " + b );
    }
}
class ThirdLesson {
    public static void main(String[] args) {

//        Cat cat = new Cat();
//        cat.color = "red";
//        cat.name = "caty";
//        cat.setCatName("new caty");
//        System.out.println(cat.bool);

        demo de = new demo();
        de.a += 1;
        de.b += 1;
        System.out.println(de.a + de.b);
    }
    //public static String increment (String name, int num){
        //return name + num;
   // }



}



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pryamoygolnik a1 = new Pryamoygolnik(10, 10);
        Pryamoygolnik a2 = new Pryamoygolnik(14, 13);
        Treugolnik b1 = new Treugolnik(12,14,15);
        Treugolnik b2 = new Treugolnik(12,14,15);
        Okruhnost c1 = new Okruhnost(23);
        Okruhnost c2 = new Okruhnost(45);
        System.out.println(Figura.sravnenie(a1,a2));
        System.out.println(Figura.sravnenie(b1,b2));
        System.out.println(Figura.sravnenie(c1,c2));
    }
}

 class Okruhnost extends Figura{
double radius;
    public Okruhnost(double radius) {
        this.radius = radius;
    }
    public double area(){
            return Math.PI * (2 * radius);
        }

    }
  class Pryamoygolnik extends Figura   {
         double dlina; double shirina;
     public Pryamoygolnik (double dlina, double shirina) {
         this.dlina = dlina;
         this.shirina = shirina;
     }


     public double area(){
            return dlina*shirina;
        }


    }
   class Treugolnik extends Figura {

     double ab; double bc; double cd;

         public Treugolnik(double ab, double bc, double cd) {
             this.ab = ab;
             this.bc = bc;
             this.cd = cd;
         }

         @Override
         public double area() {
             return ab*bc*cd/2;
         }
     }





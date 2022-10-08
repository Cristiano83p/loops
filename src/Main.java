public class Main {

    public static void main(String[] args) {
String [] consoante = new String []{"b","c","d","f"};
String [] vogal =new String[] {"a","e","i","o"};
String [] consoante2 = new String[] {"s","s","s","s"};
     for (int i=0; i < consoante.length;i++) {

         for (int j=0; j < vogal.length; j++) {

                 for (int l = 0; l < consoante2.length; l++) {
                     String silaba = consoante[i] + vogal[j] + consoante2 [l];
                     System.out.println(silaba);}
                 }
             }

     }




        }

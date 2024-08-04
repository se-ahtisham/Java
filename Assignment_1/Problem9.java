public class Problem9
{
public static void main(String [] args)
{

double Total = 80000;
double totalMen = (52.0 / 100) * Total;
double totalWomen = (48.0 / 100) * Total;


System.out.println(" Total Population is 100% " + Total );
System.out.println(" Total Men are " + totalMen );
System.out.println(" Total Women are " + totalWomen);




double literacyRate = 48.0;
double literateMen = (35.0 / 100)* literacyRate;
double literateWoen = (13.0 / 100)* literacyRate;


System.out.println(" Total Literacy is 48% ");
System.out.println(" Total Literate Men are: " + literateMen);
System.out.println(" Total Literate Women is: " +literateWoen );


double illiteracyRate = Total-literacyRate;
double illiterateMen = totalMen-literateMen;
double illiterateWoen = totalWomen-literateWoen;


double illiterateMenPercentage = (illiterateMen / totalMen) * 100;
double illiterateWomenPercentage = (illiterateWoen / totalWomen) * 100;

System.out.println("Percentage of Illiterate Men: " + illiterateMenPercentage);

System.out.println("Percentage of Illiterate Women: " + illiterateWomenPercentage);


}
}
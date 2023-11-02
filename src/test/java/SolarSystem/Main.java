package SolarSystem;

public class Main {
    public static void main(String[] args) {
        SolarSystemBasics Solar=new SolarSystemBasics();
        Solar.Sun="1";
        Solar.Moon="2";
        Solar.Stars="3";
        Solar.Planets="4";


        // We Create  a Class From FeatureSun Class//
        FeatureSun Sun=new FeatureSun();
        Sun.Name="Hasib";
        Sun.Tem="20";
        Sun.Color="Blue";


        FeatureMoon Moon=new FeatureMoon();
        Moon.Name="Hasib";
        Moon.Tem="25";
        Moon.Color="Black";

    }
}

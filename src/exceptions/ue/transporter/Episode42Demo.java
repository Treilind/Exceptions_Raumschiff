package exceptions.ue.transporter;

public class Episode42Demo {

    public static void main(String[] args) {
        Transporter transporter = new Transporter();
        Starship starship = new Starship("Enterprise", transporter);

        /*try {
            transporter.beam("Thorsten", "Mars", "Erde", true);
        } catch (TransporterMalfunctionException e) {
            e.printStackTrace();
        }*/

        starship.beamUp("Captain Kirk", "Riga IV");
    }
}

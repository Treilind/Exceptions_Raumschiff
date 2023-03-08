package exceptions.ue.transporter;

public class Transporter {

    public void beam(String person, String from, String to, boolean urgent) throws TransporterMalfunctionException {
        double random = Math.random();

        if(urgent && random < 0.5) {
            throw new TransporterMalfunctionException("Malfunction erkannt");
        } else {
            System.out.println(person + " wurde erfolgreich von " + from + " nach " + to + " gebeamt");
        }


    }

    public void shutdown(){
        System.out.println("System wird heruntergefahren!");
    }
}

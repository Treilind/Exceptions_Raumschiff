package exceptions.ue.transporter;

import java.util.Objects;

public class Starship {

    private String name;
    private Transporter transporter;

    public Starship(String name, Transporter transporter) {
        this.name = name;
        this.transporter = transporter;
    }

    public String getName() {
        return name;
    }

    public Transporter getTransporter() {
        return transporter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Starship starship = (Starship) o;
        return Objects.equals(name, starship.name) && Objects.equals(transporter, starship.transporter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, transporter);
    }

    @Override
    public String toString() {
        return "Starship{" +
                "name='" + name + '\'' +
                ", transporter=" + transporter +
                '}';
    }

    public void beamUp(String person, String from) {
        try {
            transporter.beam(person, from, this.name, true);
        } catch (TransporterMalfunctionException e) {
            e.printStackTrace();
        } finally {
            transporter.shutdown();
        }
    }
}

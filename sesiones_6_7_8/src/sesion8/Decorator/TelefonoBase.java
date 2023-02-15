package sesion8.Decorator;

public class TelefonoBase extends TelefonoDecorator {
    public TelefonoBase(Telefono telefono) {
        super(telefono);
    }
    @Override
    public void crear() {
        super.crear();
        System.out.println("Soy un teléfono basico. Mis carácteristicas son: ");

        this.tengoGSM();
        this.tengoSMS();
    }

    private void tengoGSM() {
        System.out.println("  -> Red 2G/3G");
    }

    private void tengoSMS() {
        System.out.println("  -> SMS/MMS");
    }
}

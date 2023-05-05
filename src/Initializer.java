import enums.BrandType;
import enums.OsType;
import process.AbstractPhoneFactory;
import process.OsFactory;
import process.Phone;

public class Initializer {
    public static void main(String[] args) {
        OsFactory osFactory = AbstractPhoneFactory.getFactory(OsType.ANDROID);
        Phone phone = osFactory.build(BrandType.HTC);
        phone.print();

        Phone phone1 = AbstractPhoneFactory.getFactory(OsType.IOS).build(BrandType.APPLE);
        phone1.print();
    }
}

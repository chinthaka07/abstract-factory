package process;

import enums.BrandType;
import process.products.ApplePhone;

public class IosFactory implements OsFactory{


    @Override
    public Phone build(BrandType brandType) {
        switch (brandType){
            case APPLE:return new ApplePhone();
            default:return null;
        }
    }
}

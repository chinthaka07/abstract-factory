package process;

import enums.BrandType;

public class IosFactory implements OsFactory{


    @Override
    public Phone build(BrandType brandType) {
        switch (brandType){
            case APPLE:return null;
            default:return null;
        }
    }
}

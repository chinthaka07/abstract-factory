package process;

import enums.BrandType;

public class AndroidFactory implements OsFactory{

    @Override
    public Phone build(BrandType brandType) {
        switch (brandType){
            case GOOGLE:return null;
            case HTC:return null;
            default:return null;
        }
    }
}

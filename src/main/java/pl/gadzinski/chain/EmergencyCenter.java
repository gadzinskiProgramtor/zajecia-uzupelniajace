package pl.gadzinski.chain;

import java.util.ArrayList;
import java.util.List;

public class EmergencyCenter {
    private List<ChainItem> items;

    public EmergencyCenter() {
        items=new ArrayList<>();
    }

    public EmergencyCenter(List<ChainItem> items) {
        this.items = items;
    }

    public void handlerRequewst(String value) {
        for(ChainItem item:items){
            if(item.test(value)){item.action(value);}
        }

    }
}

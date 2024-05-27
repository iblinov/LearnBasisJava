package by.bsu2.optional;

public interface Validator {
    static boolean checkItemParameter(Long itemId, String name, float price) {
        boolean flag = false;
        if(itemId != null && itemId>0 && name !=null && price > 0.0) {
            flag = true;
        }
        return flag;
    }
}

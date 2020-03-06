package maven.collections;

import java.util.Arrays;

public class ListCollections<LC> {
    private int len = 0;
    private static final int DEFAULT_SIZE = 10;
    private Object ele[];
    public ListCollections() {
        ele = new Object[DEFAULT_SIZE];
    }
    public void add(LC lc) {
        if (len == ele.length) {
            increaseSize();
        }
        ele[len++] = lc;
    }
    private void increaseSize() {
        int newlen = ele.length * 2;
        ele = Arrays.copyOf(ele, newlen);
    }
    
    @SuppressWarnings("unchecked")
    public LC get(int c) {
        if (c >= len || c < 0) {
            throw new IndexOutOfBoundsException("Index: " + c + ", Length " + c);
        }
        return (LC) ele[c];
    }
     
    @SuppressWarnings("unchecked")
    public LC remove(int c) {
        if (c >= len || c < 0) {
            throw new IndexOutOfBoundsException("Index: " + c + ", Length " + c);
        }
        Object val = ele[c];
        int numcl = ele.length - (c + 1) ;
        System.arraycopy(ele, c + 1, ele, c, numcl) ;
        len--;
        return (LC) val;
    }
     
    public int length() {
        return len;
    }
     
    @Override
    public String toString() 
    {
         StringBuilder sb = new StringBuilder();
         sb.append('[');
         for(int i = 0; i < len ;i++) {
             sb.append(ele[i].toString());
             if(i<len-1){
                 sb.append(",");
             }
         }
         sb.append(']');
         return sb.toString();
    }
    
}
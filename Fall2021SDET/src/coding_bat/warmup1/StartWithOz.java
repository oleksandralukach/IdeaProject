package coding_bat.warmup1;

/**
 *
 Given a string, return a string
 made of the first 2 chars (if present),
 however include first char only if it is 'o'
 and include the second only if it is 'z',
 so "ozymandias" yields "oz".

 startOz("ozymandias") → "oz"
 startOz("bzoo") → "z"
 startOz("oxx") → "o"
 */
public class StartWithOz {
    public static void main(String[] args) {

    }
    public String startOz(String str) {
        if(str.length()<2){
            return str;}

        if(str.charAt(0) == 'o' && str.charAt(1) == 'z')
            return "oz";
        if(str.charAt(0) == 'o')
            return "o";
        if(str.charAt(1) == 'z')
            return "z";

        return "";
    }
}


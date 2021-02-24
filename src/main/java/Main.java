import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
//        This program uses the java strings replace method from the stringutils class
    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        List<String> master = new ArrayList<>();
        master.add("Mango");
        master.add("Apple_rail");
        master.add("cuscar_Banana_rail");
        master.add("Grapes");

        String target = "_rail";
        String replacement = "";

        if(StringUtils.endsWithIgnoreCase(String.valueOf(master),"_rail"));
        {
            String amendedFilter = StringUtils.replace(String.valueOf(master), target, replacement);
            builder.append("FILTERS : ").append(amendedFilter).append(("\r"));
        }
        System.out.println(builder);

    }

}

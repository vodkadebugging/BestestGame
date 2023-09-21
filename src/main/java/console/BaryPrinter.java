package console;

import java.util.List;
import java.util.ArrayList;

import static console.Utils.printLine;
import static console.Utils.printLines;

import bary.*;

//
public class BaryPrinter {
    //
    public static void printBaryObjectInfo(BaryObject object, int level) {
        if (object instanceof BarySystem) {
            printSystemInfo((BarySystem) object, level);
            return;
        }
        if (object instanceof BaryBody) {
            printBodyInfo((BaryBody) object, level);
            return;
        }
        printLine(levelPrefix(level) + "Object class not recognized");
    }

    //
    public static void printBaryObjectInfo(BaryObject object) {
        printBaryObjectInfo(object, 0);
    }

    private static String levelPrefix(int level) {
        String singleLevelPrefix = "|- ";
        return singleLevelPrefix.repeat(level);
    }

    private static void printSystemInfo(BarySystem system, int level) {
        String levelPrefix = levelPrefix(level);
        printLines(new ArrayList<>() {{
            add(levelPrefix + "System: ");
            add(levelPrefix + "Mass: " + system.getMass());
            add(levelPrefix + "Radius: " + system.getRadius());
            add(levelPrefix + "Members: ");
        }});
        List<BaryObject> members = system.objects;
        for (BaryObject member : members) {
            printLine(levelPrefix(level + 1));
            printBaryObjectInfo(member, level + 1);
        }
    }

    private static void printBodyInfo(BaryBody body, int level) {
        String levelPrefix = levelPrefix(level);
        printLines(new ArrayList<>() {{
            add(levelPrefix + "Body: ");
            add(levelPrefix + "Mass: " + body.getMass());
            add(levelPrefix + "Radius: " + body.getRadius());
        }});
    }
}
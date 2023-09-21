package console;

import java.util.Objects;
import java.util.List;

import org.jetbrains.annotations.Nullable;

//
public class Utils {
    //
    public static void printLine(@Nullable String line) {
        System.out.println(Objects.requireNonNullElse(line, ""));
    }

    //
    public static void printLine() {
        printLine(null);
    }

    //
    public static void printLines(@Nullable List<@Nullable String> lines) {
        if (lines != null) {
            for (String line : lines) {
                printLine(line);
            }
        }
    }
}
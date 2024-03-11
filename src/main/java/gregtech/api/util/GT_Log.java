package gregtech.api.util;

import java.io.File;
import java.io.PrintStream;

/**
 * NEVER INCLUDE THIS FILE IN YOUR MOD!!!
 * <p/>
 * Just a simple Logging Function. If on Server, then this will point to System.out and System.err
 */
public class GT_Log {

    public static PrintStream out = System.out;
    public static PrintStream err = System.err;
    public static PrintStream ore = System.out;
    public static PrintStream pal = null;
    public static File mLogFile;
    public static File mOreDictLogFile;
    public static File mPlayerActivityLogFile;
}

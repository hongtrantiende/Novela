package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: did  reason: default package */
/* loaded from: classes.dex */
public abstract class did {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(km8 km8Var) {
        km8Var.getClass();
        String n = km8Var.n(StandardCharsets.UTF_8);
        if (n != null && n.startsWith("WEBVTT")) {
            return true;
        }
        return false;
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        String str2 = a2d.a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str3 : split[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str3);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            String trim = split[1].trim();
            if (trim.length() == 3) {
                j2 += Long.parseLong(trim);
            } else {
                vs.m("Expected 3 decimal places, got: ".concat(trim));
                return 0L;
            }
        }
        return j2 * 1000;
    }

    public static void d(km8 km8Var) {
        int i = km8Var.b;
        if (a(km8Var)) {
            return;
        }
        km8Var.M(i);
        throw xm8.a(null, "Expected WEBVTT. Got " + km8Var.n(StandardCharsets.UTF_8));
    }
}

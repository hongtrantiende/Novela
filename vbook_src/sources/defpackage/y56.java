package defpackage;

import java.io.File;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y56  reason: default package */
/* loaded from: classes3.dex */
public abstract class y56 {
    public static final ow6 a;
    public static final mfb b;

    static {
        Object obj = ow6.c;
        a = cwe.m("JvmFsCaseSensitive");
        b = new mfb(new v16(8));
    }

    public static final boolean a(File file) {
        file.getClass();
        if (file.exists() && !((Boolean) b.getValue()).booleanValue()) {
            xw8.a.getClass();
            kf8.a.getClass();
            kf8 kf8Var = ae2.a;
            kf8Var.getClass();
            if (kf8Var == kf8.b) {
                return true;
            }
            File canonicalFile = file.getCanonicalFile();
            boolean i = c16.i(canonicalFile.getName(), file.getName());
            if (!i) {
                lw6 lw6Var = lw6.INFO;
                ow6 ow6Var = a;
                lw6 lw6Var2 = ow6Var.b;
                if (lw6Var2 == null && (lw6Var2 = ow6.e) == null) {
                    lw6Var2 = lw6.WARN;
                }
                if (4 <= lw6Var2.a) {
                    ow6Var.a(lw6Var, "File " + canonicalFile + " doesn't match " + file);
                }
            }
            return i;
        }
        return true;
    }
}

package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ngb  reason: default package */
/* loaded from: classes.dex */
public final class ngb {
    public static final n07 c;
    public static final mfb d;
    public static final /* synthetic */ r76[] b = {new p89(ngb.class, "SystemPropertiesClass", "getSystemPropertiesClass()Ljava/lang/Class;", 0)};
    public static final ngb a = new Object();

    /* JADX WARN: Type inference failed for: r0v1, types: [ngb, java.lang.Object] */
    static {
        int i = ii1.a;
        c = new n07(22, false);
        d = new mfb(new tab(23));
        new mfb(new tab(24));
        new mfb(new tab(25));
        new mfb(new tab(26));
    }

    public static final boolean a(String str) {
        return !k4b.j0(b(str));
    }

    public static String b(String str) {
        Object gs9Var;
        a.getClass();
        dc7 dc7Var = (dc7) d.getValue();
        if (dc7Var != null) {
            Object[] objArr = {str, ""};
            String str2 = null;
            try {
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                dc7Var.q();
                gs9Var = dc7Var.h.invoke(dc7Var.g, Arrays.copyOf(copyOf, copyOf.length));
                if (gs9Var == null) {
                    gs9Var = null;
                }
            } catch (Throwable th) {
                gs9Var = new gs9(th);
            }
            if (!(gs9Var instanceof gs9)) {
                str2 = gs9Var;
            }
            String str3 = str2;
            if (str3 != null) {
                return str3;
            }
        }
        return "";
    }

    public static Class c() {
        r76 r76Var = b[0];
        n07 n07Var = c;
        if (((Class) n07Var.b) == null) {
            n07Var.b = ii1.a(null, "android.os.SystemProperties");
        }
        Class cls = (Class) n07Var.b;
        if (cls != null) {
            return cls;
        }
        vs.k("Exception has been thrown above.");
        return null;
    }
}

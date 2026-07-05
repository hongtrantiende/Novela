package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: st2  reason: default package */
/* loaded from: classes3.dex */
public abstract class st2 {
    public static final c03 a;

    static {
        String str;
        boolean z;
        c03 c03Var;
        int i = ogb.a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z = Boolean.parseBoolean(str);
        } else {
            z = false;
        }
        if (!z) {
            c03Var = rt2.H;
        } else {
            sw2 sw2Var = ab3.a;
            n35 n35Var = zz6.a;
            n35 n35Var2 = n35Var.f;
            c03Var = n35Var;
            if (n35Var == null) {
                c03Var = rt2.H;
            }
        }
        a = c03Var;
    }
}

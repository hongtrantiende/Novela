package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: au9  reason: default package */
/* loaded from: classes.dex */
public abstract class au9 {
    public static final mfb a = new mfb(new pa9(14));
    public static final mfb b = new mfb(new pa9(15));
    public static final mfb c = new mfb(new pa9(16));
    public static final mfb d = new mfb(new pa9(17));
    public static final mfb e = new mfb(new pa9(18));
    public static final mfb f = new mfb(new pa9(19));
    public static final mfb g = new mfb(new pa9(20));
    public static final mfb h = new mfb(new pa9(21));
    public static final mfb i = new mfb(new pa9(22));
    public static final mfb j = new mfb(new pa9(23));
    public static final mfb k = new mfb(new pa9(24));
    public static final mfb l = new mfb(new pa9(25));
    public static final mfb m = new mfb(new pa9(26));
    public static final mfb n = new mfb(new pa9(27));
    public static final mfb o = new mfb(new pa9(28));
    public static final mfb p = new mfb(new pa9(29));
    public static final mfb q = new mfb(new zt9(0));
    public static final mfb r = new mfb(new zt9(1));
    public static final mfb s = new mfb(new zt9(2));

    public static boolean a(String str) {
        Object gs9Var;
        ClassLoader classLoader = str.getClass().getClassLoader();
        if (classLoader == null) {
            return false;
        }
        int i2 = ii1.a;
        Object obj = null;
        try {
            gs9Var = classLoader.loadClass(str);
            if (gs9Var == null) {
                gs9Var = null;
            }
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            obj = gs9Var;
        }
        if (((Class) obj) == null) {
            return false;
        }
        return true;
    }
}

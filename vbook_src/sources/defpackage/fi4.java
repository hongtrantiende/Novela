package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fi4  reason: default package */
/* loaded from: classes.dex */
public final class fi4 extends pw4 {
    public static final fi4 f;
    public static volatile mw4 g;
    public final b99 e = b99.d;

    static {
        fi4 fi4Var = new fi4();
        f = fi4Var;
        fi4Var.b &= Integer.MAX_VALUE;
        pw4.d.put(fi4.class, fi4Var);
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, mw4] */
    @Override // defpackage.pw4
    public final Object a(int i) {
        mw4 mw4Var;
        switch (a82.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new dh9(f, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"constrainedValues_", ei4.class});
            case 3:
                return new fi4();
            case 4:
                return new jw4(f);
            case 5:
                return f;
            case 6:
                mw4 mw4Var2 = g;
                if (mw4Var2 == null) {
                    synchronized (fi4.class) {
                        try {
                            mw4 mw4Var3 = g;
                            mw4Var = mw4Var3;
                            if (mw4Var3 == null) {
                                ?? obj = new Object();
                                g = obj;
                                mw4Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return mw4Var;
                }
                return mw4Var2;
            default:
                cp8.q();
                return null;
        }
    }
}

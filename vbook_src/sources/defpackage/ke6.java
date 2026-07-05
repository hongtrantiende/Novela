package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ke6  reason: default package */
/* loaded from: classes.dex */
public final class ke6 extends ow4 {
    private static final ke6 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int LAYOUT_INDEX_FIELD_NUMBER = 2;
    private static volatile vm8 PARSER;
    private int bitField0_;
    private int layoutIndex_;
    private me6 layout_;

    /* JADX WARN: Type inference failed for: r0v0, types: [ow4, ke6] */
    static {
        ?? ow4Var = new ow4();
        DEFAULT_INSTANCE = ow4Var;
        ow4.i(ke6.class, ow4Var);
    }

    public static void k(ke6 ke6Var, me6 me6Var) {
        ke6Var.getClass();
        me6Var.getClass();
        ke6Var.layout_ = me6Var;
        ke6Var.bitField0_ |= 1;
    }

    public static void l(ke6 ke6Var, int i) {
        ke6Var.layoutIndex_ = i;
    }

    public static je6 o() {
        return (je6) ((iw4) DEFAULT_INSTANCE.b(5));
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [vm8, java.lang.Object] */
    @Override // defpackage.ow4
    public final Object b(int i) {
        vm8 vm8Var;
        switch (a82.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new ch9(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"bitField0_", "layout_", "layoutIndex_"});
            case 3:
                return new ow4();
            case 4:
                return new iw4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vm8 vm8Var2 = PARSER;
                if (vm8Var2 == null) {
                    synchronized (ke6.class) {
                        try {
                            vm8 vm8Var3 = PARSER;
                            vm8Var = vm8Var3;
                            if (vm8Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                vm8Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return vm8Var;
                }
                return vm8Var2;
            default:
                cp8.q();
                return null;
        }
    }

    public final me6 m() {
        me6 me6Var = this.layout_;
        if (me6Var == null) {
            return me6.v();
        }
        return me6Var;
    }

    public final int n() {
        return this.layoutIndex_;
    }
}

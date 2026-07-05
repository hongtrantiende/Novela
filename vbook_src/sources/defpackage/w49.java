package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w49  reason: default package */
/* loaded from: classes.dex */
public final class w49 extends qw4 {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final w49 DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile wm8 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        w49 w49Var = new w49();
        DEFAULT_INSTANCE = w49Var;
        qw4.k(w49.class, w49Var);
    }

    public static v49 E() {
        return (v49) ((kw4) DEFAULT_INSTANCE.d(5));
    }

    public static void m(w49 w49Var, long j) {
        w49Var.valueCase_ = 4;
        w49Var.value_ = Long.valueOf(j);
    }

    public static void n(w49 w49Var, String str) {
        w49Var.getClass();
        w49Var.valueCase_ = 5;
        w49Var.value_ = str;
    }

    public static void o(w49 w49Var, u49 u49Var) {
        w49Var.getClass();
        w49Var.value_ = u49Var;
        w49Var.valueCase_ = 6;
    }

    public static void p(w49 w49Var, double d) {
        w49Var.valueCase_ = 7;
        w49Var.value_ = Double.valueOf(d);
    }

    public static void q(w49 w49Var, c31 c31Var) {
        w49Var.getClass();
        w49Var.valueCase_ = 8;
        w49Var.value_ = c31Var;
    }

    public static void r(w49 w49Var, boolean z) {
        w49Var.valueCase_ = 1;
        w49Var.value_ = Boolean.valueOf(z);
    }

    public static void s(w49 w49Var, float f) {
        w49Var.valueCase_ = 2;
        w49Var.value_ = Float.valueOf(f);
    }

    public static void t(w49 w49Var, int i) {
        w49Var.valueCase_ = 3;
        w49Var.value_ = Integer.valueOf(i);
    }

    public static w49 w() {
        return DEFAULT_INSTANCE;
    }

    public final long A() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final String B() {
        if (this.valueCase_ == 5) {
            return (String) this.value_;
        }
        return "";
    }

    public final u49 C() {
        if (this.valueCase_ == 6) {
            return (u49) this.value_;
        }
        return u49.n();
    }

    public final int D() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [wm8, java.lang.Object] */
    @Override // defpackage.qw4
    public final Object d(int i) {
        wm8 wm8Var;
        switch (a82.C(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new eh9(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", u49.class});
            case 3:
                return new w49();
            case 4:
                return new kw4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                wm8 wm8Var2 = PARSER;
                if (wm8Var2 == null) {
                    synchronized (w49.class) {
                        try {
                            wm8 wm8Var3 = PARSER;
                            wm8Var = wm8Var3;
                            if (wm8Var3 == null) {
                                ?? obj = new Object();
                                PARSER = obj;
                                wm8Var = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return wm8Var;
                }
                return wm8Var2;
            default:
                cp8.q();
                return null;
        }
    }

    public final boolean u() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final c31 v() {
        if (this.valueCase_ == 8) {
            return (c31) this.value_;
        }
        return c31.c;
    }

    public final double x() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float y() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return nae.e;
    }

    public final int z() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }
}

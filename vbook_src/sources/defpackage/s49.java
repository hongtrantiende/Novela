package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s49  reason: default package */
/* loaded from: classes.dex */
public final class s49 extends qw4 {
    private static final s49 DEFAULT_INSTANCE;
    private static volatile wm8 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private b17 preferences_ = b17.b;

    static {
        s49 s49Var = new s49();
        DEFAULT_INSTANCE = s49Var;
        qw4.k(s49.class, s49Var);
    }

    public static b17 m(s49 s49Var) {
        b17 b17Var = s49Var.preferences_;
        if (!b17Var.a) {
            s49Var.preferences_ = b17Var.b();
        }
        return s49Var.preferences_;
    }

    public static q49 o() {
        return (q49) ((kw4) DEFAULT_INSTANCE.d(5));
    }

    public static s49 p(InputStream inputStream) {
        s49 s49Var = DEFAULT_INSTANCE;
        dl1 dl1Var = new dl1(inputStream);
        z54 a = z54.a();
        qw4 j = s49Var.j();
        try {
            z89 z89Var = z89.c;
            z89Var.getClass();
            j0a a2 = z89Var.a(j.getClass());
            vh1 vh1Var = (vh1) dl1Var.c;
            if (vh1Var == null) {
                vh1Var = new vh1(dl1Var, (byte) 0);
            }
            a2.g(j, vh1Var, a);
            a2.b(j);
            if (qw4.g(j, true)) {
                return (s49) j;
            }
            throw new IOException(new nvc().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof q16) {
                throw ((q16) e.getCause());
            }
            throw new IOException(e.getMessage(), e);
        } catch (nvc e2) {
            throw new IOException(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof q16) {
                throw ((q16) e3.getCause());
            }
            throw e3;
        } catch (q16 e4) {
            if (e4.a) {
                throw new IOException(e4.getMessage(), e4);
            }
            throw e4;
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
                return new eh9(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", r49.a});
            case 3:
                return new s49();
            case 4:
                return new kw4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                wm8 wm8Var2 = PARSER;
                if (wm8Var2 == null) {
                    synchronized (s49.class) {
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

    public final Map n() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}

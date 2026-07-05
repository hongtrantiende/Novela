package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ie6  reason: default package */
/* loaded from: classes.dex */
public final class ie6 extends ow4 {
    private static final ie6 DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile vm8 PARSER;
    private sz5 layout_ = a99.d;
    private int nextIndex_;

    static {
        ie6 ie6Var = new ie6();
        DEFAULT_INSTANCE = ie6Var;
        ow4.i(ie6.class, ie6Var);
    }

    public static void k(ie6 ie6Var, ke6 ke6Var) {
        int i;
        ie6Var.getClass();
        sz5 sz5Var = ie6Var.layout_;
        if (!((a99) sz5Var).a) {
            a99 a99Var = (a99) sz5Var;
            int i2 = a99Var.c;
            if (i2 == 0) {
                i = 10;
            } else {
                i = i2 * 2;
            }
            ie6Var.layout_ = a99Var.c(i);
        }
        ((a99) ie6Var.layout_).add(ke6Var);
    }

    public static void l(ie6 ie6Var) {
        ie6Var.getClass();
        ie6Var.layout_ = a99.d;
    }

    public static void m(ie6 ie6Var, int i) {
        ie6Var.nextIndex_ = i;
    }

    public static ie6 n() {
        return DEFAULT_INSTANCE;
    }

    public static ie6 q(FileInputStream fileInputStream) {
        ie6 ie6Var = DEFAULT_INSTANCE;
        bl1 bl1Var = new bl1(fileInputStream);
        x54 a = x54.a();
        ow4 h = ie6Var.h();
        try {
            w89 w89Var = w89.c;
            w89Var.getClass();
            h0a a2 = w89Var.a(h.getClass());
            vh1 vh1Var = (vh1) bl1Var.c;
            if (vh1Var == null) {
                vh1Var = new vh1(bl1Var);
            }
            a2.i(h, vh1Var, a);
            a2.b(h);
            if (ow4.e(h, true)) {
                return (ie6) h;
            }
            throw new IOException(new lvc().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof o16) {
                throw ((o16) e.getCause());
            }
            throw new IOException(e.getMessage(), e);
        } catch (lvc e2) {
            throw new IOException(e2.getMessage());
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof o16) {
                throw ((o16) e3.getCause());
            }
            throw e3;
        } catch (o16 e4) {
            if (e4.a) {
                throw new IOException(e4.getMessage(), e4);
            }
            throw e4;
        }
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
                return new ch9(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", ke6.class, "nextIndex_"});
            case 3:
                return new ie6();
            case 4:
                return new iw4(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                vm8 vm8Var2 = PARSER;
                if (vm8Var2 == null) {
                    synchronized (ie6.class) {
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

    public final sz5 o() {
        return this.layout_;
    }

    public final int p() {
        return this.nextIndex_;
    }
}

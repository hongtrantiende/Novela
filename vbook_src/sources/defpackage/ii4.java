package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ii4  reason: default package */
/* loaded from: classes.dex */
public final class ii4 extends pw4 {
    public static final ii4 f;
    public static volatile mw4 g;
    public final a17 e = a17.b;

    static {
        ii4 ii4Var = new ii4();
        f = ii4Var;
        ii4Var.b &= Integer.MAX_VALUE;
        pw4.d.put(ii4.class, ii4Var);
    }

    public static ii4 g(FileInputStream fileInputStream) {
        pw4 pw4Var;
        y54 a = y54.a();
        try {
            int read = fileInputStream.read();
            if (read == -1) {
                pw4Var = null;
            } else {
                cl1 cl1Var = new cl1(new v2(xb1.u(read, fileInputStream), fileInputStream));
                pw4 f2 = f.f();
                try {
                    y89 y89Var = y89.c;
                    y89Var.getClass();
                    i0a a2 = y89Var.a(f2.getClass());
                    vh1 vh1Var = (vh1) cl1Var.c;
                    if (vh1Var == null) {
                        vh1Var = new vh1(cl1Var);
                    }
                    a2.e(f2, vh1Var, a);
                    a2.b(f2);
                    cl1Var.a(0);
                    pw4Var = f2;
                } catch (IOException e) {
                    if (e.getCause() instanceof p16) {
                        throw ((p16) e.getCause());
                    }
                    throw new IOException(e.getMessage(), e);
                } catch (mvc e2) {
                    throw new IOException(e2.getMessage());
                } catch (RuntimeException e3) {
                    if (e3.getCause() instanceof p16) {
                        throw ((p16) e3.getCause());
                    }
                    throw e3;
                } catch (p16 e4) {
                    if (e4.a) {
                        throw new IOException(e4.getMessage(), e4);
                    }
                    throw e4;
                }
            }
            if (pw4Var != null && !pw4.d(pw4Var, true)) {
                throw new IOException(new mvc().getMessage());
            }
            return (ii4) pw4Var;
        } catch (p16 e5) {
            if (e5.a) {
                throw new IOException(e5.getMessage(), e5);
            }
            throw e5;
        } catch (IOException e6) {
            throw new IOException(e6.getMessage(), e6);
        }
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
                return new dh9(f, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"flags_", hi4.a});
            case 3:
                return new ii4();
            case 4:
                return new jw4(f);
            case 5:
                return f;
            case 6:
                mw4 mw4Var2 = g;
                if (mw4Var2 == null) {
                    synchronized (ii4.class) {
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

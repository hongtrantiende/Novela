package defpackage;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n6f  reason: default package */
/* loaded from: classes.dex */
public final class n6f extends o0e {
    private static final n6f zzl;
    private static volatile f2e zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private f1e zzg = j2e.e;

    static {
        n6f n6fVar = new n6f();
        zzl = n6fVar;
        o0e.o(n6f.class, n6fVar);
    }

    public static n6f v(InputStream inputStream, h0e h0eVar) {
        n6f n6fVar = zzl;
        dcc n = dcc.n(inputStream, 4096);
        o0e i = n6fVar.i();
        try {
            m2e a = i2e.c.a(i.getClass());
            vh1 vh1Var = (vh1) n.c;
            if (vh1Var == null) {
                vh1Var = new vh1(n);
            }
            a.f(i, vh1Var, h0eVar);
            a.c(i);
            o0e.r(i);
            return (n6f) i;
        } catch (i1e e) {
            if (e.a) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof i1e) {
                throw ((i1e) e2.getCause());
            }
            throw new IOException(e2.getMessage(), e2);
        } catch (s2e e3) {
            throw e3.a();
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof i1e) {
                throw ((i1e) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // defpackage.o0e
    public final Object s(int i) {
        f2e f2eVar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                f2e f2eVar2 = zzm;
                                if (f2eVar2 == null) {
                                    synchronized (n6f.class) {
                                        try {
                                            f2eVar = zzm;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzl);
                                                zzm = f2eVar;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    return f2eVar;
                                }
                                return f2eVar2;
                            }
                            throw null;
                        }
                        return zzl;
                    }
                    return new m0e(zzl);
                }
                return new n6f();
            }
            return new k2e(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", bzd.b, "zzi", "zzk", "zzj"});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        return this.zzf;
    }
}

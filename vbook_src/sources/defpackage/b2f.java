package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b2f  reason: default package */
/* loaded from: classes.dex */
public final class b2f extends o0e {
    private static final b2f zzj;
    private static volatile f2e zzk;
    private int zzb;
    private long zzh;
    private r1e zzi = r1e.b;
    private String zze = "";
    private szd zzf = szd.b;
    private String zzg = "";

    static {
        b2f b2fVar = new b2f();
        zzj = b2fVar;
        o0e.o(b2f.class, b2fVar);
    }

    public static b2f A() {
        return zzj;
    }

    public static b2f z(dcc dccVar, h0e h0eVar) {
        o0e i = zzj.i();
        try {
            m2e a = i2e.c.a(i.getClass());
            vh1 vh1Var = (vh1) dccVar.c;
            if (vh1Var == null) {
                vh1Var = new vh1(dccVar);
            }
            a.f(i, vh1Var, h0eVar);
            a.c(i);
            o0e.r(i);
            return (b2f) i;
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
                                f2e f2eVar2 = zzk;
                                if (f2eVar2 == null) {
                                    synchronized (b2f.class) {
                                        try {
                                            f2eVar = zzk;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzj);
                                                zzk = f2eVar;
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
                        return zzj;
                    }
                    return new m0e(zzj);
                }
                return new b2f();
            }
            return new k2e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", z1f.a});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zze;
    }

    public final szd u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final long w() {
        return this.zzh;
    }

    public final int x() {
        return this.zzi.size();
    }

    public final Map y() {
        return Collections.unmodifiableMap(this.zzi);
    }
}

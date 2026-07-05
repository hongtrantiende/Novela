package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t2f  reason: default package */
/* loaded from: classes.dex */
public final class t2f extends o0e {
    private static final b1e zzl = new v28(28);
    private static final t2f zzq;
    private static volatile f2e zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private f1e zzi;
    private f1e zzj;
    private z0e zzk;
    private z2f zzm;
    private boolean zzn;
    private boolean zzo;
    private q2f zzp;
    private szd zze = szd.b;
    private String zzg = "";

    static {
        t2f t2fVar = new t2f();
        zzq = t2fVar;
        o0e.o(t2f.class, t2fVar);
    }

    public t2f() {
        j2e j2eVar = j2e.e;
        this.zzi = j2eVar;
        this.zzj = j2eVar;
        this.zzk = q0e.e;
    }

    public static s2f G() {
        return (s2f) zzq.j();
    }

    public static t2f H() {
        return zzq;
    }

    public final List A() {
        return new c1e(this.zzk, zzl);
    }

    public final boolean B() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final z2f C() {
        z2f z2fVar = this.zzm;
        if (z2fVar == null) {
            return z2f.v();
        }
        return z2fVar;
    }

    public final boolean D() {
        return this.zzn;
    }

    public final boolean E() {
        return this.zzo;
    }

    public final q2f F() {
        q2f q2fVar = this.zzp;
        if (q2fVar == null) {
            return q2f.u();
        }
        return q2fVar;
    }

    public final /* synthetic */ void I(long j) {
        this.zzb |= 8;
        this.zzh = j;
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
                                f2e f2eVar2 = zzr;
                                if (f2eVar2 == null) {
                                    synchronized (t2f.class) {
                                        try {
                                            f2eVar = zzr;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzq);
                                                zzr = f2eVar;
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
                        return zzq;
                    }
                    return new m0e(zzq);
                }
                return new t2f();
            }
            return new k2e(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", bzd.b, "zzm", "zzn", "zzo", "zzp"});
        }
        return (byte) 1;
    }

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final szd u() {
        return this.zze;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final f1e y() {
        return this.zzi;
    }

    public final f1e z() {
        return this.zzj;
    }
}

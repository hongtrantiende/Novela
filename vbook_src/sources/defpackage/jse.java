package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jse  reason: default package */
/* loaded from: classes.dex */
public final class jse extends o0e {
    private static final jse zzm;
    private static volatile f2e zzn;
    private int zzb;
    private f1e zze = j2e.e;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        jse jseVar = new jse();
        zzm = jseVar;
        o0e.o(jse.class, jseVar);
    }

    public static gse J() {
        return (gse) zzm.j();
    }

    public final long A() {
        return this.zzg;
    }

    public final boolean B() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long C() {
        return this.zzh;
    }

    public final boolean D() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final int E() {
        return this.zzi;
    }

    public final boolean F() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }

    public final long G() {
        return this.zzk;
    }

    public final boolean H() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final long I() {
        return this.zzl;
    }

    public final /* synthetic */ void K(int i, tse tseVar) {
        u();
        this.zze.set(i, tseVar);
    }

    public final /* synthetic */ void L(tse tseVar) {
        tseVar.getClass();
        u();
        this.zze.add(tseVar);
    }

    public final /* synthetic */ void M(Iterable iterable) {
        u();
        hzd.d(iterable, this.zze);
    }

    public final void N() {
        this.zze = j2e.e;
    }

    public final /* synthetic */ void O(int i) {
        u();
        this.zze.remove(i);
    }

    public final /* synthetic */ void P(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void Q(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void T(long j) {
        this.zzb |= 32;
        this.zzk = j;
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
                                f2e f2eVar2 = zzn;
                                if (f2eVar2 == null) {
                                    synchronized (jse.class) {
                                        try {
                                            f2eVar = zzn;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzm);
                                                zzn = f2eVar;
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
                        return zzm;
                    }
                    return new m0e(zzm);
                }
                return new jse();
            }
            return new k2e(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", tse.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void t(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void u() {
        f1e f1eVar = this.zze;
        if (!((jzd) f1eVar).a) {
            this.zze = eub.r(f1eVar);
        }
    }

    public final List v() {
        return this.zze;
    }

    public final int w() {
        return this.zze.size();
    }

    public final tse x(int i) {
        return (tse) this.zze.get(i);
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }
}

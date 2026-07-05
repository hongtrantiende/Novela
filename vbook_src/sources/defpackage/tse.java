package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tse  reason: default package */
/* loaded from: classes.dex */
public final class tse extends o0e {
    private static final tse zzk;
    private static volatile f2e zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private f1e zzj = j2e.e;

    static {
        tse tseVar = new tse();
        zzk = tseVar;
        o0e.o(tse.class, tseVar);
    }

    public static qse F() {
        return (qse) zzk.j();
    }

    public final float A() {
        return this.zzh;
    }

    public final boolean B() {
        if ((this.zzb & 16) != 0) {
            return true;
        }
        return false;
    }

    public final double C() {
        return this.zzi;
    }

    public final f1e D() {
        return this.zzj;
    }

    public final int E() {
        return this.zzj.size();
    }

    public final /* synthetic */ void G(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void I() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void J(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void K() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void L(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void M() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void N(tse tseVar) {
        f1e f1eVar = this.zzj;
        if (!((jzd) f1eVar).a) {
            this.zzj = eub.r(f1eVar);
        }
        this.zzj.add(tseVar);
    }

    public final void O(ArrayList arrayList) {
        f1e f1eVar = this.zzj;
        if (!((jzd) f1eVar).a) {
            this.zzj = eub.r(f1eVar);
        }
        hzd.d(arrayList, this.zzj);
    }

    public final void P() {
        this.zzj = j2e.e;
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
                                f2e f2eVar2 = zzl;
                                if (f2eVar2 == null) {
                                    synchronized (tse.class) {
                                        try {
                                            f2eVar = zzl;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzk);
                                                zzl = f2eVar;
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
                        return zzk;
                    }
                    return new m0e(zzk);
                }
                return new tse();
            }
            return new k2e(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", tse.class});
        }
        return (byte) 1;
    }

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final String u() {
        return this.zze;
    }

    public final boolean v() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final long y() {
        return this.zzg;
    }

    public final boolean z() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }
}

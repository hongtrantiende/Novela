package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kle  reason: default package */
/* loaded from: classes.dex */
public final class kle extends o0e {
    private static final kle zzm;
    private static volatile f2e zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private f1e zzg = j2e.e;
    private boolean zzh;
    private yle zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        kle kleVar = new kle();
        zzm = kleVar;
        o0e.o(kle.class, kleVar);
    }

    public static hle F() {
        return (hle) zzm.j();
    }

    public final yle A() {
        yle yleVar = this.zzi;
        if (yleVar == null) {
            return yle.C();
        }
        return yleVar;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final boolean C() {
        return this.zzk;
    }

    public final boolean D() {
        if ((this.zzb & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean E() {
        return this.zzl;
    }

    public final /* synthetic */ void G(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void H(int i, ple pleVar) {
        f1e f1eVar = this.zzg;
        if (!((jzd) f1eVar).a) {
            this.zzg = eub.r(f1eVar);
        }
        this.zzg.set(i, pleVar);
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
                                    synchronized (kle.class) {
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
                return new kle();
            }
            return new k2e(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", ple.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }

    public final List w() {
        return this.zzg;
    }

    public final int x() {
        return this.zzg.size();
    }

    public final ple y(int i) {
        return (ple) this.zzg.get(i);
    }

    public final boolean z() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }
}

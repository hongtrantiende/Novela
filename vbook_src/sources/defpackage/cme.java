package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cme  reason: default package */
/* loaded from: classes.dex */
public final class cme extends o0e {
    private static final cme zzk;
    private static volatile f2e zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private ple zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        cme cmeVar = new cme();
        zzk = cmeVar;
        o0e.o(cme.class, cmeVar);
    }

    public static ame B() {
        return (ame) zzk.j();
    }

    public final boolean A() {
        return this.zzj;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 2;
        this.zzf = str;
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
                                    synchronized (cme.class) {
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
                return new cme();
            }
            return new k2e(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
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

    public final ple w() {
        ple pleVar = this.zzg;
        if (pleVar == null) {
            return ple.B();
        }
        return pleVar;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        if ((this.zzb & 32) != 0) {
            return true;
        }
        return false;
    }
}

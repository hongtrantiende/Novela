package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sme  reason: default package */
/* loaded from: classes.dex */
public final class sme extends o0e {
    private static final sme zzg;
    private static volatile f2e zzh;
    private int zzb;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [o0e, sme] */
    static {
        ?? o0eVar = new o0e();
        zzg = o0eVar;
        o0e.o(sme.class, o0eVar);
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
                                f2e f2eVar2 = zzh;
                                if (f2eVar2 == null) {
                                    synchronized (sme.class) {
                                        try {
                                            f2eVar = zzh;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzg);
                                                zzh = f2eVar;
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
                        return zzg;
                    }
                    return new m0e(zzg);
                }
                return new o0e();
            }
            bzd bzdVar = bzd.f;
            return new k2e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", bzdVar, "zzf", bzdVar});
        }
        return (byte) 1;
    }

    public final int t() {
        int r = pae.r(this.zze);
        if (r == 0) {
            return 1;
        }
        return r;
    }

    public final int u() {
        int r = pae.r(this.zzf);
        if (r == 0) {
            return 1;
        }
        return r;
    }
}

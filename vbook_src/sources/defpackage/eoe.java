package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eoe  reason: default package */
/* loaded from: classes.dex */
public final class eoe extends o0e {
    private static final eoe zzh;
    private static volatile f2e zzi;
    private int zzb;
    private String zze = "";
    private f1e zzf = j2e.e;
    private boolean zzg;

    static {
        eoe eoeVar = new eoe();
        zzh = eoeVar;
        o0e.o(eoe.class, eoeVar);
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
                                f2e f2eVar2 = zzi;
                                if (f2eVar2 == null) {
                                    synchronized (eoe.class) {
                                        try {
                                            f2eVar = zzi;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzh);
                                                zzi = f2eVar;
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
                        return zzh;
                    }
                    return new m0e(zzh);
                }
                return new eoe();
            }
            return new k2e(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", hpe.class, "zzg"});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zze;
    }
}

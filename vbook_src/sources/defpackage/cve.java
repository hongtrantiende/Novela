package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cve  reason: default package */
/* loaded from: classes.dex */
public final class cve extends o0e {
    private static final cve zzg;
    private static volatile f2e zzh;
    private int zzb;
    private String zze = "";
    private f1e zzf = j2e.e;

    static {
        cve cveVar = new cve();
        zzg = cveVar;
        o0e.o(cve.class, cveVar);
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
                                    synchronized (cve.class) {
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
                return new cve();
            }
            return new k2e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", ove.class});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zze;
    }

    public final List u() {
        return this.zzf;
    }
}

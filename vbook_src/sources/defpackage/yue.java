package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yue  reason: default package */
/* loaded from: classes.dex */
public final class yue extends o0e {
    private static final yue zze;
    private static volatile f2e zzf;
    private f1e zzb = j2e.e;

    static {
        yue yueVar = new yue();
        zze = yueVar;
        o0e.o(yue.class, yueVar);
    }

    public static yue v() {
        return zze;
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
                                f2e f2eVar2 = zzf;
                                if (f2eVar2 == null) {
                                    synchronized (yue.class) {
                                        try {
                                            f2eVar = zzf;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zze);
                                                zzf = f2eVar;
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
                        return zze;
                    }
                    return new m0e(zze);
                }
                return new yue();
            }
            return new k2e(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", cve.class});
        }
        return (byte) 1;
    }

    public final List t() {
        return this.zzb;
    }

    public final int u() {
        return this.zzb.size();
    }
}

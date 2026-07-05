package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wre  reason: default package */
/* loaded from: classes.dex */
public final class wre extends o0e {
    private static final wre zze;
    private static volatile f2e zzf;
    private f1e zzb = j2e.e;

    static {
        wre wreVar = new wre();
        zze = wreVar;
        o0e.o(wre.class, wreVar);
    }

    public static cre u() {
        return (cre) zze.j();
    }

    public static wre v() {
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
                                    synchronized (wre.class) {
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
                return new wre();
            }
            return new k2e(zze, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", pre.class});
        }
        return (byte) 1;
    }

    public final List t() {
        return this.zzb;
    }

    public final void w(ArrayList arrayList) {
        f1e f1eVar = this.zzb;
        if (!((jzd) f1eVar).a) {
            this.zzb = eub.r(f1eVar);
        }
        hzd.d(arrayList, this.zzb);
    }
}

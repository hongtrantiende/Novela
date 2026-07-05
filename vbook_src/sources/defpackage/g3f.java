package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g3f  reason: default package */
/* loaded from: classes.dex */
public final class g3f extends o0e {
    private static final g3f zzg;
    private static volatile f2e zzh;
    private int zzb;
    private f1e zze = j2e.e;
    private String zzf = "";

    static {
        g3f g3fVar = new g3f();
        zzg = g3fVar;
        o0e.o(g3f.class, g3fVar);
    }

    public static g3f u() {
        return zzg;
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
                                    synchronized (g3f.class) {
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
                return new g3f();
            }
            return new k2e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final List t() {
        return this.zze;
    }

    public final void v(String str) {
        f1e f1eVar = this.zze;
        if (!((jzd) f1eVar).a) {
            this.zze = eub.r(f1eVar);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void w(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h1f  reason: default package */
/* loaded from: classes.dex */
public final class h1f extends o0e {
    private static final h1f zzh;
    private static volatile f2e zzi;
    private int zzb;
    private g1f zzf;
    private String zze = "";
    private String zzg = "";

    static {
        h1f h1fVar = new h1f();
        zzh = h1fVar;
        o0e.o(h1f.class, h1fVar);
    }

    public static a1f u() {
        return (a1f) zzh.j();
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
                                    synchronized (h1f.class) {
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
                return new h1f();
            }
            return new k2e(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zze;
    }

    public final /* synthetic */ void v(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void w(g1f g1fVar) {
        this.zzf = g1fVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void x(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}

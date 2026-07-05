package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g1f  reason: default package */
/* loaded from: classes.dex */
public final class g1f extends o0e {
    private static final g1f zzg;
    private static volatile f2e zzh;
    private int zzb;
    private int zze;
    private int zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [o0e, g1f] */
    static {
        ?? o0eVar = new o0e();
        zzg = o0eVar;
        o0e.o(g1f.class, o0eVar);
    }

    public static d1f t() {
        return (d1f) zzg.j();
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
                                    synchronized (g1f.class) {
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
            return new k2e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final /* synthetic */ void u(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
    }

    public final /* synthetic */ void v(int i) {
        if (i != 1) {
            this.zzf = i - 2;
            this.zzb |= 2;
            return;
        }
        vs.m("Can't get the number of an unknown enum value.");
    }
}

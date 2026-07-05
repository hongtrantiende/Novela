package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q2f  reason: default package */
/* loaded from: classes.dex */
public final class q2f extends o0e {
    private static final q2f zzf;
    private static volatile f2e zzg;
    private int zzb;
    private boolean zze;

    /* JADX WARN: Type inference failed for: r0v0, types: [q2f, o0e] */
    static {
        ?? o0eVar = new o0e();
        zzf = o0eVar;
        o0e.o(q2f.class, o0eVar);
    }

    public static q2f u() {
        return zzf;
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
                                f2e f2eVar2 = zzg;
                                if (f2eVar2 == null) {
                                    synchronized (q2f.class) {
                                        try {
                                            f2eVar = zzg;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzf);
                                                zzg = f2eVar;
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
                        return zzf;
                    }
                    return new m0e(zzf);
                }
                return new o0e();
            }
            return new k2e(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        return (byte) 1;
    }

    public final boolean t() {
        return this.zze;
    }
}

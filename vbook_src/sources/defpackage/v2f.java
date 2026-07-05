package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v2f  reason: default package */
/* loaded from: classes.dex */
public final class v2f extends o0e {
    private static final v2f zzo;
    private static volatile f2e zzp;
    private int zzb;
    private boolean zzf;
    private f1e zzh;
    private f1e zzi;
    private z0e zzj;
    private z2f zzk;
    private boolean zzl;
    private boolean zzm;
    private q2f zzn;
    private szd zze = szd.b;
    private String zzg = "";

    static {
        v2f v2fVar = new v2f();
        zzo = v2fVar;
        o0e.o(v2f.class, v2fVar);
    }

    public v2f() {
        j2e j2eVar = j2e.e;
        this.zzh = j2eVar;
        this.zzi = j2eVar;
        this.zzj = q0e.e;
    }

    public static v2f t() {
        return zzo;
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
                                f2e f2eVar2 = zzp;
                                if (f2eVar2 == null) {
                                    synchronized (v2f.class) {
                                        try {
                                            f2eVar = zzp;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzo);
                                                zzp = f2eVar;
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
                        return zzo;
                    }
                    return new m0e(zzo);
                }
                return new v2f();
            }
            return new k2e(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", bzd.b, "zzk", "zzl", "zzm", "zzn"});
        }
        return (byte) 1;
    }
}

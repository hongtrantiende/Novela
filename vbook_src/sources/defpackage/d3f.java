package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d3f  reason: default package */
/* loaded from: classes.dex */
public final class d3f extends o0e {
    private static final d3f zzg;
    private static volatile f2e zzh;
    private int zzb;
    private t2f zze;
    private v2f zzf;

    /* JADX WARN: Type inference failed for: r0v0, types: [o0e, d3f] */
    static {
        ?? o0eVar = new o0e();
        zzg = o0eVar;
        o0e.o(d3f.class, o0eVar);
    }

    public static d3f v(byte[] bArr, h0e h0eVar) {
        return (d3f) o0e.e(zzg, bArr, h0eVar);
    }

    public static a3f w() {
        return (a3f) zzg.j();
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
                                    synchronized (d3f.class) {
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
            return new k2e(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final t2f t() {
        t2f t2fVar = this.zze;
        if (t2fVar == null) {
            return t2f.H();
        }
        return t2fVar;
    }

    public final v2f u() {
        v2f v2fVar = this.zzf;
        if (v2fVar == null) {
            return v2f.t();
        }
        return v2fVar;
    }

    public final /* synthetic */ void x(t2f t2fVar) {
        this.zze = t2fVar;
        this.zzb |= 1;
    }
}

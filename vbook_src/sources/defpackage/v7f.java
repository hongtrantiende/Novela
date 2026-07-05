package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v7f  reason: default package */
/* loaded from: classes.dex */
public final class v7f extends o0e {
    private static final v7f zzj;
    private static volatile f2e zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private szd zzf = szd.b;
    private String zzg = "";
    private f1e zzi = j2e.e;

    static {
        v7f v7fVar = new v7f();
        zzj = v7fVar;
        o0e.o(v7f.class, v7fVar);
    }

    public static v7f A() {
        return zzj;
    }

    public static t7f z() {
        return (t7f) zzj.j();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(szd szdVar) {
        szdVar.getClass();
        this.zzb |= 2;
        this.zzf = szdVar;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void E(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void F(y7f y7fVar) {
        f1e f1eVar = this.zzi;
        if (!((jzd) f1eVar).a) {
            this.zzi = eub.r(f1eVar);
        }
        this.zzi.add(y7fVar);
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
                                f2e f2eVar2 = zzk;
                                if (f2eVar2 == null) {
                                    synchronized (v7f.class) {
                                        try {
                                            f2eVar = zzk;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzj);
                                                zzk = f2eVar;
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
                        return zzj;
                    }
                    return new m0e(zzj);
                }
                return new v7f();
            }
            return new k2e(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", y7f.class});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zze;
    }

    public final szd u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final long w() {
        return this.zzh;
    }

    public final f1e x() {
        return this.zzi;
    }

    public final int y() {
        return this.zzi.size();
    }
}

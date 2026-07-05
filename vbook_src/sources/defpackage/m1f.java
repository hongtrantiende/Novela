package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m1f  reason: default package */
/* loaded from: classes.dex */
public final class m1f extends o0e {
    private static final m1f zzl;
    private static volatile f2e zzm;
    private int zzb;
    private String zze = "";
    private szd zzf = szd.b;
    private String zzg = "";
    private f1e zzh;
    private f1e zzi;
    private boolean zzj;
    private long zzk;

    static {
        m1f m1fVar = new m1f();
        zzl = m1fVar;
        o0e.o(m1f.class, m1fVar);
    }

    public m1f() {
        j2e j2eVar = j2e.e;
        this.zzh = j2eVar;
        this.zzi = j2eVar;
    }

    public static j1f z() {
        return (j1f) zzl.j();
    }

    public final /* synthetic */ void A(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void B(rzd rzdVar) {
        rzdVar.getClass();
        this.zzb |= 2;
        this.zzf = rzdVar;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void D(q1f q1fVar) {
        f1e f1eVar = this.zzh;
        if (!((jzd) f1eVar).a) {
            this.zzh = eub.r(f1eVar);
        }
        this.zzh.add(q1fVar);
    }

    public final void E(String str) {
        str.getClass();
        f1e f1eVar = this.zzi;
        if (!((jzd) f1eVar).a) {
            this.zzi = eub.r(f1eVar);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 16;
        this.zzk = j;
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
                                f2e f2eVar2 = zzm;
                                if (f2eVar2 == null) {
                                    synchronized (m1f.class) {
                                        try {
                                            f2eVar = zzm;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzl);
                                                zzm = f2eVar;
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
                        return zzl;
                    }
                    return new m0e(zzl);
                }
                return new m1f();
            }
            return new k2e(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", q1f.class, "zzi", "zzj", "zzk"});
        }
        return (byte) 1;
    }

    public final String t() {
        return this.zze;
    }

    public final boolean u() {
        if ((this.zzb & 2) != 0) {
            return true;
        }
        return false;
    }

    public final szd v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final f1e x() {
        return this.zzh;
    }

    public final long y() {
        return this.zzk;
    }
}

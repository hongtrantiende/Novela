package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: are  reason: default package */
/* loaded from: classes.dex */
public final class are extends o0e {
    private static final are zzi;
    private static volatile f2e zzj;
    private int zzb;
    private int zze;
    private aue zzf;
    private aue zzg;
    private boolean zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [o0e, are] */
    static {
        ?? o0eVar = new o0e();
        zzi = o0eVar;
        o0e.o(are.class, o0eVar);
    }

    public static xqe A() {
        return (xqe) zzi.j();
    }

    public final /* synthetic */ void B(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void C(aue aueVar) {
        this.zzf = aueVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void D(aue aueVar) {
        this.zzg = aueVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
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
                                f2e f2eVar2 = zzj;
                                if (f2eVar2 == null) {
                                    synchronized (are.class) {
                                        try {
                                            f2eVar = zzj;
                                            if (f2eVar == null) {
                                                f2eVar = new n0e(zzi);
                                                zzj = f2eVar;
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
                        return zzi;
                    }
                    return new m0e(zzi);
                }
                return new o0e();
            }
            return new k2e(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final boolean t() {
        if ((this.zzb & 1) != 0) {
            return true;
        }
        return false;
    }

    public final int u() {
        return this.zze;
    }

    public final aue v() {
        aue aueVar = this.zzf;
        if (aueVar == null) {
            return aue.C();
        }
        return aueVar;
    }

    public final boolean w() {
        if ((this.zzb & 4) != 0) {
            return true;
        }
        return false;
    }

    public final aue x() {
        aue aueVar = this.zzg;
        if (aueVar == null) {
            return aue.C();
        }
        return aueVar;
    }

    public final boolean y() {
        if ((this.zzb & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean z() {
        return this.zzh;
    }
}

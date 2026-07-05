package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sdf  reason: default package */
/* loaded from: classes.dex */
public final class sdf extends m7e {
    private static final sdf zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private mdf zzg;
    private s6e zzh;
    private s6e zzi;

    static {
        sdf sdfVar = new sdf();
        zzc = sdfVar;
        m7e.j(sdf.class, sdfVar);
    }

    public sdf() {
        w6e w6eVar = s6e.b;
        this.zzh = w6eVar;
        this.zzi = w6eVar;
    }

    public static rdf A() {
        return (rdf) zzc.o();
    }

    public static sdf B() {
        return zzc;
    }

    public static k8e E() {
        return (k8e) zzc.d(7);
    }

    public static sdf u(s6e s6eVar, g7e g7eVar) {
        return (sdf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void w(sdf sdfVar, s6e s6eVar) {
        s6eVar.getClass();
        sdfVar.zzh = s6eVar;
    }

    public static /* synthetic */ void x(sdf sdfVar, mdf mdfVar) {
        sdfVar.zzg = mdfVar;
        sdfVar.zze |= 1;
    }

    public static /* synthetic */ void z(sdf sdfVar, s6e s6eVar) {
        s6eVar.getClass();
        sdfVar.zzi = s6eVar;
    }

    public final s6e C() {
        return this.zzh;
    }

    public final s6e D() {
        return this.zzi;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (wdf.a[i - 1]) {
            case 1:
                return new sdf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (sdf.class) {
                        try {
                            k8e k8eVar3 = zzd;
                            k8eVar = k8eVar3;
                            if (k8eVar3 == null) {
                                ?? obj = new Object();
                                zzd = obj;
                                k8eVar = obj;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return k8eVar;
                }
                return k8eVar2;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final int t() {
        return this.zzf;
    }

    public final mdf y() {
        mdf mdfVar = this.zzg;
        if (mdfVar == null) {
            return mdf.z();
        }
        return mdfVar;
    }
}

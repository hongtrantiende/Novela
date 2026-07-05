package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pef  reason: default package */
/* loaded from: classes.dex */
public final class pef extends m7e {
    private static final pef zzc;
    private static volatile k8e zzd;
    private int zze;
    private vef zzf;
    private int zzg;
    private int zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [pef, m7e] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(pef.class, m7eVar);
    }

    public static pef u(s6e s6eVar, g7e g7eVar) {
        return (pef) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(pef pefVar, int i) {
        pefVar.zzg = i;
    }

    public static /* synthetic */ void w(pef pefVar, vef vefVar) {
        pefVar.zzf = vefVar;
        pefVar.zze |= 1;
    }

    public static oef y() {
        return (oef) zzc.o();
    }

    public static pef z() {
        return zzc;
    }

    public final vef A() {
        vef vefVar = this.zzf;
        if (vefVar == null) {
            return vef.y();
        }
        return vefVar;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (sef.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (pef.class) {
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
        return this.zzg;
    }

    public final int x() {
        return this.zzh;
    }
}

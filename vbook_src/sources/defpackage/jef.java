package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jef */
/* loaded from: classes.dex */
public final class jef extends m7e {
    private static final jef zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private vef zzg;
    private s6e zzh = s6e.b;

    static {
        jef jefVar = new jef();
        zzc = jefVar;
        m7e.j(jef.class, jefVar);
    }

    public static k8e B() {
        return (k8e) zzc.d(7);
    }

    public static jef u(s6e s6eVar, g7e g7eVar) {
        return (jef) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(jef jefVar, s6e s6eVar) {
        s6eVar.getClass();
        jefVar.zzh = s6eVar;
    }

    public static /* synthetic */ void w(jef jefVar, vef vefVar) {
        jefVar.zzg = vefVar;
        jefVar.zze |= 1;
    }

    public static ief x() {
        return (ief) zzc.o();
    }

    public static jef y() {
        return zzc;
    }

    public final s6e A() {
        return this.zzh;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (nef.a[i - 1]) {
            case 1:
                return new jef();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (jef.class) {
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

    public final vef z() {
        vef vefVar = this.zzg;
        if (vefVar == null) {
            return vef.y();
        }
        return vefVar;
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: caf  reason: default package */
/* loaded from: classes.dex */
public final class caf extends m7e {
    private static final caf zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private s6e zzg = s6e.b;
    private oaf zzh;

    static {
        caf cafVar = new caf();
        zzc = cafVar;
        m7e.j(caf.class, cafVar);
    }

    public static k8e A() {
        return (k8e) zzc.d(7);
    }

    public static caf u(s6e s6eVar, g7e g7eVar) {
        return (caf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(caf cafVar, w6e w6eVar) {
        w6eVar.getClass();
        cafVar.zzg = w6eVar;
    }

    public static /* synthetic */ void w(caf cafVar, oaf oafVar) {
        cafVar.zzh = oafVar;
        cafVar.zze |= 1;
    }

    public static baf x() {
        return (baf) zzc.o();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (y9f.a[i - 1]) {
            case 1:
                return new caf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (caf.class) {
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

    public final oaf y() {
        oaf oafVar = this.zzh;
        if (oafVar == null) {
            return oaf.w();
        }
        return oafVar;
    }

    public final s6e z() {
        return this.zzg;
    }
}

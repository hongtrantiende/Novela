package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kif */
/* loaded from: classes.dex */
public final class kif extends m7e {
    private static final kif zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private uif zzg;
    private s6e zzh = s6e.b;

    static {
        kif kifVar = new kif();
        zzc = kifVar;
        m7e.j(kif.class, kifVar);
    }

    public static kif u(s6e s6eVar, g7e g7eVar) {
        return (kif) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(kif kifVar, w6e w6eVar) {
        w6eVar.getClass();
        kifVar.zzh = w6eVar;
    }

    public static /* synthetic */ void w(kif kifVar, uif uifVar) {
        kifVar.zzg = uifVar;
        kifVar.zze |= 1;
    }

    public static jif x() {
        return (jif) zzc.o();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (nif.a[i - 1]) {
            case 1:
                return new kif();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (kif.class) {
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

    public final uif y() {
        uif uifVar = this.zzg;
        if (uifVar == null) {
            return uif.w();
        }
        return uifVar;
    }

    public final s6e z() {
        return this.zzh;
    }
}

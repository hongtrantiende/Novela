package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: scf  reason: default package */
/* loaded from: classes.dex */
public final class scf extends m7e {
    private static final scf zzc;
    private static volatile k8e zzd;
    private int zze;
    private s6e zzf = s6e.b;

    static {
        scf scfVar = new scf();
        zzc = scfVar;
        m7e.j(scf.class, scfVar);
    }

    public static scf u(s6e s6eVar, g7e g7eVar) {
        return (scf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(scf scfVar, w6e w6eVar) {
        w6eVar.getClass();
        scfVar.zzf = w6eVar;
    }

    public static rcf w() {
        return (rcf) zzc.o();
    }

    public static k8e y() {
        return (k8e) zzc.d(7);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (qcf.a[i - 1]) {
            case 1:
                return new scf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (scf.class) {
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
        return this.zze;
    }

    public final s6e x() {
        return this.zzf;
    }
}

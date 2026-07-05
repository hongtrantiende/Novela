package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zaf  reason: default package */
/* loaded from: classes.dex */
public final class zaf extends m7e {
    private static final zaf zzc;
    private static volatile k8e zzd;
    private int zze;
    private kbf zzf;
    private pef zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [m7e, zaf] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(zaf.class, m7eVar);
    }

    public static waf t() {
        return (waf) zzc.o();
    }

    public static zaf u(s6e s6eVar, g7e g7eVar) {
        return (zaf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(zaf zafVar, kbf kbfVar) {
        zafVar.zzf = kbfVar;
        zafVar.zze |= 1;
    }

    public static /* synthetic */ void w(zaf zafVar, pef pefVar) {
        zafVar.zzg = pefVar;
        zafVar.zze |= 2;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (vaf.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (zaf.class) {
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

    public final kbf x() {
        kbf kbfVar = this.zzf;
        if (kbfVar == null) {
            return kbf.x();
        }
        return kbfVar;
    }

    public final pef y() {
        pef pefVar = this.zzg;
        if (pefVar == null) {
            return pef.z();
        }
        return pefVar;
    }
}

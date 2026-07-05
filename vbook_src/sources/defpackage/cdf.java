package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cdf  reason: default package */
/* loaded from: classes.dex */
public final class cdf extends m7e {
    private static final cdf zzc;
    private static volatile k8e zzd;

    /* JADX WARN: Type inference failed for: r0v0, types: [cdf, m7e] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(cdf.class, m7eVar);
    }

    public static void t(s6e s6eVar, g7e g7eVar) {
        cdf cdfVar = (cdf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static cdf u() {
        return zzc;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (adf.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0000", null);
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (cdf.class) {
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
}

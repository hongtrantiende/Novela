package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kbf  reason: default package */
/* loaded from: classes.dex */
public final class kbf extends m7e {
    private static final kbf zzc;
    private static volatile k8e zzd;
    private int zze;
    private nbf zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [m7e, kbf] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(kbf.class, m7eVar);
    }

    public static /* synthetic */ void u(kbf kbfVar, int i) {
        kbfVar.zzg = i;
    }

    public static /* synthetic */ void v(kbf kbfVar, nbf nbfVar) {
        kbfVar.zzf = nbfVar;
        kbfVar.zze |= 1;
    }

    public static jbf w() {
        return (jbf) zzc.o();
    }

    public static kbf x() {
        return zzc;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (gbf.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (kbf.class) {
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

    public final nbf y() {
        nbf nbfVar = this.zzf;
        if (nbfVar == null) {
            return nbf.w();
        }
        return nbfVar;
    }
}

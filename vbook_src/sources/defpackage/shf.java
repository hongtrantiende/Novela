package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: shf  reason: default package */
/* loaded from: classes.dex */
public final class shf extends m7e {
    private static final shf zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private aif zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [shf, m7e] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(shf.class, m7eVar);
    }

    public static shf u(s6e s6eVar, g7e g7eVar) {
        return (shf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(shf shfVar, aif aifVar) {
        shfVar.zzg = aifVar;
        shfVar.zze |= 1;
    }

    public static rhf w() {
        return (rhf) zzc.o();
    }

    public static k8e y() {
        return (k8e) zzc.d(7);
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (phf.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (shf.class) {
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

    public final aif x() {
        aif aifVar = this.zzg;
        if (aifVar == null) {
            return aif.y();
        }
        return aifVar;
    }
}

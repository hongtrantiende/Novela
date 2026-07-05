package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nhf  reason: default package */
/* loaded from: classes.dex */
public final class nhf extends m7e {
    private static final nhf zzc;
    private static volatile k8e zzd;
    private String zze = "";

    static {
        nhf nhfVar = new nhf();
        zzc = nhfVar;
        m7e.j(nhf.class, nhfVar);
    }

    public static mhf t() {
        return (mhf) zzc.o();
    }

    public static nhf u(s6e s6eVar, g7e g7eVar) {
        return (nhf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(nhf nhfVar, String str) {
        str.getClass();
        nhfVar.zze = str;
    }

    public static nhf w() {
        return zzc;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (lhf.a[i - 1]) {
            case 1:
                return new nhf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (nhf.class) {
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

    public final String x() {
        return this.zze;
    }
}

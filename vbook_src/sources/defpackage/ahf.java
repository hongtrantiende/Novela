package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ahf  reason: default package */
/* loaded from: classes.dex */
public final class ahf extends m7e {
    private static final ahf zzc;
    private static volatile k8e zzd;
    private String zze = "";
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        ahf ahfVar = new ahf();
        zzc = ahfVar;
        m7e.j(ahf.class, ahfVar);
    }

    public static /* synthetic */ void u(ahf ahfVar, String str) {
        str.getClass();
        ahfVar.zze = str;
    }

    public static zgf x() {
        return (zgf) zzc.o();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (ygf.a[i - 1]) {
            case 1:
                return new ahf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (ahf.class) {
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

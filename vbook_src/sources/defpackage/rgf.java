package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rgf  reason: default package */
/* loaded from: classes.dex */
public final class rgf extends m7e {
    private static final rgf zzc;
    private static volatile k8e zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    static {
        rgf rgfVar = new rgf();
        zzc = rgfVar;
        m7e.j(rgf.class, rgfVar);
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (pgf.a[i - 1]) {
            case 1:
                return new rgf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (rgf.class) {
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

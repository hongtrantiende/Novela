package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: chf  reason: default package */
/* loaded from: classes.dex */
public final class chf extends m7e {
    private static final chf zzc;
    private static volatile k8e zzd;
    private int zze;
    private v7e zzf = l8e.e;

    static {
        chf chfVar = new chf();
        zzc = chfVar;
        m7e.j(chf.class, chfVar);
    }

    public static void u(chf chfVar, ahf ahfVar) {
        v7e v7eVar = chfVar.zzf;
        if (!((l8e) v7eVar).a) {
            l8e l8eVar = (l8e) v7eVar;
            chfVar.zzf = l8eVar.b(l8eVar.c << 1);
        }
        ((l8e) chfVar.zzf).add(ahfVar);
    }

    public static bhf v() {
        return (bhf) zzc.o();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (ygf.a[i - 1]) {
            case 1:
                return new chf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", ahf.class});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (chf.class) {
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

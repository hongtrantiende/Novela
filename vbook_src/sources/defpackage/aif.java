package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aif  reason: default package */
/* loaded from: classes.dex */
public final class aif extends m7e {
    private static final aif zzc;
    private static volatile k8e zzd;
    private int zze;
    private String zzf = "";
    private ogf zzg;

    static {
        aif aifVar = new aif();
        zzc = aifVar;
        m7e.j(aif.class, aifVar);
    }

    public static aif u(s6e s6eVar, g7e g7eVar) {
        return (aif) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(aif aifVar, String str) {
        str.getClass();
        aifVar.zzf = str;
    }

    public static /* synthetic */ void w(aif aifVar, ogf ogfVar) {
        ogfVar.getClass();
        aifVar.zzg = ogfVar;
        aifVar.zze |= 1;
    }

    public static zhf x() {
        return (zhf) zzc.o();
    }

    public static aif y() {
        return zzc;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (whf.a[i - 1]) {
            case 1:
                return new aif();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (aif.class) {
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

    public final ogf t() {
        ogf ogfVar = this.zzg;
        if (ogfVar == null) {
            return ogf.y();
        }
        return ogfVar;
    }

    public final String z() {
        return this.zzf;
    }
}

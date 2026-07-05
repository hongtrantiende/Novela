package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ogf  reason: default package */
/* loaded from: classes.dex */
public final class ogf extends m7e {
    private static final ogf zzc;
    private static volatile k8e zzd;
    private String zze = "";
    private s6e zzf = s6e.b;
    private int zzg;

    static {
        ogf ogfVar = new ogf();
        zzc = ogfVar;
        m7e.j(ogf.class, ogfVar);
    }

    public static mgf t() {
        return (mgf) zzc.o();
    }

    public static ogf u(byte[] bArr, g7e g7eVar) {
        return (ogf) m7e.i(zzc, bArr, g7eVar);
    }

    public static /* synthetic */ void v(ogf ogfVar, String str) {
        str.getClass();
        ogfVar.zze = str;
    }

    public static /* synthetic */ void w(ogf ogfVar, s6e s6eVar) {
        s6eVar.getClass();
        ogfVar.zzf = s6eVar;
    }

    public static ogf y() {
        return zzc;
    }

    public final s6e A() {
        return this.zzf;
    }

    public final String B() {
        return this.zze;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (lgf.a[i - 1]) {
            case 1:
                return new ogf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (ogf.class) {
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

    public final eif z() {
        eif a = eif.a(this.zzg);
        if (a == null) {
            return eif.UNRECOGNIZED;
        }
        return a;
    }
}

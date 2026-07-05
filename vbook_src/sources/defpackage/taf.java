package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: taf */
/* loaded from: classes.dex */
public final class taf extends m7e {
    private static final taf zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private fbf zzg;
    private jef zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [taf, m7e] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(taf.class, m7eVar);
    }

    public static k8e A() {
        return (k8e) zzc.d(7);
    }

    public static taf u(s6e s6eVar, g7e g7eVar) {
        return (taf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(taf tafVar, fbf fbfVar) {
        tafVar.zzg = fbfVar;
        tafVar.zze |= 1;
    }

    public static /* synthetic */ void w(taf tafVar, jef jefVar) {
        tafVar.zzh = jefVar;
        tafVar.zze |= 2;
    }

    public static raf x() {
        return (raf) zzc.o();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (qaf.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (taf.class) {
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

    public final fbf y() {
        fbf fbfVar = this.zzg;
        if (fbfVar == null) {
            return fbf.x();
        }
        return fbfVar;
    }

    public final jef z() {
        jef jefVar = this.zzh;
        if (jefVar == null) {
            return jef.y();
        }
        return jefVar;
    }
}

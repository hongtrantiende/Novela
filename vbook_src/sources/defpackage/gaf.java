package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gaf  reason: default package */
/* loaded from: classes.dex */
public final class gaf extends m7e {
    private static final gaf zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private oaf zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [m7e, gaf] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(gaf.class, m7eVar);
    }

    public static gaf u(s6e s6eVar, g7e g7eVar) {
        return (gaf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(gaf gafVar, int i) {
        gafVar.zzf = i;
    }

    public static /* synthetic */ void w(gaf gafVar, oaf oafVar) {
        gafVar.zzg = oafVar;
        gafVar.zze |= 1;
    }

    public static eaf x() {
        return (eaf) zzc.o();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (daf.a[i - 1]) {
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
                    synchronized (gaf.class) {
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

    public final oaf y() {
        oaf oafVar = this.zzg;
        if (oafVar == null) {
            return oaf.w();
        }
        return oafVar;
    }
}

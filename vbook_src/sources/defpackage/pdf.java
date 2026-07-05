package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pdf  reason: default package */
/* loaded from: classes.dex */
public final class pdf extends m7e {
    private static final pdf zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private sdf zzg;
    private s6e zzh = s6e.b;

    static {
        pdf pdfVar = new pdf();
        zzc = pdfVar;
        m7e.j(pdf.class, pdfVar);
    }

    public static k8e B() {
        return (k8e) zzc.d(7);
    }

    public static pdf u(s6e s6eVar, g7e g7eVar) {
        return (pdf) m7e.h(zzc, s6eVar, g7eVar);
    }

    public static /* synthetic */ void v(pdf pdfVar) {
        pdfVar.zzf = 0;
    }

    public static /* synthetic */ void w(pdf pdfVar, s6e s6eVar) {
        s6eVar.getClass();
        pdfVar.zzh = s6eVar;
    }

    public static /* synthetic */ void x(pdf pdfVar, sdf sdfVar) {
        pdfVar.zzg = sdfVar;
        pdfVar.zze |= 1;
    }

    public static odf y() {
        return (odf) zzc.o();
    }

    public final s6e A() {
        return this.zzh;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (qdf.a[i - 1]) {
            case 1:
                return new pdf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (pdf.class) {
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

    public final sdf z() {
        sdf sdfVar = this.zzg;
        if (sdfVar == null) {
            return sdf.B();
        }
        return sdfVar;
    }
}

package defpackage;

import java.io.ByteArrayInputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hef  reason: default package */
/* loaded from: classes.dex */
public final class hef extends m7e {
    private static final hef zzc;
    private static volatile k8e zzd;
    private int zze;
    private s6e zzf = s6e.b;
    private chf zzg;

    static {
        hef hefVar = new hef();
        zzc = hefVar;
        m7e.j(hef.class, hefVar);
    }

    public static hef t(ByteArrayInputStream byteArrayInputStream, g7e g7eVar) {
        m7e g = m7e.g(zzc, new y6e(byteArrayInputStream), g7eVar);
        m7e.l(g);
        return (hef) g;
    }

    public static /* synthetic */ void u(hef hefVar, w6e w6eVar) {
        w6eVar.getClass();
        hefVar.zzf = w6eVar;
    }

    public static /* synthetic */ void v(hef hefVar, chf chfVar) {
        hefVar.zzg = chfVar;
        hefVar.zze |= 1;
    }

    public static fef w() {
        return (fef) zzc.o();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (eef.a[i - 1]) {
            case 1:
                return new hef();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (hef.class) {
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

    public final s6e x() {
        return this.zzf;
    }
}

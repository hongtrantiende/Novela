package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hgf  reason: default package */
/* loaded from: classes.dex */
public final class hgf extends m7e {
    private static final hgf zzc;
    private static volatile k8e zzd;
    private String zze = "";
    private s6e zzf = s6e.b;
    private int zzg;

    static {
        hgf hgfVar = new hgf();
        zzc = hgfVar;
        m7e.j(hgf.class, hgfVar);
    }

    public static fgf t() {
        return (fgf) zzc.o();
    }

    public static void u(hgf hgfVar, int i) {
        int i2;
        if (i != 6) {
            switch (i) {
                case 1:
                    i2 = 0;
                    break;
                case 2:
                    i2 = 1;
                    break;
                case 3:
                    i2 = 2;
                    break;
                case 4:
                    i2 = 3;
                    break;
                case 5:
                    i2 = 4;
                    break;
                case 6:
                    i2 = -1;
                    break;
                default:
                    throw null;
            }
            hgfVar.zzg = i2;
            return;
        }
        n7e.c();
        throw null;
    }

    public static /* synthetic */ void v(hgf hgfVar, String str) {
        str.getClass();
        hgfVar.zze = str;
    }

    public static /* synthetic */ void w(hgf hgfVar, s6e s6eVar) {
        s6eVar.getClass();
        hgfVar.zzf = s6eVar;
    }

    public static hgf y() {
        return zzc;
    }

    public final String A() {
        return this.zze;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (egf.a[i - 1]) {
            case 1:
                return new hgf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (hgf.class) {
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

    public final int x() {
        int i = this.zzg;
        int i2 = 1;
        if (i != 0) {
            int i3 = 2;
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    i3 = 4;
                    if (i != 3) {
                        if (i != 4) {
                            i2 = 0;
                        } else {
                            i2 = 5;
                        }
                    }
                }
            }
            i2 = i3;
        }
        if (i2 == 0) {
            return 6;
        }
        return i2;
    }

    public final s6e z() {
        return this.zzf;
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vgf  reason: default package */
/* loaded from: classes.dex */
public final class vgf extends m7e {
    private static final vgf zzc;
    private static volatile k8e zzd;
    private int zze;
    private hgf zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    /* JADX WARN: Type inference failed for: r0v0, types: [vgf, m7e] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(vgf.class, m7eVar);
    }

    public static ugf A() {
        return (ugf) zzc.o();
    }

    public static /* synthetic */ void u(vgf vgfVar, int i) {
        vgfVar.zzh = i;
    }

    public static /* synthetic */ void v(vgf vgfVar, hgf hgfVar) {
        vgfVar.zzf = hgfVar;
        vgfVar.zze |= 1;
    }

    public static /* synthetic */ void w(vgf vgfVar, eif eifVar) {
        vgfVar.zzi = eifVar.zza();
    }

    public static /* synthetic */ void x(vgf vgfVar, int i) {
        vgfVar.zzg = eub.c(i);
    }

    public final eif B() {
        eif a = eif.a(this.zzi);
        if (a == null) {
            return eif.UNRECOGNIZED;
        }
        return a;
    }

    public final boolean C() {
        if ((this.zze & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (tgf.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (vgf.class) {
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
        return this.zzh;
    }

    public final hgf y() {
        hgf hgfVar = this.zzf;
        if (hgfVar == null) {
            return hgf.y();
        }
        return hgfVar;
    }

    public final int z() {
        int i = this.zzg;
        int i2 = 1;
        if (i != 0) {
            if (i != 1) {
                i2 = 3;
                if (i != 2) {
                    if (i != 3) {
                        i2 = 0;
                    } else {
                        i2 = 4;
                    }
                }
            } else {
                i2 = 2;
            }
        }
        if (i2 == 0) {
            return 5;
        }
        return i2;
    }
}

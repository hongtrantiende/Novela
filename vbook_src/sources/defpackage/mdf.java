package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mdf  reason: default package */
/* loaded from: classes.dex */
public final class mdf extends m7e {
    private static final mdf zzc;
    private static volatile k8e zzd;
    private int zze;
    private zdf zzf;
    private edf zzg;
    private int zzh;

    /* JADX WARN: Type inference failed for: r0v0, types: [m7e, mdf] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(mdf.class, m7eVar);
    }

    public static /* synthetic */ void u(mdf mdfVar, edf edfVar) {
        mdfVar.zzg = edfVar;
        mdfVar.zze |= 2;
    }

    public static /* synthetic */ void w(mdf mdfVar, zdf zdfVar) {
        mdfVar.zzf = zdfVar;
        mdfVar.zze |= 1;
    }

    public static kdf y() {
        return (kdf) zzc.o();
    }

    public static mdf z() {
        return zzc;
    }

    public final zdf A() {
        zdf zdfVar = this.zzf;
        if (zdfVar == null) {
            return zdf.x();
        }
        return zdfVar;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (ndf.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (mdf.class) {
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

    public final fdf t() {
        fdf fdfVar;
        int i = this.zzh;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        fdfVar = null;
                    } else {
                        fdfVar = fdf.DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
                    }
                } else {
                    fdfVar = fdf.COMPRESSED;
                }
            } else {
                fdfVar = fdf.UNCOMPRESSED;
            }
        } else {
            fdfVar = fdf.UNKNOWN_FORMAT;
        }
        if (fdfVar == null) {
            return fdf.UNRECOGNIZED;
        }
        return fdfVar;
    }

    public final edf x() {
        edf edfVar = this.zzg;
        if (edfVar == null) {
            return edf.v();
        }
        return edfVar;
    }
}

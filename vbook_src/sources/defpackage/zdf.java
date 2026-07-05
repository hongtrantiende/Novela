package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zdf  reason: default package */
/* loaded from: classes.dex */
public final class zdf extends m7e {
    private static final zdf zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private s6e zzg = s6e.b;

    static {
        zdf zdfVar = new zdf();
        zzc = zdfVar;
        m7e.j(zdf.class, zdfVar);
    }

    public static xdf t() {
        return (xdf) zzc.o();
    }

    public static /* synthetic */ void u(zdf zdfVar, s6e s6eVar) {
        s6eVar.getClass();
        zdfVar.zzg = s6eVar;
    }

    public static zdf x() {
        return zzc;
    }

    public final s6e A() {
        return this.zzg;
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (aef.a[i - 1]) {
            case 1:
                return new zdf();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (zdf.class) {
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

    public final def y() {
        def defVar;
        int i = this.zze;
        if (i != 0) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            defVar = null;
                        } else {
                            defVar = def.CURVE25519;
                        }
                    } else {
                        defVar = def.NIST_P521;
                    }
                } else {
                    defVar = def.NIST_P384;
                }
            } else {
                defVar = def.NIST_P256;
            }
        } else {
            defVar = def.UNKNOWN_CURVE;
        }
        if (defVar == null) {
            return def.UNRECOGNIZED;
        }
        return defVar;
    }

    public final lef z() {
        lef a = lef.a(this.zzf);
        if (a == null) {
            return lef.UNRECOGNIZED;
        }
        return a;
    }
}

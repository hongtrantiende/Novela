package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qff  reason: default package */
/* loaded from: classes.dex */
public final class qff extends m7e {
    private static final qff zzc;
    private static volatile k8e zzd;
    private int zze;
    private int zzf;
    private int zzg;

    /* JADX WARN: Type inference failed for: r0v0, types: [qff, m7e] */
    static {
        ?? m7eVar = new m7e();
        zzc = m7eVar;
        m7e.j(qff.class, m7eVar);
    }

    public static qff A() {
        return zzc;
    }

    public static pff z() {
        return (pff) zzc.o();
    }

    /* JADX WARN: Type inference failed for: r2v12, types: [k8e, java.lang.Object] */
    @Override // defpackage.m7e
    public final Object d(int i) {
        k8e k8eVar;
        switch (mff.a[i - 1]) {
            case 1:
                return new m7e();
            case 2:
                return new l7e(zzc);
            case 3:
                return new n8e(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                k8e k8eVar2 = zzd;
                if (k8eVar2 == null) {
                    synchronized (qff.class) {
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

    public final bff t() {
        bff bffVar;
        int i = this.zzg;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        bffVar = null;
                    } else {
                        bffVar = bff.CHACHA20_POLY1305;
                    }
                } else {
                    bffVar = bff.AES_256_GCM;
                }
            } else {
                bffVar = bff.AES_128_GCM;
            }
        } else {
            bffVar = bff.AEAD_UNKNOWN;
        }
        if (bffVar == null) {
            return bff.UNRECOGNIZED;
        }
        return bffVar;
    }

    public final gff x() {
        gff gffVar;
        int i = this.zzf;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        gffVar = null;
                    } else {
                        gffVar = gff.HKDF_SHA512;
                    }
                } else {
                    gffVar = gff.HKDF_SHA384;
                }
            } else {
                gffVar = gff.HKDF_SHA256;
            }
        } else {
            gffVar = gff.KDF_UNKNOWN;
        }
        if (gffVar == null) {
            return gff.UNRECOGNIZED;
        }
        return gffVar;
    }

    public final fff y() {
        fff fffVar;
        switch (this.zze) {
            case 0:
                fffVar = fff.KEM_UNKNOWN;
                break;
            case 1:
                fffVar = fff.DHKEM_X25519_HKDF_SHA256;
                break;
            case 2:
                fffVar = fff.DHKEM_P256_HKDF_SHA256;
                break;
            case 3:
                fffVar = fff.DHKEM_P384_HKDF_SHA384;
                break;
            case 4:
                fffVar = fff.DHKEM_P521_HKDF_SHA512;
                break;
            case 5:
                fffVar = fff.X_WING;
                break;
            case 6:
                fffVar = fff.ML_KEM768;
                break;
            case 7:
                fffVar = fff.ML_KEM1024;
                break;
            default:
                fffVar = null;
                break;
        }
        if (fffVar == null) {
            return fff.UNRECOGNIZED;
        }
        return fffVar;
    }
}

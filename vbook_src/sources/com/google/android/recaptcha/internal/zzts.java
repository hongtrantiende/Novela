package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzts extends zznd implements zzoj {
    private static final zzts zzb;
    private static volatile zzoq zzd;
    private int zze;

    static {
        zzts zztsVar = new zzts();
        zzb = zztsVar;
        zznd.zzI(zzts.class, zztsVar);
    }

    private zzts() {
    }

    public static zzts zzg(byte[] bArr) {
        return (zzts) zznd.zzx(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zznd
    public final Object zzh(int i, Object obj, Object obj2) {
        zzoq zzoqVar;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 != 6) {
                                return null;
                            }
                            zzoq zzoqVar2 = zzd;
                            if (zzoqVar2 == null) {
                                synchronized (zzts.class) {
                                    try {
                                        zzoqVar = zzd;
                                        if (zzoqVar == null) {
                                            zzoqVar = new zzmy(zzb);
                                            zzd = zzoqVar;
                                        }
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                                return zzoqVar;
                            }
                            return zzoqVar2;
                        }
                        return zzb;
                    }
                    return new zztr(null);
                }
                return new zzts();
            }
            return zznd.zzF(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zze"});
        }
        return (byte) 1;
    }

    public final zztv zzi() {
        zztv zzb2 = zztv.zzb(this.zze);
        if (zzb2 == null) {
            return zztv.UNRECOGNIZED;
        }
        return zzb2;
    }
}

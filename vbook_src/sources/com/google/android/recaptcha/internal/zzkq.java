package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public class zzkq implements zzoq {
    private static final zzmo zza;

    static {
        int i = zzmo.zzb;
        int i2 = zzos.zza;
        zza = zzmo.zza;
    }

    public zzoi zza(byte[] bArr, int i, int i2, zzmo zzmoVar) {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzoq
    public final /* synthetic */ Object zzb(byte[] bArr) {
        zzoi zza2 = zza(bArr, 0, bArr.length, zza);
        if (zza2 != null && !zza2.zzp()) {
            throw new zzpk((zzko) zza2).zza();
        }
        return zza2;
    }
}

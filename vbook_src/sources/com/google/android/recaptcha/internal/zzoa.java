package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class zzoa implements zzox {
    private static final zzog zza = new zzny();
    private final zzog zzb;

    public zzoa() {
        zzmw zza2 = zzmw.zza();
        int i = zzos.zza;
        zznz zznzVar = new zznz(zza2, zza);
        byte[] bArr = zznl.zzb;
        this.zzb = zznzVar;
    }

    @Override // com.google.android.recaptcha.internal.zzox
    public final zzow zza(Class cls) {
        zzmp zzmpVar;
        int i = zzoy.zza;
        if (!zznd.class.isAssignableFrom(cls)) {
            int i2 = zzos.zza;
        }
        zzof zzb = this.zzb.zzb(cls);
        if (!zzb.zzb()) {
            int i3 = zzos.zza;
            zzoo zza2 = zzop.zza();
            zznv zza3 = zznw.zza();
            zzpl zzm = zzoy.zzm();
            if (zzb.zzc() - 1 != 1) {
                zzmpVar = zzmr.zza();
            } else {
                zzmpVar = null;
            }
            return zzol.zzm(cls, zzb, zza2, zza3, zzm, zzmpVar, zzoe.zza());
        }
        int i4 = zzos.zza;
        return zzom.zzc(zzoy.zzm(), zzmr.zza(), zzb.zza());
    }
}

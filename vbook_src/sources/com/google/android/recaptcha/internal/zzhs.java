package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzhs implements zzgx {
    public static final zzhs zza = new zzhs();

    private zzhs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length != 2) {
            if (length == 0) {
                zzgdVar.zzc().zze(i, new zzbn());
                return;
            } else {
                hfd.f(4, 3, null);
                return;
            }
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str != null) {
            Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
            if (true != (zza3 instanceof zzbn)) {
                zza3 = null;
            }
            zzbn zzbnVar = (zzbn) zza3;
            if (zzbnVar != null) {
                byte[] zzd = zzev.zza(zzgdVar.zzb(), zzbnVar).zzd();
                zzgdVar.zzi().zzb(str, zzkh.zzh().zzi(zzd, 0, zzd.length));
                return;
            }
            hfd.f(4, 5, null);
            return;
        }
        hfd.f(4, 5, null);
    }
}

package com.google.android.recaptcha.internal;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzgm implements zzgx {
    public static final zzgm zza = new zzgm();

    private zzgm() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) {
        boolean z = true;
        if (zzueVarArr.length == 1) {
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                try {
                    try {
                        if (zza2 instanceof String) {
                            zza2 = zzgdVar.zzh().zza((String) zza2);
                        }
                        zzge zzc = zzgdVar.zzc();
                        try {
                            zzgc.zza(zza2);
                        } catch (zzce e) {
                            if (e.zzb() == 8 || e.zzb() == 6) {
                                z = false;
                            } else if (e.zzb() != 47) {
                                throw e;
                            }
                        }
                        zzc.zze(i, Boolean.valueOf(z));
                        return;
                    } catch (Exception e2) {
                        hfd.f(6, 8, e2);
                        return;
                    }
                } catch (zzce e3) {
                    throw e3;
                }
            }
            hfd.f(4, 5, null);
            return;
        }
        hfd.f(4, 3, null);
    }
}

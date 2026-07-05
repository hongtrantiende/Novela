package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzgi implements zzgx {
    public static final zzgi zza = new zzgi();

    private zzgi() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) {
        if (zzueVarArr.length == 3) {
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != Objects.nonNull(zza2)) {
                zza2 = null;
            }
            if (zza2 != null) {
                Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
                if (true != (zza3 instanceof Integer)) {
                    zza3 = null;
                }
                Integer num = (Integer) zza3;
                if (num != null) {
                    int intValue = num.intValue();
                    Object zza4 = zzgdVar.zzc().zza(zzueVarArr[2]);
                    if (true != Objects.nonNull(zza4)) {
                        zza4 = null;
                    }
                    if (zza4 != null) {
                        try {
                            Array.set(zza2, intValue, zza4);
                            return;
                        } catch (Exception e) {
                            if (e instanceof ArrayIndexOutOfBoundsException) {
                                hfd.f(4, 22, e);
                                return;
                            } else {
                                hfd.f(4, 25, e);
                                return;
                            }
                        }
                    }
                    hfd.f(4, 5, null);
                    return;
                }
                hfd.f(4, 5, null);
                return;
            }
            hfd.f(4, 5, null);
            return;
        }
        hfd.f(4, 3, null);
    }
}

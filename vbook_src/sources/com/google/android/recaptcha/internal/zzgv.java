package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzgv implements zzgx {
    public static final zzgv zza = new zzgv();

    private zzgv() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) {
        Object array;
        if (zzueVarArr.length == 2) {
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
                    try {
                        if (zza2 instanceof Integer) {
                            array = Integer.valueOf(((Number) zza2).intValue() / intValue);
                        } else if (zza2 instanceof int[]) {
                            int[] iArr = (int[]) zza2;
                            ArrayList arrayList = new ArrayList(iArr.length);
                            for (int i2 : iArr) {
                                arrayList.add(Integer.valueOf(i2 / intValue));
                            }
                            array = arrayList.toArray(new Integer[0]);
                        } else {
                            throw new zzce(4, 5, null);
                        }
                        zzgdVar.zzc().zze(i, array);
                        return;
                    } catch (ArithmeticException e) {
                        hfd.f(4, 6, e);
                        return;
                    }
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

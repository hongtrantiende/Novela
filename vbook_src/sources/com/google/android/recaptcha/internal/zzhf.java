package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzhf implements zzgx {
    public static final zzhf zza = new zzhf();

    private zzhf() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) {
        int length = zzueVarArr.length;
        if (length >= 2) {
            Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
            if (true != (zza2 instanceof Method)) {
                zza2 = null;
            }
            Method method = (Method) zza2;
            if (method != null) {
                Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
                Object[] zzg = zzgdVar.zzc().zzg(b00.D0(zzueVarArr).subList(2, length));
                try {
                    zzgdVar.zzc().zze(i, method.invoke(zza3, Arrays.copyOf(zzg, zzg.length)));
                    return;
                } catch (Exception e) {
                    hfd.f(6, 15, e);
                    return;
                }
            }
            hfd.f(4, 5, null);
            return;
        }
        hfd.f(4, 3, null);
    }
}

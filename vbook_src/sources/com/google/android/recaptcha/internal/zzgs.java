package com.google.android.recaptcha.internal;

import java.lang.reflect.Proxy;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzgs implements zzgx {
    public static final zzgs zza = new zzgs();

    private zzgs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) {
        int i2;
        int length = zzueVarArr.length;
        if (length != 4 && length != 5) {
            hfd.f(4, 3, null);
            return;
        }
        Object zza2 = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (zza2 instanceof String)) {
            zza2 = null;
        }
        String str = (String) zza2;
        if (str != null) {
            Object zza3 = zzgdVar.zzc().zza(zzueVarArr[1]);
            if (true != Objects.nonNull(zza3)) {
                zza3 = null;
            }
            if (zza3 != null) {
                Object zza4 = zzgdVar.zzc().zza(zzueVarArr[2]);
                if (true != (zza4 instanceof String)) {
                    zza4 = null;
                }
                String str2 = (String) zza4;
                if (str2 != null) {
                    String zza5 = zzgdVar.zzh().zza(str2);
                    Object zza6 = zzgdVar.zzc().zza(zzueVarArr[3]);
                    if (length == 5) {
                        Object zza7 = zzgdVar.zzc().zza(zzueVarArr[4]);
                        if (true != (zza7 instanceof Integer)) {
                            zza7 = null;
                        }
                        Integer num = (Integer) zza7;
                        if (num != null) {
                            i2 = num.intValue();
                        } else {
                            hfd.f(4, 5, null);
                            return;
                        }
                    } else {
                        i2 = -1;
                    }
                    try {
                        if (zza3 instanceof String) {
                            zza3 = zzgdVar.zzh().zza((String) zza3);
                        }
                        Class zza8 = zzgc.zza(zza3);
                        zzgdVar.zzc().zze(i, Proxy.newProxyInstance(zza8.getClassLoader(), new Class[]{zza8}, new zzfy(new zzgr(zzgdVar, str, i2), zza5, zza6)));
                        return;
                    } catch (Exception e) {
                        hfd.f(6, 20, e);
                        return;
                    }
                }
                hfd.f(4, 5, null);
                return;
            }
            hfd.f(4, 5, null);
            return;
        }
        hfd.f(4, 5, null);
    }
}

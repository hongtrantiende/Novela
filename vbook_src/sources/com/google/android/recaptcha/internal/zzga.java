package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzga extends zzfx {
    private final zzfz zza;
    private final String zzb;

    public zzga(zzfz zzfzVar, String str, Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List list;
        if (c16.i(method.getName(), this.zzb)) {
            zzfz zzfzVar = this.zza;
            if (objArr != null) {
                list = Arrays.asList(objArr);
                list.getClass();
            } else {
                list = ks3.a;
            }
            zzfzVar.zzb(list);
            return true;
        }
        return false;
    }
}

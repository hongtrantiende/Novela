package com.google.android.recaptcha.internal;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzbc {
    public static final zzbd zza(zztv zztvVar) {
        Map map;
        map = zzbd.zzb;
        zzbd zzbdVar = (zzbd) map.get(zztvVar);
        if (zzbdVar == null) {
            return new zzbd(zzbb.zza, zzba.zzaq, null);
        }
        return zzbdVar;
    }
}

package com.google.android.recaptcha.internal;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzau {
    public static final zzav zza() {
        zzav zzavVar;
        vt4 vt4Var;
        Map map;
        zzavVar = zzav.zzb;
        if (zzavVar == null) {
            vt4Var = zzav.zzd;
            zzav zzavVar2 = new zzav((Map) vt4Var.invoke(), null);
            map = zzav.zzc;
            map.clear();
            zzav.zzb = zzavVar2;
            return zzavVar2;
        }
        return zzavVar;
    }
}

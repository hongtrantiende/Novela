package com.google.android.recaptcha.internal;

import android.app.Application;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzdq extends fb6 implements vt4 {
    public static final zzdq zza = new zzdq();

    public zzdq() {
        super(0);
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = zzav.zza;
        Object zzb = zzau.zza().zzb(735120228);
        if (zzb != null) {
            return (Application) zzb;
        }
        throw new zzbd(zzbb.zzb, zzba.zzax, null);
    }
}

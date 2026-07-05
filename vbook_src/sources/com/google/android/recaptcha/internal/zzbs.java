package com.google.android.recaptcha.internal;

import android.content.Context;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzbs {
    private final vz4 zza;

    public zzbs() {
        this.zza = vz4.b;
    }

    public final int zza(Context context) {
        int b = this.zza.b(context);
        if (b != 1 && b != 3 && b != 9) {
            return 3;
        }
        return 4;
    }

    public zzbs(vz4 vz4Var) {
        this.zza = vz4Var;
    }
}

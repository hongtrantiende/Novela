package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzkk {
    public static long zza(long j, long j2) {
        boolean z;
        boolean z2 = false;
        if ((j ^ j2) < 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j + j2;
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        zzkl.zza(z | z2, "checkedAdd", j, j2);
        return j3;
    }

    public static long zzb(long j, long j2) {
        boolean z;
        boolean z2 = false;
        if ((1 ^ j) >= 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = (-1) + j;
        if ((j ^ j3) >= 0) {
            z2 = true;
        }
        zzkl.zza(z | z2, "checkedSubtract", j, 1L);
        return j3;
    }
}

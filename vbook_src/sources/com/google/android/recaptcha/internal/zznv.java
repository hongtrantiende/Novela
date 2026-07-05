package com.google.android.recaptcha.internal;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zznv {
    public static final List zza(Object obj, long j) {
        int i;
        zznk zznkVar = (zznk) zzps.zzf(obj, j);
        if (!zznkVar.zzc()) {
            int size = zznkVar.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size + size;
            }
            zznk zzd = zznkVar.zzd(i);
            zzps.zzs(obj, j, zzd);
            return zzd;
        }
        return zznkVar;
    }
}

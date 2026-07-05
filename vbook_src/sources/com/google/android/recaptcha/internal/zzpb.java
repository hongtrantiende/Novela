package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class zzpb implements Iterator {
    final /* synthetic */ zzpe zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        Map map;
        int i2 = this.zzb + 1;
        zzpe zzpeVar = this.zza;
        i = zzpeVar.zzb;
        if (i2 >= i) {
            map = zzpeVar.zzc;
            if (!map.isEmpty() && zza().hasNext()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        zzpe zzpeVar = this.zza;
        i = zzpeVar.zzb;
        if (i2 < i) {
            objArr = zzpeVar.zza;
            return (zzpa) objArr[i2];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (this.zzc) {
            this.zzc = false;
            this.zza.zzo();
            int i2 = this.zzb;
            zzpe zzpeVar = this.zza;
            i = zzpeVar.zzb;
            if (i2 < i) {
                this.zzb = i2 - 1;
                zzpeVar.zzm(i2);
                return;
            }
            zza().remove();
            return;
        }
        vs.k("remove() was called before next()");
    }
}

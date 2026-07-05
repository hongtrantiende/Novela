package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzhy {
    private List zza = ks3.a;

    public final long zza(long[] jArr) {
        Iterator it = sl1.n0(this.zza, b00.C0(jArr)).iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Long.valueOf(((Number) it.next()).longValue() ^ ((Number) next).longValue());
            }
            return ((Number) next).longValue();
        }
        xk5.q("Empty collection can't be reduced.");
        return 0L;
    }

    public final void zzb(long[] jArr) {
        this.zza = b00.C0(jArr);
    }
}

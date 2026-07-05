package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r9e  reason: default package */
/* loaded from: classes.dex */
public final class r9e implements e9e {
    @Override // defpackage.e9e
    public final e9e d(String str, odd oddVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof r9e;
    }

    @Override // defpackage.e9e
    public final e9e f() {
        return e9e.u;
    }

    @Override // defpackage.e9e
    public final String zzc() {
        return "undefined";
    }

    @Override // defpackage.e9e
    public final Double zzd() {
        return Double.valueOf(Double.NaN);
    }

    @Override // defpackage.e9e
    public final Boolean zze() {
        return Boolean.FALSE;
    }

    @Override // defpackage.e9e
    public final Iterator zzf() {
        return null;
    }
}

package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c8e  reason: default package */
/* loaded from: classes.dex */
public final class c8e implements e9e {
    @Override // defpackage.e9e
    public final e9e d(String str, odd oddVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof c8e;
    }

    @Override // defpackage.e9e
    public final e9e f() {
        return e9e.v;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.e9e
    public final String zzc() {
        return "null";
    }

    @Override // defpackage.e9e
    public final Double zzd() {
        return Double.valueOf(0.0d);
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

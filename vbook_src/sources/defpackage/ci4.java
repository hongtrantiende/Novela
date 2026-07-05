package defpackage;

import android.util.SparseBooleanArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ci4  reason: default package */
/* loaded from: classes.dex */
public final class ci4 {
    public final SparseBooleanArray a;

    public ci4(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ci4)) {
            return false;
        }
        return this.a.equals(((ci4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}

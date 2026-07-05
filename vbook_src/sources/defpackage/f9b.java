package defpackage;

import java.io.Serializable;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f9b  reason: default package */
/* loaded from: classes.dex */
public final class f9b implements c9b, Serializable {
    public final Object a;

    public f9b(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f9b) {
            return bue.g(this.a, ((f9b) obj).a);
        }
        return false;
    }

    @Override // defpackage.c9b
    public final Object get() {
        return this.a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.a + ")";
    }
}

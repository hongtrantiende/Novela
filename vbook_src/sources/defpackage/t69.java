package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t69  reason: default package */
/* loaded from: classes.dex */
public final class t69 {
    public final int a;

    public t69(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof t69)) {
            return false;
        }
        if (this.a != ((t69) obj).a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a;
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xz9  reason: default package */
/* loaded from: classes3.dex */
public final class xz9 extends d08 {
    public final wz9 a;

    public xz9(wz9 wz9Var) {
        this.a = wz9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xz9.class == obj.getClass()) {
            return c16.i(this.a, ((xz9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SceneInfo(scene=" + this.a + ")";
    }
}

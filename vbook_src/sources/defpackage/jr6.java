package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jr6  reason: default package */
/* loaded from: classes.dex */
public final class jr6 extends kr6 {
    public final tf2 a;

    public jr6(tf2 tf2Var) {
        this.a = tf2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && jr6.class == obj.getClass()) {
            return this.a.equals(((jr6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (jr6.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }
}

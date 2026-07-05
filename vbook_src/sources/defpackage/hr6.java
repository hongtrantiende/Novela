package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hr6  reason: default package */
/* loaded from: classes.dex */
public final class hr6 extends kr6 {
    public final tf2 a = tf2.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hr6.class == obj.getClass()) {
            return this.a.equals(((hr6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (hr6.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}

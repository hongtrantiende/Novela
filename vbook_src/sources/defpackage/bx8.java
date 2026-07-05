package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a(with = cx8.class)
/* renamed from: bx8  reason: default package */
/* loaded from: classes3.dex */
public final class bx8 {
    public static final ax8 Companion = new Object();
    public final yqe a;

    public bx8(yqe yqeVar) {
        this.a = yqeVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof bx8) || !this.a.equals(((bx8) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return fpe.p(this);
    }
}

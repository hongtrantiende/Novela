package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tfd  reason: default package */
/* loaded from: classes3.dex */
public final class tfd extends ufd {
    public final vyc a;

    public tfd(vyc vycVar) {
        this.a = vycVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tfd) && c16.i(this.a, ((tfd) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        vyc vycVar = this.a;
        if (vycVar == null) {
            return 0;
        }
        return vycVar.C.hashCode();
    }

    public final String toString() {
        return "Success(responseUri=" + this.a + ")";
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ta6  reason: default package */
/* loaded from: classes.dex */
public final class ta6 implements AutoCloseable {
    public final s11 a;

    public /* synthetic */ ta6(s11 s11Var) {
        this.a = s11Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        s9e.m(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ta6) {
            if (!c16.i(this.a, ((ta6) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KtorNetworkResponseBody(channel=" + this.a + ")";
    }
}

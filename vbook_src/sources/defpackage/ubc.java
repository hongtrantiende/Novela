package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ubc  reason: default package */
/* loaded from: classes.dex */
public final class ubc extends dcc {
    public final s26 d;

    public ubc() {
        super(acc.d);
        this.d = new s26(28, false);
    }

    public final void O(char c) {
        this.d.j(c);
    }

    @Override // defpackage.dcc
    public final void f() {
        this.a = -1;
        this.b = -1;
        this.d.O();
    }

    public final String toString() {
        return hl5.n("<!--", this.d.V(), "-->");
    }
}

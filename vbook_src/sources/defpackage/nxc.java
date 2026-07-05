package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nxc  reason: default package */
/* loaded from: classes.dex */
public final class nxc extends UnsupportedOperationException {
    public final mb4 a;

    public nxc(mb4 mb4Var) {
        this.a = mb4Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return "Missing ".concat(String.valueOf(this.a));
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe3  reason: default package */
/* loaded from: classes3.dex */
public final class xe3 extends IllegalStateException {
    public final String a;

    public xe3(te5 te5Var) {
        this.a = "Response already received: " + te5Var;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}

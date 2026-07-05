package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jl0  reason: default package */
/* loaded from: classes.dex */
public final class jl0 extends jr4 {
    public Exception b;

    @Override // defpackage.jr4, defpackage.osa
    public final long read(my0 my0Var, long j) {
        try {
            return super.read(my0Var, j);
        } catch (Exception e) {
            this.b = e;
            throw e;
        }
    }
}

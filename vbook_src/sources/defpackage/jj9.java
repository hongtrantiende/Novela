package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jj9  reason: default package */
/* loaded from: classes3.dex */
public final class jj9 implements aza, sj4, zu4 {
    public final /* synthetic */ aza a;
    private final w26 job;

    public jj9(bw7 bw7Var, iya iyaVar) {
        this.a = bw7Var;
        this.job = iyaVar;
    }

    @Override // defpackage.sj4
    public final Object a(tj4 tj4Var, m42 m42Var) {
        return this.a.a(tj4Var, m42Var);
    }

    @Override // defpackage.zu4
    public final sj4 c(d82 d82Var, int i, py0 py0Var) {
        if ((((i >= 0 && i < 2) || i == -2) && py0Var == py0.b) || ((i == 0 || i == -3) && py0Var == py0.a)) {
            return this;
        }
        return new za1(this, d82Var, i, py0Var);
    }

    @Override // defpackage.aza
    public final Object getValue() {
        return this.a.getValue();
    }
}

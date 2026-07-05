package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: und  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class und implements ao6, uu4 {
    public final /* synthetic */ px1 a;

    public und(px1 px1Var) {
        this.a = px1Var;
    }

    @Override // defpackage.uu4
    public final hu4 a() {
        return new wu4(1, 0, px1.class, this.a, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ao6) || !(obj instanceof uu4)) {
            return false;
        }
        return c16.i(a(), ((uu4) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}

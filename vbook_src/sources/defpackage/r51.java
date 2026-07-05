package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r51  reason: default package */
/* loaded from: classes.dex */
public final class r51 extends n3 {
    public final /* synthetic */ s51 D;

    public r51(s51 s51Var) {
        this.D = s51Var;
    }

    @Override // defpackage.n3
    public final String h() {
        p51 p51Var = (p51) this.D.a.get();
        if (p51Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + p51Var.a + "]";
    }
}

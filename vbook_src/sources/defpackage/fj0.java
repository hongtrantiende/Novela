package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fj0  reason: default package */
/* loaded from: classes.dex */
public final class fj0 implements l88 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytb b;

    public /* synthetic */ fj0(ytb ytbVar, int i) {
        this.a = i;
        this.b = ytbVar;
    }

    @Override // defpackage.l88
    public final long b() {
        int i = this.a;
        ytb ytbVar = this.b;
        switch (i) {
            case 0:
                return ytbVar.j(true).b;
            case 1:
                return ytbVar.p(true, true).b;
            default:
                return ytbVar.p(false, true).b;
        }
    }
}

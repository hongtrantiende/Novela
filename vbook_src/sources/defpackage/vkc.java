package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vkc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vkc implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tkc b;

    public /* synthetic */ vkc(tkc tkcVar, int i) {
        this.a = i;
        this.b = tkcVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        tkc tkcVar = this.b;
        ib3 ib3Var = (ib3) obj;
        switch (i) {
            case 0:
                return new wkc(tkcVar, 0);
            default:
                return new wkc(tkcVar, 1);
        }
    }
}

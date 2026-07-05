package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kj0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kj0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kvb b;

    public /* synthetic */ kj0(kvb kvbVar, int i) {
        this.a = i;
        this.b = kvbVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        ps psVar;
        int i = this.a;
        boolean z = false;
        kvb kvbVar = this.b;
        switch (i) {
            case 0:
                if (kvbVar != null) {
                    z = ((Boolean) new kj0(kvbVar, 2).invoke()).booleanValue();
                }
                return Boolean.valueOf(z);
            case 1:
                if (kvbVar != null) {
                    z = ((Boolean) new kj0(kvbVar, 2).invoke()).booleanValue();
                }
                return Boolean.valueOf(z);
            default:
                ps psVar2 = kvbVar.b;
                fvb fvbVar = (fvb) kvbVar.a.getValue();
                if (fvbVar != null) {
                    psVar = fvbVar.a.a;
                } else {
                    psVar = null;
                }
                return Boolean.valueOf(c16.i(psVar2, psVar));
        }
    }
}

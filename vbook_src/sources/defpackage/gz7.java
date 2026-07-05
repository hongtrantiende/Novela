package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gz7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gz7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tkc b;

    public /* synthetic */ gz7(tkc tkcVar, int i) {
        this.a = i;
        this.b = tkcVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        tkc tkcVar = this.b;
        switch (i) {
            case 0:
                if (tkcVar.h.h() == Long.MIN_VALUE) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (c16.i(tkcVar.d.getValue(), tkcVar.a.z()) && tkcVar.h.h() == Long.MIN_VALUE && !((Boolean) tkcVar.i.getValue()).booleanValue()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                return Long.valueOf(tkcVar.b());
        }
    }
}

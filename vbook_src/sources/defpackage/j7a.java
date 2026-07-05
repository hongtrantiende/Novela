package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j7a  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j7a implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7a b;

    public /* synthetic */ j7a(k7a k7aVar, int i) {
        this.a = i;
        this.b = k7aVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        k7a k7aVar = this.b;
        switch (i) {
            case 0:
                return Long.valueOf(k7aVar.N);
            case 1:
                return (sc6) k7aVar.O.invoke();
            case 2:
                return Long.valueOf(k7aVar.N);
            default:
                return (sc6) k7aVar.O.invoke();
        }
    }
}

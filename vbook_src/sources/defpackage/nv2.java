package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nv2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nv2 implements c9b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nv2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.c9b
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    return (d67) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    p1a.n(e);
                    return null;
                }
            default:
                return (w04) obj;
        }
    }
}

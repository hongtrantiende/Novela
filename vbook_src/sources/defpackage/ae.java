package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ae  reason: default package */
/* loaded from: classes.dex */
public final class ae implements i2a {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ae(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.i2a
    public final float a(float f) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ce ceVar = (ce) obj2;
                float c = ceVar.f0.c(f);
                float h = c - ceVar.f0.f.h();
                ((le) obj).a(c, nae.e);
                return h;
            default:
                t3a t3aVar = (t3a) obj2;
                if (Math.abs(f) == nae.e || ((Boolean) t3aVar.h.invoke()).booleanValue()) {
                    return t3aVar.e(t3aVar.h(((s3a) obj).a(2, t3aVar.f(t3aVar.i(f)))));
                }
                throw new nx8("The fling animation was cancelled", 0);
        }
    }
}

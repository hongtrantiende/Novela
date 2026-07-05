package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gxa  reason: default package */
/* loaded from: classes.dex */
public final class gxa implements lf4 {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ gxa(Object obj, int i) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.xr
    public final o4d a(drc drcVar) {
        js jsVar;
        Object obj = this.c;
        if (obj == null) {
            jsVar = null;
        } else {
            jsVar = (js) drcVar.a.invoke(obj);
        }
        return new bp9(this.a, this.b, jsVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gxa) {
            gxa gxaVar = (gxa) obj;
            if (gxaVar.a == this.a && gxaVar.b == this.b && c16.i(gxaVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return Float.hashCode(this.b) + nk2.d(this.a, i * 31, 31);
    }

    public gxa(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }
}

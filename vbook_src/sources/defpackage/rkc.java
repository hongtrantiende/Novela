package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rkc  reason: default package */
/* loaded from: classes.dex */
public final class rkc implements qkc {
    public final Object a;
    public final Object b;

    public rkc(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.qkc
    public final Object d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qkc) {
            qkc qkcVar = (qkc) obj;
            if (c16.i(this.a, qkcVar.d()) && c16.i(this.b, qkcVar.f())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.qkc
    public final Object f() {
        return this.b;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return i3 + i2;
    }
}

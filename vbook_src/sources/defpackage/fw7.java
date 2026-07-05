package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fw7  reason: default package */
/* loaded from: classes3.dex */
public final class fw7 extends c3e {
    public final hm8 b;
    public final hm8 c;

    public fw7(Object obj) {
        super(11);
        this.b = yae.z(obj);
        this.c = yae.z(obj);
    }

    @Override // defpackage.c3e
    public final Object B() {
        return this.c.getValue();
    }

    @Override // defpackage.c3e
    public final void I(Object obj) {
        this.b.setValue(obj);
    }

    public final boolean Y() {
        if (c16.i(this.b.getValue(), this.c.getValue()) && !((Boolean) ((hm8) this.a).getValue()).booleanValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.c3e
    public final Object z() {
        return this.b.getValue();
    }

    @Override // defpackage.c3e
    public final void L() {
    }

    @Override // defpackage.c3e
    public final void K(tkc tkcVar) {
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u4  reason: default package */
/* loaded from: classes.dex */
public final class u4 implements oa4 {
    public final /* synthetic */ int a;
    public final Object b;

    public u4(Boolean bool, we0 we0Var) {
        this.a = 1;
        this.b = bool;
    }

    public Object a() {
        if (am8.d == null) {
            am8.d = new e60(25);
        }
        synchronized (am8.c) {
        }
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    @Override // defpackage.k99
    public Object get() {
        return this.b;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ObservableProperty(value=" + this.b + ')';
            default:
                return super.toString();
        }
    }

    public /* synthetic */ u4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}

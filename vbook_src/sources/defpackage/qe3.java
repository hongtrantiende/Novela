package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qe3  reason: default package */
/* loaded from: classes3.dex */
public final class qe3 implements a63 {
    public final pe3 a;
    public final String[] b;

    public qe3(pe3 pe3Var, String[] strArr) {
        this.a = pe3Var;
        this.b = strArr;
    }

    @Override // defpackage.a63
    public final Object a(CharSequence charSequence, String str) {
        charSequence.getClass();
        str.getClass();
        int a = this.a.a(0, 0, charSequence);
        if (a >= 0) {
            this.b[a] = str;
            return str;
        }
        return null;
    }

    @Override // defpackage.a63
    public final Object b(int i, int i2, String str) {
        str.getClass();
        int a = this.a.a(i, i2, str);
        if (a >= 0) {
            return this.b[a];
        }
        return null;
    }

    @Override // defpackage.a63
    public final Object c(CharSequence charSequence) {
        charSequence.getClass();
        int a = this.a.a(0, 0, charSequence);
        if (a >= 0) {
            this.b[a] = null;
        }
        return null;
    }

    @Override // defpackage.a63
    public final int size() {
        return this.b.length;
    }

    @Override // defpackage.a63
    public final void clear() {
    }
}

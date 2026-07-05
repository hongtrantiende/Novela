package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zba  reason: default package */
/* loaded from: classes.dex */
public final class zba implements un3 {
    public final ps a;
    public final int b;

    public zba(String str, int i) {
        this.a = new ps(str);
        this.b = i;
    }

    @Override // defpackage.un3
    public final void a(lu0 lu0Var) {
        int length;
        int i = lu0Var.d;
        ps psVar = this.a;
        int i2 = -1;
        if (i != -1) {
            int i3 = lu0Var.e;
            String str = psVar.b;
            String str2 = psVar.b;
            lu0Var.f(i, i3, str);
            if (str2.length() > 0) {
                lu0Var.g(i, str2.length() + i);
            }
        } else {
            int i4 = lu0Var.b;
            int i5 = lu0Var.c;
            String str3 = psVar.b;
            String str4 = psVar.b;
            lu0Var.f(i4, i5, str3);
            if (str4.length() > 0) {
                lu0Var.g(i4, str4.length() + i4);
            }
        }
        int i6 = lu0Var.b;
        int i7 = lu0Var.c;
        if (i6 == i7) {
            i2 = i7;
        }
        int i8 = this.b;
        if (i8 > 0) {
            length = (i2 + i8) - 1;
        } else {
            length = (i2 + i8) - psVar.b.length();
        }
        int n = dce.n(length, 0, ((cw) lu0Var.f).e());
        lu0Var.h(n, n);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zba)) {
            return false;
        }
        zba zbaVar = (zba) obj;
        if (c16.i(this.a.b, zbaVar.a.b) && this.b == zbaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.b.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return s21.k("SetComposingTextCommand(text='", this.b, this.a.b, "', newCursorPosition=", ")");
    }
}

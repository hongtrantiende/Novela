package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lsb  reason: default package */
/* loaded from: classes.dex */
public final class lsb {
    public static final u28 f = new u28(6);
    public final mkc a;
    public final oyb b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public lsb(mkc mkcVar, oyb oybVar, boolean z, boolean z2, boolean z3) {
        this.a = mkcVar;
        this.b = oybVar;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NonMeasureInputs(textFieldState=");
        sb.append(this.a);
        sb.append(", textStyle=");
        sb.append(this.b);
        sb.append(", singleLine=");
        rs8.z(sb, this.c, ", softWrap=", this.d, ", isKeyboardTypePhone=");
        return rs8.m(")", sb, this.e);
    }
}

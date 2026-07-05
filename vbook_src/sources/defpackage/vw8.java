package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vw8  reason: default package */
/* loaded from: classes3.dex */
public final class vw8 implements ym8 {
    public final String a;

    public vw8(String str) {
        str.getClass();
        this.a = str;
        if (str.length() > 0) {
            if (!jqe.t(str.charAt(0))) {
                if (!jqe.t(str.charAt(str.length() - 1))) {
                    return;
                }
                p1a.k(hl5.n("String '", str, "' ends with a digit"));
                throw null;
            }
            p1a.k(hl5.n("String '", str, "' starts with a digit"));
            throw null;
        }
        vs.m("Empty string is not allowed");
        throw null;
    }

    @Override // defpackage.ym8
    public final Object a(b72 b72Var, final String str, final int i) {
        String str2 = this.a;
        if (str2.length() + i > str.length()) {
            return new mm8(i, new u76(this, 23));
        }
        int length = str2.length();
        for (final int i2 = 0; i2 < length; i2++) {
            if (str.charAt(i + i2) != str2.charAt(i2)) {
                return new mm8(i, new vt4() { // from class: uw8
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        StringBuilder sb = new StringBuilder("Expected ");
                        sb.append(vw8.this.a);
                        sb.append(" but got ");
                        int i3 = i;
                        sb.append(str.subSequence(i3, i2 + i3 + 1).toString());
                        return sb.toString();
                    }
                });
            }
        }
        return Integer.valueOf(str2.length() + i);
    }

    public final String toString() {
        return s21.p(new StringBuilder("'"), this.a, '\'');
    }
}

package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zka  reason: default package */
/* loaded from: classes3.dex */
public final class zka implements ym8 {
    public final el7 a;
    public final String b;

    public zka(el7 el7Var, String str) {
        this.a = el7Var;
        this.b = str;
    }

    @Override // defpackage.ym8
    public final Object a(b72 b72Var, String str, int i) {
        if (i >= str.length()) {
            return Integer.valueOf(i);
        }
        final char charAt = str.charAt(i);
        el7 el7Var = this.a;
        if (charAt == '-') {
            el7Var.invoke(b72Var, Boolean.TRUE);
            return Integer.valueOf(i + 1);
        } else if (charAt == '+') {
            el7Var.invoke(b72Var, Boolean.FALSE);
            return Integer.valueOf(i + 1);
        } else {
            return new mm8(i, new vt4() { // from class: yka
                @Override // defpackage.vt4
                public final Object invoke() {
                    return "Expected " + zka.this.b + " but got " + charAt;
                }
            });
        }
    }

    public final String toString() {
        return this.b;
    }
}

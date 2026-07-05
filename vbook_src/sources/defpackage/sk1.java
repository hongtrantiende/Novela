package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sk1  reason: default package */
/* loaded from: classes3.dex */
public final class sk1 {
    public final hm8 b;
    public final hm8 a = yae.z(false);
    public final t6f c = new t6f(this, new u0(this, 13));
    public final h23 d = yae.q(new vt4(this) { // from class: rk1
        public final /* synthetic */ sk1 b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            int i;
            int i2 = r2;
            int i3 = 0;
            sk1 sk1Var = this.b;
            switch (i2) {
                case 0:
                    String a = sk1Var.a();
                    i = 0;
                    while (i3 < a.length()) {
                        if (a.charAt(i3) == '\n') {
                            i++;
                        }
                        i3++;
                    }
                    break;
                default:
                    String a2 = sk1Var.a();
                    int b = sk1Var.b();
                    int length = sk1Var.a().length();
                    if (b > length) {
                        b = length;
                    }
                    String substring = a2.substring(0, b);
                    i = 0;
                    while (i3 < substring.length()) {
                        if (substring.charAt(i3) == '\n') {
                            i++;
                        }
                        i3++;
                    }
                    break;
            }
            return Integer.valueOf(i + 1);
        }
    });
    public final h23 e = yae.q(new vt4(this) { // from class: rk1
        public final /* synthetic */ sk1 b;

        {
            this.b = this;
        }

        @Override // defpackage.vt4
        public final Object invoke() {
            int i;
            int i2 = r2;
            int i3 = 0;
            sk1 sk1Var = this.b;
            switch (i2) {
                case 0:
                    String a = sk1Var.a();
                    i = 0;
                    while (i3 < a.length()) {
                        if (a.charAt(i3) == '\n') {
                            i++;
                        }
                        i3++;
                    }
                    break;
                default:
                    String a2 = sk1Var.a();
                    int b = sk1Var.b();
                    int length = sk1Var.a().length();
                    if (b > length) {
                        b = length;
                    }
                    String substring = a2.substring(0, b);
                    i = 0;
                    while (i3 < substring.length()) {
                        if (substring.charAt(i3) == '\n') {
                            i++;
                        }
                        i3++;
                    }
                    break;
            }
            return Integer.valueOf(i + 1);
        }
    });

    public sk1(int i) {
        this.b = yae.z(new jub("", sze.a(i, i), 4));
    }

    public final String a() {
        return ((jub) this.b.getValue()).a.b;
    }

    public final int b() {
        long j = ((jub) this.b.getValue()).b;
        int i = fxb.c;
        return (int) (j >> 32);
    }

    public final void c(String str) {
        str.getClass();
        int b = b();
        String a = a();
        char[] cArr = {' ', '\n', '\t', '(', ')', '{', '}', '[', ']', '.', ',', ';', ':', '\"', '\'', '<', '>', '='};
        int i = b - 1;
        if (i < 0) {
            i = 0;
        }
        int n0 = k4b.n0(a, cArr, i) + 1;
        String a2 = a();
        String o = eub.o(k4b.L0(n0, a2), str, a2.substring(b));
        int length = str.length() + n0;
        this.c.g(new jf4(a2.substring(n0, b), n0, b, str));
        this.b.setValue(new jub(o, sze.a(length, length), 4));
    }
}

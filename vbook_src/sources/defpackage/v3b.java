package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v3b  reason: default package */
/* loaded from: classes3.dex */
public class v3b extends z1 {
    public final String C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3b(String str, a46 a46Var) {
        super(a46Var);
        str.getClass();
        this.C = str;
    }

    @Override // defpackage.z1
    public boolean d() {
        int i = this.b;
        if (i == -1) {
            return false;
        }
        while (true) {
            String str = this.C;
            if (i < str.length()) {
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.b = i;
                    return z1.u(charAt);
                }
                i++;
            } else {
                this.b = i;
                return false;
            }
        }
    }

    @Override // defpackage.z1
    public final String f() {
        String str;
        i('\"');
        int i = this.b;
        String str2 = this.C;
        int f0 = k4b.f0(str2, '\"', i, 4);
        if (f0 == -1) {
            m();
            int i2 = this.b;
            if (i2 != str2.length() && i2 >= 0) {
                str = String.valueOf(str2.charAt(i2));
            } else {
                str = "EOF";
            }
            z1.r(this, hl5.n("Expected quotation mark '\"', but had '", str, "' instead"), i2, null, 4);
            throw null;
        }
        for (int i3 = i; i3 < f0; i3++) {
            if (str2.charAt(i3) == '\\') {
                return l(this.b, i3, str2);
            }
        }
        this.b = f0 + 1;
        return str2.substring(i, f0);
    }

    @Override // defpackage.z1
    public byte g() {
        String str;
        int i = this.b;
        while (true) {
            str = this.C;
            if (i == -1 || i >= str.length()) {
                break;
            }
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.b = i2;
                return pbe.f(charAt);
            }
            i = i2;
        }
        this.b = str.length();
        return (byte) 10;
    }

    @Override // defpackage.z1
    public void i(char c) {
        int i = this.b;
        if (i == -1) {
            E(c);
            throw null;
        }
        while (true) {
            String str = this.C;
            if (i < str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.b = i2;
                    if (charAt == c) {
                        return;
                    }
                    E(c);
                    throw null;
                }
                i = i2;
            } else {
                this.b = -1;
                E(c);
                throw null;
            }
        }
    }

    @Override // defpackage.z1
    public final CharSequence t() {
        return this.C;
    }

    @Override // defpackage.z1
    public final String v(String str, boolean z) {
        str.getClass();
        int i = this.b;
        try {
            if (g() == 6 && c16.i(x(z), str)) {
                this.c = null;
                if (g() == 5) {
                    return x(z);
                }
            }
            return null;
        } finally {
            this.b = i;
            this.c = null;
        }
    }

    @Override // defpackage.z1
    public final int y(int i) {
        if (i < this.C.length()) {
            return i;
        }
        return -1;
    }

    @Override // defpackage.z1
    public int z() {
        char charAt;
        int i = this.b;
        if (i == -1) {
            return i;
        }
        while (true) {
            String str = this.C;
            if (i >= str.length() || !((charAt = str.charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i++;
        }
        this.b = i;
        return i;
    }
}
